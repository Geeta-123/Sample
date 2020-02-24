package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class class2 
{
	Connection con;
	@Test
	public void sampleTest() throws Throwable 
	{
		//step1: Register the driver/database
		try {
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step2: connect to data base
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnew", "j2ee", "admin");
		
		//step3: issue/create sql statement
		Statement stat=con.createStatement();
		
		
		String q1="insert into students_info (regno, firstname, middlename, lastname) values('7', 'nis','s.', 'h')";
		int res1=stat.executeUpdate(q1);
		if(res1==1)
		{
			System.out.println("data is inserted");
		}}
		catch(Exception e)
		{
			System.err.println("data is not inserted");
		}
		finally {
		con.close();

}}
}