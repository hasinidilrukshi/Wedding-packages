package service_package;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class package_control {
	
	//Connect DB
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	

	//Insert Data Function
	
	public static boolean insertdata (String title,String description,String price,String event_duration,String max_guests,String event_type,String package_type) {
		
		boolean isSuccess = false;
		
		try {
			//DB Connection Call
			con = DBconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL QUERY
			String sql = "insert into service values(0,'"+title+"','"+description+"','"+price+"','"+event_duration+"','"+max_guests+"','"+event_type+"','"+package_type+"')";
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true;
				
			}
			else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//Display Data
	//Get By Id
	
	public static List<pakageModel> getById(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<pakageModel> service = new ArrayList<>();
		
		try {
			//DBConnection
			con=DBconnection.getConnection();
			stmt=con.createStatement();
			
			//Query
			String sql = "select * from service where id'"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String price = rs.getString(4);
				String event_duration = rs.getString(5);
				String max_guests = rs.getString(6);
				String event_type = rs.getString(7);
				String package_type = rs.getString(8);
				
				pakageModel pk = new pakageModel(id,title,description,price,event_duration,max_guests,event_type,package_type);
				service.add(pk);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return service;
	}
	
	//GetAll Data
	public static List<pakageModel> getAllservice(){
		
		ArrayList<pakageModel> services = new ArrayList<>();
		
		try {
			//DBConnection
			con=DBconnection.getConnection();
			stmt=con.createStatement();
			
			//Query
			String sql = "select * from service";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id                = rs.getInt(1);
				String title          = rs.getString(2);
				String description    = rs.getString(3);
				String price          = rs.getString(4);
				String event_duration = rs.getString(5);
				String max_guests     = rs.getString(6);
				String event_type     = rs.getString(7);
				String package_type   = rs.getString(8);
				
				pakageModel pk = new pakageModel(id,title,description,price,event_duration,max_guests,event_type,package_type);
				services.add(pk);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return services;
	}
	
	//Update Data
	public static boolean updatedata(String id,String title,String description,String price,String event_duration,String max_guests,String event_type,String package_type ) {
		try {
			//DBConnection
			con=DBconnection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql ="update service set title='"+title+"',description='"+description+"',price='"+price+"',event_duration='"+event_duration+"',max_guests='"+max_guests+"',event_type='"+event_type+"',package_type='"+package_type+"'"
			             +"where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
				
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//Delete Data
	public static boolean deletedata(String id) {
		int convID = Integer.parseInt(id);
		try {
			//DBConnection
			con=DBconnection.getConnection();
			stmt=con.createStatement();
			
			String sql = "delete from service where id='"+convID+"'";
			
			int rs = stmt.executeUpdate(sql);
			if(rs > 0) {
				isSuccess = true;
				}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
}
