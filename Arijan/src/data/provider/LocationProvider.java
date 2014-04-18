package data.provider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.model.Location;

public class LocationProvider extends DataProvider{

	private List<Location> locations;
	
	public LocationProvider(){
		this.locations = new ArrayList<Location>();
	}
	
	@Override
	void load() {
		String query = "SELECT * FROM locations;";
		try{
			ResultSet result = super.executeQuery(query);
			while(result.next()){
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public List<Location> getLocation(){
		return this.locations;
	}

}
