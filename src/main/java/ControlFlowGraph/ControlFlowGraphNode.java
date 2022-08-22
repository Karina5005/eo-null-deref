package ControlFlowGraph;

import java.util.ArrayList;

public class ControlFlowGraphNode {
    private ArrayList<ControlFlowGraphNode> children = new ArrayList<>();
    private String base = null;
    private String name = null;
    private ControlFlowGraphNode baseNode;

    public ControlFlowGraphNode(ArrayList<ControlFlowGraphNode> children, String base, String name) {
        this.children = children;
        this.base = base;
        this.name = name;
    }

    public void addChild(ControlFlowGraphNode child) {
        children.add(child);
    }

    public boolean hasBase() {
        return this.base != null;
    }

    public boolean hasName() {
        return this.name != null;
    }

    public void print(String tab, boolean withChildren) {
        System.out.println(tab + "Name: " + name);
        if (base != null) {
            System.out.println(tab + "Base: " + base);
            if (baseNode != null) {
                System.out.println(tab + "Base node:");
                baseNode.print(tab + "\t", false);
            }
        }
        if (!children.isEmpty() && withChildren) {
            System.out.println(tab + "Children:");
            for (ControlFlowGraphNode child : children) {
                child.print(tab + "\t", true);
            }
        }
        System.out.println();
    }

    public ArrayList<ControlFlowGraphNode> getChildren() {
        return children;
    }

    public String getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    public ControlFlowGraphNode getBaseNode() {
        return baseNode;
    }

    public void setChildren(ArrayList<ControlFlowGraphNode> children) {
        this.children = children;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseNode(ControlFlowGraphNode baseNode) {
        this.baseNode = baseNode;
    }
}
