import java.io.IOException;

public class FlightRouter {

	public static void main(String[] args) throws IOException {
		FlightGraph graph = new FlightGraph("airports.csv", "routes.csv");
		// System.out.println(GraphAlgorithms.calculateDistance(31.52160072, 74.4036026, 33.61669922, 73.09919739));

		// TEST doesEdgeExist 
		// System.out.println(graph.doesEdgeExist("YVR", "DEN"));
		// graph.getAllInAndOutFlights();


		GraphAlgorithms graphAlg = new GraphAlgorithms(graph.getAllAirports());
		
		// enter airport iata code and max number of flights you are willing to take	
		graphAlg.BFS("EWR", 1);

	}
}
