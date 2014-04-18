package data.provider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PackageProvider extends DataProvider{

	private List<Package> packages;
	
	public PackageProvider(){
		this.packages = new ArrayList<Package>();
	}
	
	@Override
	void load() {
		String query = "SELECT * FROM packages;";
		try{
			ResultSet result = super.executeQuery(query);
			while(result.next()){
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public List<Package> getPackages(){
		return this.packages;
	}

}
