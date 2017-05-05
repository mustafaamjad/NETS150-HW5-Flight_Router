public class Node implements NodeInterface {

	private String name, iataCode;
	private double geoLong, geoLat;

	public Node(String name, String iataCode, double geoLat, double geoLong) {
		this.name = name;
		this.iataCode = iataCode;
		this.geoLat = geoLat;
		this.geoLong = geoLong;
	}
}