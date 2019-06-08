import java.util.*;
class Graph
{
static class graph
{
    int v;
    LinkedList<Integer> adjList[];
    graph(int V)
    {
        v=V;
        adjList=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjList[i]=new LinkedList<>();
        }
    }
}
  static  void addEdge(graph g,int s,int d)
    {
        g.adjList[s].add(d);
    }
   static void printGraph(graph g) 
    {        
        for(int i = 0; i < g.v; i++) 
        { 
            System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer pCrawl: g.adjList[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
    public static void main(String args[])
    {
        graph g = new graph(4);
 
        addEdge(g, 0, 1); 
        addEdge(g, 0, 4); 
        addEdge(g, 1, 2); 
        addEdge(g, 1, 3); 
        addEdge(g, 1, 4); 
        addEdge(g, 2, 3); 
        addEdge(g, 3, 4); 
         printGraph(g);
    }
}
