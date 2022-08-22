package ControlFlowGraph;

import java.util.ArrayList;

public class ControlFlowGraphNode {
    private ArrayList<ControlFlowGraphNode> children = new ArrayList<>();
    private String base;
    private String name;

    public ControlFlowGraphNode(ArrayList<ControlFlowGraphNode> children, String base, String name) {
        this.children = children;
        this.base = base;
        this.name = name;
    }

    public void addChild(ControlFlowGraphNode child) {
        children.add(child);
    }

    public void print(String tab) {
        System.out.println(tab + "Base: " + base + ", Name: " + name);
        if (children.isEmpty()) return;
        System.out.println(tab + "Children:");
        for (ControlFlowGraphNode child : children) {
            child.print(tab + "\t");
        }
    }
}
