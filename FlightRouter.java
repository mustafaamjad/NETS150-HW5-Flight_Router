import java.io.IOException;

public class FlightRouter {

	public static void main (String[] args) throws IOException {
		FlightGraph graph = new FlightGraph("airports.csv", "routes.csv");
		
		// GraphAlgorithms test = new GraphAlgorithms(graph);
		System.out.println("Hello World"); 
	}
}
