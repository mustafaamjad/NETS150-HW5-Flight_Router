import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Node implements NodeInterface {

	private String name, iataCode;
	private Double geoLong, geoLat;
	private HashMap<String, Double> in = new HashMap<String, Double>();
	private HashMap<String, Double> out = new HashMap<String, Double>();

	/* 
	 * DEFAULT CONSTRUCTOR
	 * initializes relevant variables
	*/
	public Node(String name, String iataCode, Double geoLat, Double geoLong) {
		this.name = name;
		this.iataCode = iataCode;
		this.geoLat = geoLat;
		this.geoLong = geoLong;
	}

	/* 
	 * Method name: getName
	 * Method to return Airport name
	 * param: N/A
	 * return type: String
	*/
	public String getName(){
		return this.name;
	}


	/* 
	 * Method name: getIataCode
	 * Method to return Airport's Iata Code
	 * param: N/A
	 * return type: String
	*/
	public String getIataCode(){
		return this.iataCode;
	}


	/* 
	 * Method name: getGeoLat
	 * Method to return Airport's Geographical latitude
	 * param: N/A
	 * return type: Double
	*/
	public Double getGeoLat(){
		return this.geoLat;
	}


	/* 
	 * Method name: getGeoLong
	 * Method to return Airport's Geographical longitude
	 * param: N/A
	 * return type: Double
	*/
	public Double getGeoLong(){
		return this.geoLong;
	}

	/* 
	 * Method name: distanceBetween
	 * Method to return the distance between this airport and a pair of 
	 * latitude, longitude coordinates
	 * param: double lat, double lngt
	 * return type: Double
	*/
	private double distanceBetween(double lat, double lngt) {
		double dist = GraphAlgorithms.calculateDistance(lat, lngt, geoLat, geoLong);
		return dist;
	}


	/* 
	 * Method name: addOutAirport
	 * Method to add airport and its distance from the current node to Node's outAirports
	 * param: String newOutAirport, double outLat, double outLong
	 * return type: boolean
	*/
	public boolean addOutAirport(String newOutAirport, double outLat, double outLong) {
		double dist = distanceBetween(outLat, outLong);
		// System.out.println(newOutAirport + " is at a distance of " + dist + " km from " + name + " (" + iataCode + ")");
		out.put(newOutAirport, dist);
		return true;
	}


	/* 
	 * Method name: addInAirport
	 * Method to add airport and its distance from the current node to Node's inAirports
	 * param: String newInAirport
	 * return type: boolean
	*/
	public boolean addInAirport(String newInAirport, double outLat, double outLong) {
		double dist = distanceBetween(outLat, outLong);
		// System.out.println(newInAirport + " is at a distance of " + dist + " km from " + name + " (" + iataCode + ")");
		in.put(newInAirport, dist);
		return true;
	}

	public HashMap<String, Double> getIn() {
		return this.in;
	}

		public HashMap<String, Double> getOut() {
		return this.out;
	}


	/* 
	 * Method name: getInAirports
	 * Method to get Node's inAirports
	 * param: N/A
	 * return type: ArrayList<String>
	*/
	public ArrayList<String> getInAirports() {
		ArrayList<String> inAirports = new ArrayList<String>();
		for (String elt : in.keySet()) {
			inAirports.add(elt);
		}
		return inAirports;
	}


	/* 
	 * Method name: getOutAirports
	 * Method to get Node's outAirports
	 * param: N/A
	 * return type: ArrayList<String>
	*/
	public ArrayList<String> getOutAirports() {
		ArrayList<String> outAirports = new ArrayList<String>();
		for (String elt : out.keySet()) {
			outAirports.add(elt);
		}
		return outAirports;
	}

}