package tryout.algorithm.shortestPath.dijkstra002;

import java.util.List;
import java.util.PriorityQueue;

import basic.zBasic.ExceptionZZZ;
import basic.zBasic.util.abstractList.HashMapMultiZZZ;

/**Übernommen aus https://java2blog.com/dijkstra-java/
 * @author lindhauer
 *
 */
public class TryoutShortestPathMain {

	public static void main(String[] args) {
					
		try{
			//Zieh ein Netz aus Knoten auf, DAS GEHT NICHT EINMALIG
			//HashMapMultiZZZ hmVertex = fillHexMapNavigationMap();
			
		//################################################
				
		from2_1:{
			//Zieh ein Netz aus Knoten auf, FÜR JEDE AUSGANGSPOSITION neu, da wohl intern gespeichert wird, ob der Knoten schon besucht worden ist.
		HashMapMultiZZZ hmVertex = fillHexMapNavigationMap();
			
		
		HexVertex objVertexStart = (HexVertex) hmVertex.get("2","1");
		DijkstraShortestPath shortestPathFrom = new DijkstraShortestPath();
		shortestPathFrom.computeShortestPaths(objVertexStart);
		
		System.out.println("======================================");
		System.out.println("Calculating minimum distance from 2/1");
		System.out.println("======================================");
		
		HexVertex objVertex1_1 = (HexVertex) hmVertex.get("1","1");
		System.out.println("Minimum distance from 2/1 to 1/1: "+objVertex1_1.getDistance());
		
		HexVertex objVertex1_2 = (HexVertex) hmVertex.get("1","2");
		System.out.println("Minimum distance from 2/1 to 1/2: "+objVertex1_2.getDistance());
		
		HexVertex objVertex1_3 = (HexVertex) hmVertex.get("1","3");
		System.out.println("Minimum distance from 2/1 to 1/3: "+objVertex1_3.getDistance());
		
		HexVertex objVertex1_4 = (HexVertex) hmVertex.get("1","4");
		System.out.println("Minimum distance from 2/1 to 1/4: "+objVertex1_4.getDistance());
		
		
		HexVertex objVertex2_5 = (HexVertex) hmVertex.get("2","5");
		System.out.println("Minimum distance from 2/1 to 2/5: "+objVertex2_5.getDistance());
		
		
		System.out.println("======================================");
		System.out.println("Calculating Paths");
		System.out.println("======================================");
		List<HexVertex> listPath = shortestPathFrom.getShortestPathTo(objVertex2_5);
		System.out.println("Shortest Path from 2/1 to 2/5 geht über "+listPath.size() + " Knoten.");
		for(HexVertex objPathTemp : listPath){
			System.out.println(objPathTemp.toString());
		}
		}
		

		//#################
		from1_1:{
			//Zieh ein Netz aus Knoten auf, FÜR JEDE AUSGANGSPOSITION neu, da wohl intern gespeichert wird, ob der Knoten schon besucht worden ist.
			HashMapMultiZZZ hmVertex = fillHexMapNavigationMap();
			HexVertex objVertexStart = (HexVertex) hmVertex.get("1","1");
				
			DijkstraShortestPath shortestPathFrom = new DijkstraShortestPath();
			shortestPathFrom.computeShortestPaths(objVertexStart);
			
			System.out.println("======================================");
			System.out.println("Calculating minimum distance from 1/1");
			System.out.println("======================================");
			
			HexVertex objVertex1_2 = (HexVertex) hmVertex.get("1","2");
			System.out.println("Minimum distance from 1/1 to 1/2: "+objVertex1_2.getDistance());
			
			HexVertex objVertex1_3 = (HexVertex) hmVertex.get("1","3");
			System.out.println("Minimum distance from 1/1 to 1/3: "+objVertex1_3.getDistance());
			
			HexVertex objVertex1_4 = (HexVertex) hmVertex.get("1","4");
			System.out.println("Minimum distance from 1/1 to 1/4: "+objVertex1_4.getDistance());
			
			
			HexVertex objVertex2_5 = (HexVertex) hmVertex.get("2","5");
			System.out.println("Minimum distance from 1/1 to 2/5: "+objVertex2_5.getDistance());
			
			HexVertex objVertex2_1 = (HexVertex) hmVertex.get("2","1");
			System.out.println("Minimum distance from 1/1 to 2/1: "+objVertex2_1.getDistance());
			
			System.out.println("======================================");
			System.out.println("Calculating Paths");
			System.out.println("======================================");
			List<HexVertex> listPath = shortestPathFrom.getShortestPathTo(objVertex2_5);
			System.out.println("Shortest Path from 1/1 to 2/5 geht über "+listPath.size() + " Knoten.");
			for(HexVertex objPathTemp : listPath){
				System.out.println(objPathTemp.toString());
			}
			}
		
		//#################
				from5_4:{
				//Zieh ein Netz aus Knoten auf, FÜR JEDE AUSGANGSPOSITION neu, da wohl intern gespeichert wird, ob der Knoten schon besucht worden ist.
					HashMapMultiZZZ hmVertex = fillHexMapNavigationMap();
					HexVertex objVertexStart = (HexVertex) hmVertex.get("5","4");
						
					DijkstraShortestPath shortestPathFrom = new DijkstraShortestPath();
					shortestPathFrom.computeShortestPaths(objVertexStart);
					
					System.out.println("======================================");
					System.out.println("Calculating minimum distance from 5/4");
					System.out.println("======================================");
							
					HexVertex objVertex2_5 = (HexVertex) hmVertex.get("2","5");
					System.out.println("Minimum distance from 5/4 to 2/5: "+objVertex2_5.getDistance());
					
					
					System.out.println("======================================");
					System.out.println("Calculating Paths");
					System.out.println("======================================");
					List<HexVertex> listPath = shortestPathFrom.getShortestPathTo(objVertex2_5);
					System.out.println("Shortest Path from 5/4 to 2/5 geht über "+listPath.size() + " Knoten.");
					for(HexVertex objPathTemp : listPath){
						System.out.println(objPathTemp.toString());
					}
					}
			
			//#################
			from5_4_blocked:{
						//Zieh ein Netz aus Knoten auf, FÜR JEDE AUSGANGSPOSITION neu, da wohl intern gespeichert wird, ob der Knoten schon besucht worden ist.
							HashMapMultiZZZ hmVertex = fillHexMapNavigationMapBlocked();
							HexVertex objVertexStart = (HexVertex) hmVertex.get("5","4");
								
							DijkstraShortestPath shortestPathFrom = new DijkstraShortestPath();
							shortestPathFrom.computeShortestPaths(objVertexStart);
							
							System.out.println("======================================");
							System.out.println("Calculating minimum distance from 5/4");
							System.out.println("======================================");
									
							HexVertex objVertex2_5 = (HexVertex) hmVertex.get("2","5");
							System.out.println("Minimum distance from 5/4 to 2/5: "+objVertex2_5.getDistance());
							
							
							System.out.println("======================================");
							System.out.println("Calculating Paths");
							System.out.println("======================================");
							List<HexVertex> listPath = shortestPathFrom.getShortestPathTo(objVertex2_5);
							System.out.println("Shortest Path from 5/4 to 2/5 geht über "+listPath.size() + " Knoten.");
							for(HexVertex objPathTemp : listPath){
								System.out.println(objPathTemp.toString());
							}
							}
			
			//###########		
		}catch(ExceptionZZZ ez){
			ez.printStackTrace();
		}
	}
	
	
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
	
	public static boolean isNeighbor(HexVertex objVertex1, HexVertex objVertex2 ){
		boolean bReturn = false;
		main:{
			if(objVertex1 == null ) break main;
			if(objVertex2 == null ) break main;
			
			
			String sX1 = objVertex1.getMapX();
			String sY1 = objVertex1.getMapY();
			
			String sX2 = objVertex2.getMapX();
			String sY2 = objVertex2.getMapY();
			
			//NEIN, das geht nicht mit Summenbildung...
//			int iSum1 = new Integer(sX1).intValue() + new Integer(sY1).intValue();
//			int iSum2 = new Integer(sX2).intValue() + new Integer(sY2).intValue();
//			if(Math.abs(iSum1 - iSum2)>=2) break main;//Also nur 1 Unterschied in der Summe, dann ist das Feld benachbart.
			
			//Statt dessen die Postion vergleichen
			int iX1 = new Integer(sX1).intValue();
			int iY1 = new Integer(sY1).intValue();
			
			int iX2 = new Integer(sX2).intValue();
			int iY2 = new Integer(sY2).intValue();
			
			//Wenn mehr als 1 Feld Abstand, dann ist es nicht benachbart			
			//Wenn Y-Werte gleich sind, dann darf X-Wert nur +/-1 sein
			if(iY1==iY2){
				if(Math.abs(iX1 - iX2)<=1){
					bReturn = true;
					break main;
				}
			}
			
			//Wenn X-Werte gleich sind, dann darf Y-Wert nur +/-1 sein
			if(iX1==iX2){
				if(Math.abs(iY1 - iY2)<=1){
					bReturn = true;
					break main;
				}
			}	
		}//end main
		return bReturn;		
	}
	
	public static HashMapMultiZZZ fillHexMapNavigationMap() throws ExceptionZZZ{
		HashMapMultiZZZ objReturn = new HashMapMultiZZZ();  //Hashmap mit Hashmap, in der die Sechseckzellen in Form von Koordinaten (z.B. "1","1") abgelegt sind.
		main:{
			//1. Erstelle die Knoten
			int iVertexTotal = fillHexVertexMap(objReturn);
			if(iVertexTotal==0)break main;
			
			
			//2. Mache die Verküpfungen
			int iEdgeTotal = fillHexEdges(objReturn);
			if(iEdgeTotal==0)break main;
		}//end main:
		return objReturn;
	}
	
	public static int fillHexVertexMap(HashMapMultiZZZ objReturn) throws ExceptionZZZ{
		int iReturn = 0;
		main:{
			if(objReturn==null) break main;
			
			//1. Erstelle die Knoten
			for(int iX=1; iX<=9; iX++){			
				for(int iY=1; iY<=7;iY++){
					
					Integer intX = new Integer(iX);				
					String sX = intX.toString();
					
					Integer intY = new Integer(iY);
					String sY = intY.toString();
					
					HexVertex objVertex = new HexVertex(sX, sY);
									
					objReturn.put(sX, sY, objVertex);
					iReturn++;
				}// end for iY
				
			}//end for iX
		}
		return iReturn;
	}
	
	public static int blockHexVertex(HashMapMultiZZZ objReturn) throws ExceptionZZZ{
		int iReturn = 0;
		main:{
			if(objReturn==null) break main;
			
			//1. Erstelle die Knoten
			for(int iX=1; iX<=9; iX++){			
				for(int iY=1; iY<=7;iY++){
					
					if(iX==4 && iY==4){
						Integer intX = new Integer(iX);				
						String sX = intX.toString();
						
						Integer intY = new Integer(iY);
						String sY = intY.toString();
						
						Object objFound = objReturn.remove(sX,sY);							
						//objReturn.put(sX, sY, objVertex);
						if(objFound!=null){
							iReturn++;
						}
					}
					
					if(iX==5 && iY==5){
						Integer intX = new Integer(iX);				
						String sX = intX.toString();
						
						Integer intY = new Integer(iY);
						String sY = intY.toString();
						
						Object objFound = objReturn.remove(sX,sY);							
						//objReturn.put(sX, sY, objVertex);
						if(objFound!=null){
							iReturn++;
						}
					}
				}// end for iY
				
			}//end for iX
		}//end main:
		return iReturn;
	}
	
	public static int fillHexEdges(HashMapMultiZZZ objReturn) throws ExceptionZZZ{
		int iReturn = 0;
		main:{
			//Merke: Die Entfernung der Knoten beträgt immer 1, s. Konstruktor von "Edge".
			for(int iX=1; iX<=9; iX++){			
				for(int iY=1; iY<=7;iY++){
					
					String sX = Integer.toString(iX);
					String sY = Integer.toString(iY);
					System.out.println("+++++++++++++++");
					System.out.println("+++ Definiere Vernüpfungen von Knoten " + sX + "/" + sY);
					HexVertex objVertex = (HexVertex) objReturn.get(sX, sY);
					
					//Hole die 6 Nachbarknoten, bzw. Kanten dorthin.
					
					//1++++				
					int iXtemp = iX;
					int iYtemp = iY-1;
					String sXtemp = Integer.toString(iXtemp);
					String sYtemp = Integer.toString(iYtemp);
					
					HexVertex objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){
						System.out.println("1... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}
				
					
					//2++++
					iXtemp = iX+1;
					iYtemp = iY-1;
					sXtemp = Integer.toString(iXtemp);
					sYtemp = Integer.toString(iYtemp);
					objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){	
						System.out.println("2... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}	
//					
//					//3++++
					iXtemp = iX+1;
					iYtemp = iY;
					sXtemp = Integer.toString(iXtemp);
					sYtemp = Integer.toString(iYtemp);
					objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){	
						System.out.println("3... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}	
//					
//					//4++++
					iXtemp = iX+1;
					iYtemp = iY+1;
					sXtemp = Integer.toString(iXtemp);
					sYtemp = Integer.toString(iYtemp);
					objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){	
						System.out.println("4... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}	
//					
//					//5++++
					iXtemp = iX;
					iYtemp = iY+1;
					sXtemp = Integer.toString(iXtemp);
					sYtemp = Integer.toString(iYtemp);
					objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){	
						System.out.println("5... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}	
//					
//					//6++++
					iXtemp = iX-1;
					iYtemp = iY;
					sXtemp = Integer.toString(iXtemp);
					sYtemp = Integer.toString(iYtemp);
					objVertexTemp = (HexVertex) objReturn.get(sXtemp, sYtemp);
					if(isNeighbor(objVertex, objVertexTemp)){	
						System.out.println("6... nach Knoten " + sXtemp + "/" + sYtemp);
						Edge edge = new Edge(1,objVertex, objVertexTemp);
						objVertex.addNeighbour(edge);
						iReturn++;
					}																	
				}// end for iY
			}//end for iX
		}
		return iReturn;
	}
	
	public static HashMapMultiZZZ fillHexMapNavigationMapBlocked() throws ExceptionZZZ{
		HashMapMultiZZZ objReturn = new HashMapMultiZZZ();  //Hashmap mit Hashmap, in der die Sechseckzellen in Form von Koordinaten (z.B. "1","1") abgelegt sind.
		main:{
				
			
			//1. Erstelle die Knoten
			int iVertexTotal = fillHexVertexMap(objReturn);
			if(iVertexTotal==0)break main;
			
			//#### DAS BLOCKEN: Entferne Knoten, die ja ggfs. nicht zur Verfügung stehene
			int iVertexBlocke = blockHexVertex(objReturn);
			
					
			//2. Mache die Verküpfungen
			int iEdgeTotal = fillHexEdges(objReturn);
			if(iEdgeTotal==0)break main;
		
		}//end main:
		return objReturn;
	}

}
