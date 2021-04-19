

public class LazyPrimMst {
    private boolean[] marked;          // MST vertices
    private QueueImpl<Edge> mst;           // MST edges
    private MaxPQ<Edge> pq;            // crossing (and ineligible) edge

    public LazyPrimMst(EdgeWeightedGraph G) {
        pq = new MaxPQ<Edge>(10);
        marked = new boolean[G.V()];
        mst = new QueueImpl<>();
        visit(G, 0);
        // assumes G is connected (see Exercise 4.3.22)
        while (!pq.isEmpty()) {
            Edge e = pq.delMin();
            // Get lowest-weight
            int v = e.either(), w = e.other(v);
            //    edge from pq.
            if (marked[v] && marked[w]) continue;
            // Skip if ineligible.
            mst.enqueue(e);
            if (!marked[v]) visit(G, v);
            // Add vertex to tree
            if (!marked[w]) visit(G, w);
            //   (either v or w).
        }
    }

    private void visit(EdgeWeightedGraph G, int v) {
        // Mark v and add to pq all edges from v to unmarked vertices.
        marked[v] = true;
        for (Edge e : G.adj(v))
            if (!marked[e.other(v)]) pq.insert(e);
    }

    public Iterable<Edge> edges() {
        return mst;
    }
}
