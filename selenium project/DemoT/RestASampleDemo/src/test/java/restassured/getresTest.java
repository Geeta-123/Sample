package restassured;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getresTest {
	@Test
	public void getResourceTest()
	{
	Response resp = RestAssured.get("https://reqres.in/api/users?pages=2");
	System.out.println(resp.then().log().all());
	List<Object> lst = resp.jsonPath().get("data.first_name");
	System.out.println(lst);
boolean status=false;
for(Object obj:lst)
{
	System.out.println(obj);;
	if(obj.equals("George"))
	{
		System.out.println("isavailable== pass");
		status= true;
		break;
	}}
	Assert.assertTrue(status);
	Assert.assertEquals(resp.getStatusCode(), 200);
	
}
}
