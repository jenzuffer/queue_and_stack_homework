package Graphs;

import Edges.Edge;

public interface Graph {

    int getV();
    int getE();
    Iterable<Edge> adj(int v);
    Iterable<Edge> edges();

}
