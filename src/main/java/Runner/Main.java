package Runner;

import ControlFlowGraph.ControlFlowGraph;
import ControlFlowGraph.ControlFlowGraphBuilder;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        ControlFlowGraphBuilder builder = new ControlFlowGraphBuilder();
        ControlFlowGraph cfg = builder.build(Path.of("src/main/resources/test.xml"));
        System.out.println("finished");
    }
}
