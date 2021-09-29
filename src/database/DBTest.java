package database;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String URL = "jdbc:mysql://localhost:3306/ecommerce";
		String Username = "root";
		String Password = "root";
		
		DBConnection dbObj = new DBConnection(URL, Username, Password);
		
		Statement statement = dbObj.getConnection().createStatement();
		
		CallableStatement statement1 = dbObj.getConnection().prepareCall("{call add_product(?, ?)}");
		
		//statement.executeUpdate("insert into eproduct (name, price, date_added) value ('Mobile', 9000.00, now())");
		
		//statement.executeUpdate("create database mydatabase");
		
		//statement.executeUpdate("drop database mydatabase");
		
		//statement.executeUpdate("update eproduct set ID=4 where name ='Mobile'");
		
		//statement1.setString(1, "Washing Machine");
		
		//statement1.setInt(2, 5000);
		
		//statement1.executeUpdate();
		
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		
		while(result.next()) {
			
			System.out.println("ID: " + result.getInt("ID"));
			System.out.println("Name: " + result.getString("name"));
			
		}
		
		dbObj.closeConnection();

	}

}
