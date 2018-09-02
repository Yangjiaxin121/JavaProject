package ch18;

public class TestGraph {
	public static void main(String[] args) {
		Graph graph = new Graph()	;
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
	}

}
