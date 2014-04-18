package data.model;

public class Location {

	int longitude;
	int latitude;
	
	public Location(int longitude, int latitude){
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public int getLongitude(){
		return this.longitude;
	}
	
	public int getLatitude(){
		return this.latitude;
	}
}
