package Algorithm;

import Graphs.Graph;

public class Aproblem implements AstarProblem{
    private Graph graph;
    private int startNode;
    private int targetNode;
    private Heuristic heuristic;

    public Aproblem(Graph graph, int startNode, int targetNode, Heuristic heuristic) {
        this.graph = graph;
        this.startNode = startNode;
        this.targetNode = targetNode;
        this.heuristic = heuristic;
    }

    @Override
    public Graph getGraph() {
        return graph;
    }

    @Override
    public int getStartNode() {
        return startNode;
    }

    @Override
    public int getTargetNode() {
        return targetNode;
    }

    @Override
    public Heuristic getHeuristic() {
        return heuristic;
    }
}
