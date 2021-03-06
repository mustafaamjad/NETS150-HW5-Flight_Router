import java.util.ArrayList;
public interface GraphAlgorithmsInterface {

	public Node BFS(String tgtAirport);
	public static double calculateDistance(double geoLat1, double geoLong1, double geoLat2, double geoLong2);
	public ArrayList<Node> ShortestPath(Node a, Node b);
	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities);
	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes);
}