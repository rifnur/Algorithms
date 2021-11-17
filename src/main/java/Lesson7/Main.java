package Lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(2,3);
        graph.addEdge(3,9);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(6,7);
        graph.addEdge(6,8);
        graph.addEdge(6,0);
        graph.addEdge(5,9);
        graph.addEdge(5,1);
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph,1);
        System.out.println(bfp.hasPathTo(2));
        System.out.println(bfp.pathTo(2));

//        graph.addEdge(0,2);
//        graph.addEdge(1,3);
//        graph.addEdge(3,2);
//        graph.addEdge(4,2);
//        graph.addEdge(4,3);
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(2));

//        DepthFirstPaths dfp = new DepthFirstPaths(graph,1);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

//        BreadthFirstPaths bfp = new BreadthFirstPaths(graph,1);
//        System.out.println(bfp.hasPathTo(0));
//        System.out.println(bfp.pathTo(0));

    }
}
