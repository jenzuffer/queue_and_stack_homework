package Edges;

public class EdgeImpl implements Edge {

    private int v;
    private int e;
    private float w;


    public EdgeImpl(int v, int e, float w) {
        this.v = v;
        this.e = e;
        this.w = w;
    }

    @Override
    public int either() {
        return v;
    }

    @Override
    public int other(int v) {
        if (v == this.v) return this.e;
        else if (v == this.e) return this.v;
        return 0;
    }

    @Override
    public float getWeight() {
        return w;
    }

    @Override
    public int compareTo(Edge o) {
        if (this.getWeight() < o.getWeight()) return -1;
        else if (this.getWeight() > o.getWeight()) return +1;
        else return 0;
    }
}
