package data.provider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.model.Airplane;

public class AirplaneProvider extends DataProvider {

	private List<Airplane> airplanes;

	public AirplaneProvider() {
		airplanes = new ArrayList<Airplane>();
	}

	@Override
	void load() throws Exception{
		if(!super.connectionSet())
			throw new Exception("Database connection not set");
		
		String query = "SELECT * FROM airplanes;";
		try {
			ResultSet result = super.executeQuery(query);
			while (result.next()) {
				String type = result.getString("type");
				int range = result.getInt("range");
				int payload = result.getInt("payload");
				int capacity = result.getInt("capacity");
				
				Airplane newPlane = new Airplane(type, range, payload, capacity);
				airplanes.add(newPlane);
			}
		} catch (SQLException e) {

		}
	}
	
	public List<Airplane> getAirplanes(){
		return this.airplanes;
	}

}
