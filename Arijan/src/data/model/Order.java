package data.model;

public class Order {

	private Package pacakge;
	private Location destination;
	
	public Order(Package p, Location des){
		this.pacakge = p;
		this.destination = des;
	}
	
	public Package getPacakge() {
		return pacakge;
	}
	public void setPacakge(Package pacakge) {
		this.pacakge = pacakge;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
}
