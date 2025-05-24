package KrushkalImplementation;

public class Edge implements Comparable<Edge> {

    int source;
    int destination;
    int weight;
    @Override
    public int compareTo(Edge o) {
       
        return this.weight-o.weight;
    }
}
//use of edge class :for making of input array we require edge class and then for sorting the input arr we need 
//the comparable interface