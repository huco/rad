package data.model;

public class Package {

	private int volume;
	private int weight;

	public Package(int volume, int weight) {
		this.volume = volume;
		this.weight = weight;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
