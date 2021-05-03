package Algorithm;

public class Heuristicclass implements Heuristic{

    @Override
    public float h(int a, int b) {
        return (float) a + b;
    }
}
