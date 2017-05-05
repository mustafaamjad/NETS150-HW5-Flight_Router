import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FlightGraph implements FlightGraphInterface {

	private HashMap<String, Node> allAirports = new HashMap<String, Node>();
	
	/* 
	 * DEFAULT CONSTRUCTOR
	 * Sets up the entire Graph (nodes, edges etc.)
	*/
	public FlightGraph(String airports, String routes) throws IOException {

		// Defines a Reader r, BufferedReader br to parse airports file 
		Reader r = new FileReader(airports);
		BufferedReader br = new BufferedReader(r);
		String line;

		// counter Variables for testing purposes
		int index = 0;
		int index2 = 0;

		// Parses the airports file and creates nodes until it reaches the end
		while( (line = br.readLine()) != null) {
			// splits the current line by commas 
			String[] airportData = line.split(",");
			
			// creates relevant variables to store data being parsed 
			String airportName = airportData[1];
			String airportIataCode = airportData[4];
			double airportGeoLat = Double.parseDouble(airportData[6]);
			double airportGeoLong = Double.parseDouble(airportData[7]);

			// creates new Airport Node with data read in to the relevant variables 
			addNode(airportName, airportIataCode, airportGeoLat, airportGeoLong);

			index++;
		}
		// closes the airports file 
		r.close();
		System.out.println("Finished reading airports file");

		Reader r2 = new FileReader(routes);
		BufferedReader br2 = new BufferedReader(r2);

		// Defines a Reader r2, BufferedReader br2 to parse routes file 
		while ((line = br2.readLine()) != null) {
			// splits the current line by commas 
			String[] routesData = line.split(",");
			
			// creates relevant variables to store data being parsed 
			String airportDep = routesData[1];
			String airportArr = routesData[2];

			// gets the arr and dep airport nodes relevant to the current route
			Node currentDepAirport = allAirports.get(airportDep);
			Node currentArrAirport = allAirports.get(airportArr);

			// skips to next Iteration if either arr or dep airport is null
			if (currentArrAirport == null || currentDepAirport == null) {
				continue;
			}
			else {
				addEdge(currentArrAirport, currentDepAirport);
				
				// currentDepAirport.getOutAirports();
				// currentArrAirport.getInAirports();
			}
			index2++;
		}
		// closes the routes file
		r2.close();
		System.out.println("Finished reading routes file");
	}


	/* 
	 * Method name: addNode
	 * Method to add a new airport Node to the graph
	 * param: String airportName, String airportIataCode, Double airportGeoLat, Double airportGeoLong
	 * return type: N/A
	*/
	private void addNode(String airportName, String airportIataCode, Double airportGeoLat, Double airportGeoLong) {
		// creates new airport node
		Node newAirport = new Node(airportName, airportIataCode, 
				airportGeoLat, airportGeoLong);

		// adds node to the allAirports Graph (HashMap)
		allAirports.put(airportIataCode, newAirport);
	}

	
	/* 
	 * Method name: addEdge
	 * Method to add a new edge to the graph
	 * param: String airportName, String airportIataCode
	 * return type: N/A
	*/
	private void addEdge(Node arrAirport, Node depAirport) {
		// adds current arr airport to current dep airport's HashSet of out airports 
		depAirport.addOutAirport(arrAirport.getIataCode());
		// adds current dep airport to current arr airport's HashSet of in airports
		arrAirport.addInAirport(depAirport.getIataCode());
	}


	/* 
	 * Method name: doesEdgeExist
	 * Method to check if an edge exists between two airport Nodes
	 * param: String m, String n
	 * return type: boolean
	*/
	public boolean doesEdgeExist(String m, String n) {
		// gets the Node associated with String m 
		Node mNode = allAirports.get(m);
		if (mNode.getInAirports().contains(n) || mNode.getOutAirports().contains(n)) {
			// returns true if String n exists in either Node m's inAirports
			// or it's outAirports 
			return true;
		}
		// returns false otherwise
		return false;
	}
}