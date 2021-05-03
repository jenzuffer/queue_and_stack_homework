package Edges;

public interface Edge extends Comparable<Edge>{
    int from();
    int to(int v);
    float Weight();
}
