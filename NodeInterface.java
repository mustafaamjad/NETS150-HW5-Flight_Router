import java.util.List;
import java.util.ArrayList;

public interface NodeInterface {

	public String getName();

	public String getIataCode();

	public Double getGeoLat();

	public Double getGeoLong();

	public boolean addOutAirport(String newOutAirport, double outLat, double outLong);

	public boolean addInAirport(String newInAirport, double outLat, double outLong);

	public ArrayList<String> getInAirports();

	public ArrayList<String> getOutAirports();
}