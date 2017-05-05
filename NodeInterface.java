import java.util.List;
import java.util.ArrayList;

public interface NodeInterface {

	public String getName();

	public String getIataCode();

	public Double getGeoLat();

	public Double getGeoLong();

	public boolean addOutAirport(String newOutAirport);

	public boolean addInAirport(String newInAirport);

	public ArrayList<String> getInAirports();

	public ArrayList<String> getOutAirports();
}