public interface Edge extends Comparable<Edge>{
    int either();
    int other(int v);
    float getWeight();
}
