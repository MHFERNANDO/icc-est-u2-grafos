import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

    private Set<Node> nodes;

    public Graph(){
        this.nodes = new HashSet<>();    
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(HashSet<Node> nodes) {
        this.nodes = nodes;
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node dest) {

        src.addNeighbor(dest);

    }

    public void printGraph(){
        List<Node> sortedNodes = new ArrayList<>(nodes);
        sortedNodes.sort((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (Node node : sortedNodes) {
            System.out.print("Vertex " + node.getValue() + ":");
            List<Node> sortedNeighbors = new ArrayList<>(node.getNeighbors());
            sortedNeighbors.sort((a, b) -> Integer.compare(a.getValue(), b.getValue()));

            for (Node neighbor : sortedNeighbors) {
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
        }

    public void getDFS(Node starNode){

    }
    public void getDFSUtil(Node node, boolean[] visited){

    }

    public void getBFS(Node startNode){

    }
    public int [][] getAdjacencyMatrix(){
        return null;
    }
    public void prinAdjacencyMatrix(){

    }


    //*********************Dfs*********************
    public void dfs(Node startNode) {
        
    }

    private void dfsHelper(){

    }

    
}
