import java.util.HashMap;
public class FlightGraph implements FlightGraphInterface {

	private HashMap<Node, ArrayList<Node>> in = new HashMap<Node, ArrayList<Node>>(); 
	
	public FlightGraph(String airports, String routes) {

	}


	public boolean doesEdgeExist(Node m, Node n) {
		return false;
	}
	
	// private boolean addNode(String name, String iataCode, double geoLong, double geoLat) {
	// 	return false;
	// }
	
	// private boolean addEdge(Node m, Node n){
	// 	return false;
	// }
}