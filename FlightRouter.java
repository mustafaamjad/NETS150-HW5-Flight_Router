import java.io.IOException;

public class FlightRouter {

	public static void main(String[] args) throws IOException {
		FlightGraph graph = new FlightGraph("airports.csv", "routes.csv");
		// System.out.println(GraphAlgorithms.calculateDistance(31.52160072, 74.4036026, 33.61669922, 73.09919739));

		// Checks if there is a direct flight between 2 airports

		graph.isThereAFlightBetween("LHE", "SFO");

		// Gives information about all flights available
		// graph.getAllAirportsAndFlights();

		// Change the argument to the IATA Code of the Airport that you want
		// to get flights to/from
		// graph.getFlightsTo("LHR");
		// graph.getFlightsFrom("LHR");
	}
}
