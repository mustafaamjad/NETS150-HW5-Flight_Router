import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class GraphAlgorithms {

	private HashMap<String, Node> graph;

	public GraphAlgorithms(HashMap<String, Node> graph) {
		this.graph = graph;
	}

	public void BFS(String src, int frontier) {

		int counter = 0;
        HashSet<String> visitedSet = new HashSet<String>();
        LinkedList<String> queue = new LinkedList<String>();
        visitedSet.add(src);
        queue.add(src);
 
        while (queue.size() != 0) {
            String s = queue.poll();
            System.out.print(s + " ");
            Iterator<Map.Entry<String, Double>> i = graph.get(s).out.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry<String, Double> n = i.next();
                if (!visitedSet.contains(n.getKey())) 
                {
                	System.out.println(n.getKey());
                	visitedSet.add(n.getKey());
         			queue.add(n.getKey());
                }
            }
            counter++;
            if (counter == frontier) {
            	break;
            }
        }

	}

	// // TODO: finish writing this method
	// public Node closestAirport(double geoLat, double geoLong){
	// 	Node closest = null;
	// 	for (Entry<String> : graph.getAllAirports()) {
	// 		double dist = calculateDistance(geoLat, geoLong, elt.)
	// 	}
	// }

	// returns the distance in km between two nodes based on their
	// geo-coordinates

	public static double calculateDistance(double geoLat1, double geoLong1, double geoLat2, double geoLong2){

		double earthRadius = 6371; // in km

		double distLat = Math.toRadians(geoLat2 - geoLat1);
		double distLong = Math.toRadians(geoLong2 - geoLong1);
		double a = Math.sin(distLat/2) * Math.sin(distLat/2) + 
			Math.cos(Math.toRadians(geoLat1)) * Math.cos(Math.toRadians(geoLat2)) * 
			Math.sin(distLong/2) * Math.sin(distLong/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = earthRadius * c;

		return distance;
	}

	public ArrayList<Node> shortestPath(Node a, Node b){
		return null;
	}

	public ArrayList<ArrayList<Node>> multiCityTrip(Node[] tgtCities){
		return null;
	}

	public ArrayList<Node> bestRoute(ArrayList<ArrayList<Node>> possibleRoutes){
		return null;
	}

}