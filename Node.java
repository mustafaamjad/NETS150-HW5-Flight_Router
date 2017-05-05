public class Node implements NodeInterface {

	private String name, iataCode;
	private double geoLong, geoLat;

	public Node(String name, String iataCode, double geoLong, double geoLat) {
		this.name = name;
		this.iataCode = iataCode;
		this.geoLat = geoLat;
		this.geoLong = geoLong;
	}



}