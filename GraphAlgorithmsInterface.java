import java.util.ArrayList;
public interface GraphAlgorithmsInterface {

	public Node BFS(String tgtAirport);
	public Node closestAirport(double geoLong, double geoLat);
	public ArrayList<Node> ShortestPath(Node a, Node b);
	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities);
	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes);
}