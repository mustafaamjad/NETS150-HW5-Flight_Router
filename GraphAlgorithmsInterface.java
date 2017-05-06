import java.util.ArrayList;
public interface GraphAlgorithmsInterface {

	public Node shortestDistance(String tgtAirport);
	public Node closestAirport(double geoLat, double geoLong);
	public ArrayList<Node> shortestPath(Node a, Node b);
	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities);
	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes);
}