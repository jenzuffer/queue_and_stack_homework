package Algorithm;

import Graphs.Graph;

public interface AstarProblem {
    Graph getGraph();
    int getStartNode();
    int getTargetNode();
    Heuristic getHeuristic();
}