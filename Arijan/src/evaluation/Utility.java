package evaluation;

import data.model.Location;

public class Utility {
	
	public static double calculateDistane(Location source, Location destination){
		return Math.sqrt(longDelta(source, destination) * longDelta(source, destination) + latDelta(source, destination)
				* latDelta(source, destination));
	}
	
	private static double longDelta(Location source, Location destination){
		return source.getLongitude() - destination.getLatitude();
	}
	
	private static double latDelta(Location source, Location destination){
		return source.getLatitude() - destination.getLatitude();
	}

}
