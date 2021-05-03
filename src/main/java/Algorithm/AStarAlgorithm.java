package Algorithm;

import Graphs.Graph;
import Graphs.ManhattenGraph;

public class AStarAlgorithm implements ManhattenGraph {
    private Graph graph;
    private int startNode;
    private int targetNode;
    private Heuristic heuristic;

    public AStarAlgorithm(Graph graph, int startNode, int targetNode, Heuristic heuristic) {
        this.graph = graph;
        this.startNode = startNode;
        this.targetNode = targetNode;
        this.heuristic = heuristic;
    }

    @Override
    public int width() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int get(int x, int y) {
        return 0;
    }
}
