package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;


public class Sample 
{
	@Test
	public void sampleTest() throws Throwable 
	{
		//step1: Register the driver/database
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step2: connect to data base
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew", "j2ee", "admin");
		
		//step3: issue/create sql statement
		Statement stat=con.createStatement();
		String query="select * from students_info";
		
		//step4: execute sql query
		ResultSet result=stat.executeQuery(query);
		
		//process the result
		while(result.next()) 
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
			
		}
		
		con.close();
		
	}

}
