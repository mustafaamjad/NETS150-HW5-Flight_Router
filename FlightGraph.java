import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FlightGraph implements FlightGraphInterface {

	private List<Node> allAirports = new ArrayList<Node>();
  // private HashMap<Node, ArrayList<Node>> in = new HashMap<Node, ArrayList<Node>>(); 
	
	public FlightGraph(String airports, String routes) throws IOException {

		// Parses the file containing airport data and creates nodes
		// for each airport
		Reader r = new FileReader(airports);
		BufferedReader br = new BufferedReader(r);
		String line;

		while( (line = br.readLine()) != null) {
			// System.out.println("while loop for creating nodes");
			// System.out.println(line);
			String[] airportData = line.split(",");
			String airportName = airportData[1];
			String airportIataCode = airportData[4];
			double airportGeoLat = Double.parseDouble(airportData[6]);
			double airportGeoLong = Double.parseDouble(airportData[7]);
			Node newAirport = new Node(airportName, airportIataCode, 
				airportGeoLat, airportGeoLong);
			allAirports.add(newAirport);
		}

		r.close();
		printNodes();
	}

	private void printNodes() {
		for (Node elt : allAirports) {
			System.out.println("This airport has name: " + elt.name +
				" and IATA code: " + elt.iataCode + " and latitude: " + 
				elt.geoLat + "and longitude: " + elt.geoLong);
		}

	public boolean doesEdgeExist(Node m, Node n) {
		return false;
	}
	
	// private boolean addNode(String name, String iataCode, double geoLong, double geoLat) {
	// 	return false;
	// }
	
	// private boolean addEdge(Node m, Node n){
	// 	return false;
	// }
}