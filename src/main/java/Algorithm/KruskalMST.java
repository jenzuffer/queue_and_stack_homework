package Algorithm;

import Edges.EdgeImpl2;
import Graphs.EdgeWeightedGraph2;
import Queues.Queue;
import custom.In;
import custom.StdOut;

import java.util.Arrays;

public class KruskalMST {

    private static final double FLOATING_POINT_EPSILON = 1E-12;

    private double weight;                        // weight of MST
    private Queue<EdgeImpl2> mst = new Queue<EdgeImpl2>();  // edges in MST

    /**
     * Compute a minimum spanning tree (or forest) of an edge-weighted graph.
     *
     * @param G the edge-weighted graph
     */
    public KruskalMST(EdgeWeightedGraph2 G) {

        // create array of edges, sorted by weight
        EdgeImpl2[] edges = new EdgeImpl2[G.E()];
        int t = 0;
        for (EdgeImpl2 e : G.edges()) {
            edges[t++] = e;
        }
        Arrays.sort(edges);

        // run greedy algorithm
        UF uf = new UF(G.V());
        for (int i = 0; i < G.E() && mst.size() < G.V() - 1; i++) {
            EdgeImpl2 e = edges[i];
            int v = e.either();
            int w = e.other(v);

            // v-w does not create a cycle
            if (uf.find(v) != uf.find(w)) {
                uf.union(v, w);     // merge v and w components
                mst.enqueue(e);     // add edge e to mst
                weight += e.weight();
            }
        }

        // check optimality conditions
        assert check(G);
    }

    /**
     * Returns the edges in a minimum spanning tree (or forest).
     *
     * @return the edges in a minimum spanning tree (or forest) as
     * an iterable of edges
     */
    public Iterable<EdgeImpl2> edges() {
        return mst;
    }

    /**
     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
     *
     * @return the sum of the edge weights in a minimum spanning tree (or forest)
     */
    public double weight() {
        return weight;
    }

    // check optimality conditions (takes time proportional to E V lg* V)
    private boolean check(EdgeWeightedGraph2 G) {

        // check total weight
        double total = 0.0;
        for (EdgeImpl2 e : edges()) {
            total += e.weight();
        }
        if (Math.abs(total - weight()) > FLOATING_POINT_EPSILON) {
            System.err.printf("Weight of edges does not equal weight(): %f vs. %f\n", total, weight());
            return false;
        }

        // check that it is acyclic
        UF uf = new UF(G.V());
        for (EdgeImpl2 e : edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.find(v) == uf.find(w)) {
                System.err.println("Not a forest");
                return false;
            }
            uf.union(v, w);
        }

        // check that it is a spanning forest
        for (EdgeImpl2 e : G.edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.find(v) != uf.find(w)) {
                System.err.println("Not a spanning forest");
                return false;
            }
        }

        // check that it is a minimal spanning forest (cut optimality conditions)
        for (EdgeImpl2 e : edges()) {

            // all edges in MST except e
            uf = new UF(G.V());
            for (EdgeImpl2 f : mst) {
                int x = f.either(), y = f.other(x);
                if (f != e) uf.union(x, y);
            }

            // check that e is min weight edge in crossing cut
            for (EdgeImpl2 f : G.edges()) {
                int x = f.either(), y = f.other(x);
                if (uf.find(x) != uf.find(y)) {
                    if (f.weight() < e.weight()) {
                        System.err.println("Edge " + f + " violates cut optimality conditions");
                        return false;
                    }
                }
            }

        }

        return true;
    }


    /**

     public static void main(String[] args) {
     In in = new In(args[0]);
     EdgeWeightedGraph2 G = new EdgeWeightedGraph2(in);
     KruskalMST mst = new KruskalMST(G);
     for (EdgeImpl2 e : mst.edges()) {
     StdOut.println(e);
     }
     StdOut.printf("%.5f\n", mst.weight());
     }
     */
}
