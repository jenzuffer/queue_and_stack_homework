public interface Graph {

    int getV();
    int getE();
    void addEdge(int vertex1, int vertex2);
    Iterable<Integer> adj(int vertex);

}
