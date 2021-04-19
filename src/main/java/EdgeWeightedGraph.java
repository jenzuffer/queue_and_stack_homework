public class EdgeWeightedGraph implements Edge {
    private int V;
    // number of vertices
    private int E;
    // number of edges
    private Bag<Edge>[] adj;

    // adjacency lists
    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) adj[v] = new Bag<Edge>();
    }

    // See Exercise 4.3.9.
    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public Iterable<Edge> edges() {
        Bag<Edge> b = new Bag<Edge>();
        for (int v = 0; v < V; v++) for (Edge e : adj[v]) if (e.other(v) > v) b.add(e);
        return b;
    }

    @Override
    public int either() {
        return V;
    }

    @Override
    public int other(int v) {
        if (v == V) return E;
        else if (v == E) return V;
        return 0;
    }

    @Override
    public float getWeight() {
        return 0;
    }

    @Override
    public int compareTo(Edge o) {
        return 0;
    }

    public String toString() {
        return String.format("%d-%d %.2f", V, E);
    }
}
