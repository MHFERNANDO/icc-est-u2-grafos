public class App {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph();
        Node node0=graph.addNode(0);
        Node node3=graph.addNode(3);
        Node node9=graph.addNode(9);
        Node node2=graph.addNode(2);
        Node node4=graph.addNode(4);
        Node node7=graph.addNode(7);
        Node node1=graph.addNode(1);
        Node node8=graph.addNode(8);

        Node node5=graph.addNode(5);
        
        graph.addEdge(node7, node8);
        graph.addEdge(node0, node3);
        graph.addEdge(node0, node5);
        graph.addEdge(node3, node2);
        graph.addEdge(node3, node4);
        graph.addEdge(node3, node7);
        graph.addEdge(node3, node9);
        graph.addEdge(node2, node1);
        graph.addEdge(node4, node1);
        
        graph.addEdge(node8, node1);
        graph.addEdge(node1, node0);

        //Imprimar el grafo
        graph.printGraph();

    }
}
