package tryout.algorithm.shortestPath.dijkstra002;

public class Edge {
	 
	private double weight;
	private HexVertex startVertex;
	private HexVertex targetVertex;
	
	public Edge(double weight, HexVertex startVertex, HexVertex targetVertex) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}
 
	public double getWeight() {
		return weight;
	}
 
	public void setWeight(double weight) {
		this.weight = weight;
	}
 
	public HexVertex getStartVertex() {
		return startVertex;
	}
 
	public void setStartVertex(HexVertex startVertex) {
		this.startVertex = startVertex;
	}
 
	public HexVertex getTargetVertex() {
		return targetVertex;
	}
 
	public void setTargetVertex(HexVertex targetVertex) {
		this.targetVertex = targetVertex;
	}
}
