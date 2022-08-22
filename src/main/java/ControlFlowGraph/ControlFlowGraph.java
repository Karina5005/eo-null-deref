package ControlFlowGraph;

public class ControlFlowGraph {
    private ControlFlowGraphNode head = new ControlFlowGraphNode(null, null, null);

    public ControlFlowGraph(ControlFlowGraphNode head) {
        this.head = head;
    }

    public ControlFlowGraph() {
    }

    public void print() {
        head.print("");
    }
}
