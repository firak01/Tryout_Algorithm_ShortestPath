package tryout.algorithm.shortestPath.dijkstra002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
 
public class DijkstraShortestPath {
 
	public void computeShortestPaths(HexVertex sourceVertex){
 
		sourceVertex.setDistance(0);
		PriorityQueue<HexVertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);
		sourceVertex.setVisited(true);
 
		while( !priorityQueue.isEmpty() ){
            // Getting the minimum distance vertex from priority queue
			HexVertex actualVertex = priorityQueue.poll();
 
			for(Edge edge : actualVertex.getAdjacenciesList()){
 
				HexVertex v = edge.getTargetVertex();
				if(!v.isVisited())
				{
					double newDistance = actualVertex.getDistance() + edge.getWeight();
 
					if( newDistance < v.getDistance() ){
						priorityQueue.remove(v);
						v.setDistance(newDistance);
						v.setPredecessor(actualVertex);
						priorityQueue.add(v);
					}
				}
			}
			actualVertex.setVisited(true);
		}
	}
 
	public List<HexVertex> getShortestPathTo(HexVertex targetVertex){
		List<HexVertex> path = new ArrayList<>();
 
		for(HexVertex vertex=targetVertex;vertex!=null;vertex=vertex.getPredecessor()){
			path.add(vertex);
		}
 
		Collections.reverse(path);
		return path;
	}
 
}
