package data.provider;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.model.Order;

public class OrderProvider extends DataProvider{

	private List<Order> orders;
	
	public OrderProvider(){
		this.orders = new ArrayList<Order>();
	}
	
	@Override
	void load() {
		String query = "SELECT * FROM orders;";
		try{
			ResultSet result = super.executeQuery(query);
			while(result.next()){
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public List<Order> getOrders(){
		return this.orders;
	}

}
