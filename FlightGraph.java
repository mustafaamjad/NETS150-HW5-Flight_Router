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
	private HashMap<Node, ArrayList<Node>> in = new HashMap<Node, ArrayList<Node>>();
	private HashMap<Node, ArrayList<Node>> out = new HashMap<Node, ArrayList<Node>>();
	
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
		// printNodes();

		r = new FileReader(routes);
		br = new BufferedReader(r);

		while( (line = br.readLine()) != null) {
		String[] routesData = line.split(",");
		String airportDep = routesData[1];
		String airportArr = routesData[2];
		for (Node elt: allAirports) {
			if (elt.getIataCode().equals(airportDep)) {
				if (!out.containsKey(elt)) {
					ArrayList<Node> temp = new ArrayList<Node>();
					for (Node elt2 : allAirports) {
						if (elt2.getIataCode().equals(airportArr)) {
							temp.add(elt2);
						}
					}
				out.put(elt, temp);
				}

				else {
					for (Node elt3 : allAirports) {
						if (elt3.getIataCode().equals(airportArr)) {
							ArrayList<Node> temp2 = out.get(elt);
							temp2.add(elt3);
							out.put(elt, temp2);
						}
					}
				}
			}
		}
	}
		r.close();
		printOutMap();
	}

	private void printNodes() {
		for (Node elt : allAirports) {
			System.out.println("This airport has name: " + elt.getName() +
				" and IATA code: " + elt.getIataCode() + " and latitude: " + 
				elt.getGeoLat() + "and longitude: " + elt.getGeoLong());
		}
	}

	private void printOutMap() {
		System.out.println("printOutMap");
	}


	public boolean doesEdgeExist(Node m, Node n) {
		return false;
	}
	
	private boolean addNode(String name, String iataCode, double geoLat, double geoLong) {
		return false;
	}
	
	private boolean addEdge(Node m, Node n){
		return false;
	}
}