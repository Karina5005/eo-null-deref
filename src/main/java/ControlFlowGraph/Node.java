package ControlFlowGraph;

import java.util.ArrayList;

public class Node {
    private ArrayList<Node> children = new ArrayList<>();
    private String statement;

    public Node(ArrayList<Node> children, String statement) {
        this.children = children;
        this.statement = statement;
    }
}
