package data.model;

public class Airplane {

	private String type;
	private int range;
	private int payload;
	private int capacity;

	public Airplane(String type, int range, int payload, int cap) {
		this.setType(type);
		this.range = range;
		this.payload = payload;
		this.capacity = cap;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
