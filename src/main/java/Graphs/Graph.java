package Graphs;

public interface Graph {

    int getV();
    int getE();
    void addEdge(int vertex1, int vertex2);
    void adj(int vertex);

}
