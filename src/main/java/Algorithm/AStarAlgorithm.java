package Algorithm;

import Graphs.Graph;
import Graphs.ManhattenGraph;

public class AStarAlgorithm {

    private Graph graph;
    private int startNode;
    private int targetNode;
    private Heuristic heuristic;

    public AStarAlgorithm(AstarProblem astarProblem) {
        this.graph = astarProblem.getGraph();
        this.startNode = astarProblem.getStartNode();
        this.targetNode = astarProblem.getTargetNode();
        this.heuristic = astarProblem.getHeuristic();

    }


}
