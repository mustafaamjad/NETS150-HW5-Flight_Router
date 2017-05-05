import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Node implements NodeInterface {

	private String name, iataCode;
	private double geoLong, geoLat;
	private HashSet<String> in = new HashSet<String>();
	private HashSet<String> out = new HashSet<String>();

	/* 
	 * DEFAULT CONSTRUCTOR
	 * initializes relevant variables
	*/
	public Node(String name, String iataCode, double geoLat, double geoLong) {
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
	 * Method name: addOutAirport
	 * Method to add airport to Node's outAirports
	 * param: String newOutAirport
	 * return type: boolean
	*/
	public boolean addOutAirport(String newOutAirport) {
		out.add(newOutAirport);
		return true;
	}


	/* 
	 * Method name: addInAirport
	 * Method to add airport to Node's inAirports
	 * param: String newInAirport
	 * return type: boolean
	*/
	public boolean addInAirport(String newInAirport) {
		in.add(newInAirport);
		return true;
	}


	/* 
	 * Method name: getInAirports
	 * Method to get Node's inAirports
	 * param: N/A
	 * return type: ArrayList<String>
	*/
	public ArrayList<String> getInAirports() {
		Iterator I = in.iterator();
		ArrayList<String> inAirports = new ArrayList<String>();
		while(I.hasNext()) {
			inAirports.add(I.next().toString());
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
		Iterator I = out.iterator();
		ArrayList<String> outAirports = new ArrayList<String>();
		while(I.hasNext()) {
			outAirports.add(I.next().toString());
		}
		return outAirports;
	}

}