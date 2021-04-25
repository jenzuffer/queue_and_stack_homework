package Algorithm;

import Edges.Edge;
import Graphs.EdgeWeightedGraph;
import Queues.IndexMinPQ;
import Queues.QueueImpl;

public class LazyPrimMst {
    private boolean[] marked;          // MST vertices
    private QueueImpl<Edge> mst;         // MST edges
    private IndexMinPQ<Edge> pq;            // crossing (and ineligible) edge

    public LazyPrimMst(EdgeWeightedGraph G) {
        this.pq = new IndexMinPQ<Edge>(G.V());
        this.marked = new boolean[G.V()];
        this.mst = new QueueImpl<>();
        visit(G, 0);

        System.out.println("reached  while (!this.pq.isEmpty())");
        // assumes G is connected (see Exercise 4.3.22)
        while (!this.pq.isEmpty()) {
            Edge e = this.pq.delMin();
            // Get lowest-weight
            int v = e.either(), w = e.other(v);
            //    edge from pq.
            if (this.marked[v] && this.marked[w]) continue;
            // Skip if ineligible.
            this.mst.enqueue(e);
            if (!this.marked[v]) visit(G, v);
            // Add vertex to tree
            if (!this.marked[w]) visit(G, w);
            //   (either v or w).
        }
    }

    private void visit(EdgeWeightedGraph G, int v) {
        marked[v] = true;
        for (Edge e : G.adj(v)) {

            System.out.println("Edge: " + e.getWeight());
            if (!marked[e.other(v)]) pq.insert(e);
        }
    }

    public Iterable<Edge> edges() {
        //System.out.println("edges: " + this.mst);
        return this.mst;
    }

}
