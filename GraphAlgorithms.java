import java.util.ArrayList;
public class GraphAlgorithms {

	private FlightGraph graph;

	public GraphAlgorithms(FlightGraph graph) {
		this.graph = graph;
	}

	public Node BFS(String tgtAirport){
		return null;
	}

	// // TODO: finish writing this method
	// public Node closestAirport(double geoLat, double geoLong){
	// 	Node closest = null;
	// 	for (Entry<String> : graph.getAllAirports()) {
	// 		double dist = calculateDistance(geoLat, geoLong, elt.)
	// 	}
	// }

	// returns the distance in km between two nodes based on their
	// geo-coordinates

	public static double calculateDistance(double geoLat1, double geoLong1, double geoLat2, double geoLong2){

		double earthRadius = 6371; // in km

		double distLat = Math.toRadians(geoLat2 - geoLat1);
		double distLong = Math.toRadians(geoLong2 - geoLong1);
		double a = Math.sin(distLat/2) * Math.sin(distLat/2) + 
			Math.cos(Math.toRadians(geoLat1)) * Math.cos(Math.toRadians(geoLat2)) * 
			Math.sin(distLong/2) * Math.sin(distLong/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = earthRadius * c;

		return distance;
	}

	public ArrayList<Node> ShortestPath(Node a, Node b){
		return null;
	}

	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities){
		return null;
	}

	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes){
		return null;
	}

}