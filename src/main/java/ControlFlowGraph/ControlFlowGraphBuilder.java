package ControlFlowGraph;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ControlFlowGraphBuilder {
    Logger logger = Logger.getLogger(ControlFlowGraphBuilder.class.getName());
    public ControlFlowGraph build(Path path) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(path.toString());
            Element root = document.getDocumentElement();
            return new ControlFlowGraph(traverse(root));
        } catch (ParserConfigurationException | IOException | SAXException ignored) {
            //TODO: do not ignore
        }
        return new ControlFlowGraph();
    }

    public ControlFlowGraphNode traverse(Node root) {
        NodeList children = root.getChildNodes();
        Node nameNode = root.getAttributes().getNamedItem("name");
        String name = "";
        if(nameNode != null) name = nameNode.getNodeValue();
        ControlFlowGraphNode rootNode = new ControlFlowGraphNode(new ArrayList<>(), name);
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() != Node.ELEMENT_NODE) continue;
            ControlFlowGraphNode childNode = traverse(child);
            rootNode.addChild(childNode);
        }
        return rootNode;
    }
}
