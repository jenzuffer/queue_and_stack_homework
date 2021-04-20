

public class LazyPrimMst {
    private boolean[] marked;          // MST vertices
    private QueueImpl<Edge> mst;         // MST edges
    private IndexMinPQ<Edge> pq;            // crossing (and ineligible) edge

    public LazyPrimMst(EdgeWeightedGraph G) {
        this.pq = new IndexMinPQ<Edge>(G.V());
        this.marked = new boolean[G.V()];
        this.mst = new QueueImpl<>();
        visit(G, 0);
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
        // Mark v and add to pq all edges from v to unmarked vertices.
        this.marked[v] = true;
        for (Edge e : G.adj(v))
            if (!this.marked[e.other(v)]) this.pq.insert(v, e);
    }

    public Iterable<Edge> edges() {
        //System.out.println("edges: " + this.mst);
        return  this.mst;
    }

}
