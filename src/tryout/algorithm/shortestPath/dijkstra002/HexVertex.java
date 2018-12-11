package tryout.algorithm.shortestPath.dijkstra002;

import java.util.ArrayList;
import java.util.List;
 
public class HexVertex implements Comparable<HexVertex> {
 
	private String sMapX;
	private String sMapY;
	
	
	private List<Edge> adjacenciesList;
	private boolean visited;
	private HexVertex predecessor;
	private double distance = Double.MAX_VALUE;
 
	public HexVertex(String sMapX, String sMapY) {
		this.sMapX = sMapX;
		this.sMapY = sMapY;
		
		this.adjacenciesList = new ArrayList<>();
	}
 
	public void addNeighbour(Edge edge) {
		this.adjacenciesList.add(edge);
	}
  
	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}
 
	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
 
	public boolean isVisited() {
		return visited;
	}
 
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
 
	public HexVertex getPredecessor() {
		return predecessor;
	}
 
	public void setPredecessor(HexVertex predecessor) {
		this.predecessor = predecessor;
	}
 
	public double getDistance() {
		return distance;
	}
 
	public void setDistance(double distance) {
		this.distance = distance;
	}
 
	@Override
	public String toString() {
		return this.getMapX() + "/" + this.getMapY();
	}
 
	@Override
	public int compareTo(HexVertex otherVertex) {
		return Double.compare(this.distance, otherVertex.getDistance());
	}
	
	
	//### Interface: IMapNavigatable ####################################
		public String getMapX(){
			//int itemp = this.getHexCellObject().getMapX();			
			//return new Integer(itemp).toString();
			return this.sMapX;
		}
		public String getMapY(){
//			int itemp =  this.getHexCellObject().getMapY();
//			return new Integer(itemp).toString();
			return this.sMapY;
		}
}
