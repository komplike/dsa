package pr04_geeks;

//Driver Code
public class Main {

 public static void main(String args[])
 {

     // Object of graph is created.
     Graph<String> g = new Graph<String>();

     // edges are added.
     // Since the graph is bidirectional,
     // so boolean bidirectional is passed as true.
     g.addEdge("Adresar1", "Adresar2", true);
     g.addEdge("Adresar1", "Adresar4", false);
     g.addEdge("Adresar1", "Adresar5", false);
     g.addEdge("Adresar1", "Adresar6", false);
     
     g.addEdge("Adresar2", "Adresar3", false);
     g.addEdge("Adresar2", "Adresar5", false);
     
     g.addEdge("Adresar5", "Adresar4", false);
     
     // print the graph.
     System.out.println("Graph:\n"
                        + g.toString());

     // gives the no of vertices in the graph.
     g.getVertexCount();

     // gives the no of edges in the graph.
     g.getEdgesCount(false);

     // tells whether the edge is present or not.
     //g.hasEdge(3, 4);

     // tells whether vertex is present or not
     //g.hasVertex(5);
 }
}