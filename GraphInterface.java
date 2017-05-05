import Node;

public interface FlightGraphInterface {

	public boolean doesEdgeExist(Node m, Node n);
	private boolean addNode(String name, String iataCode, double geoLong, double geoLat);
	private boolean addEdge(Node m, Node n);

}