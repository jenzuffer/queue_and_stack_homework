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
    public int from() {
        return v;
    }

    @Override
    public int to(int v) {
        if (v == this.v) return this.e;
        else if (v == this.e) return this.v;
        return 0;
    }

    @Override
    public float Weight() {
        return w;
    }

    @Override
    public int compareTo(Edge o) {
        if (this.Weight() < o.Weight()) return -1;
        else if (this.Weight() > o.Weight()) return +1;
        else return 0;
    }
}
