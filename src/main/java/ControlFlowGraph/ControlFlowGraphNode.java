package ControlFlowGraph;

import java.util.ArrayList;

public class ControlFlowGraphNode {
    private ArrayList<ControlFlowGraphNode> children = new ArrayList<>();
    private String statement;

    public ControlFlowGraphNode(ArrayList<ControlFlowGraphNode> children, String statement) {
        this.children = children;
        this.statement = statement;
    }

    public void addChild(ControlFlowGraphNode child) {
        children.add(child);
    }
}
