import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployeeDetailsDemo {
	
	
	public static void main(String args[]){  
		
		try{  
			//step 1 load the JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//Step 2 Establish connection with database server
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp","root","root"); 

		//step 3 Create Statement object
		Statement stmt=con.createStatement();  
		//step 4 execute query
		ResultSet rs=stmt.executeQuery("select * from employee where id=10");  
		System.out.println("before while");
		//step 5 get the values from the ResultSet object
		while(rs.next()){  
			System.out.println("inside while");
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		}
		con.close();  

		}catch(Exception e){
			System.out.println("inside catch");
			e.printStackTrace();
		}  

		} 


}
