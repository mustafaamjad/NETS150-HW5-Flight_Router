import java.io.IOException;

public class FlightRouter {

	public static void main(String[] args) throws IOException {
		FlightGraph graph = new FlightGraph("airports.csv", "routes.csv");

		// TEST doesEdgeExist 
		// System.out.println(graph.doesEdgeExist("YVR", "DEN"));
		graph.getAllInAndOutFlights();
	}
}
