public interface FlightGraphInterface {

	public boolean doesEdgeExist(String m, String n);

	public void getInAndOutFlights(String currentAirport);

	public void getFlightsTo(String airportCode);
	
	public void getAllInAndOutFlights();

}