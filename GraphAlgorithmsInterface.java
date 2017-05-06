import java.util.ArrayList;
public interface GraphAlgorithmsInterface {

	public Node BFS(String tgtAirport);
	public static double calculateDistance(double geoLat1, double geoLong1, double geoLat2, double geoLong2);
	public Node shortestDistance(String tgtAirport);
	public Node closestAirport(double geoLat, double geoLong);
	public ArrayList<Node> shortestPath(Node a, Node b);
	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities);
	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes);
}