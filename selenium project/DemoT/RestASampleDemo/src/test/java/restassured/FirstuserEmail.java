package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstuserEmail 
{
	@Test
	public void getResourceTest()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users?pages=2");
		//display the complete response
		System.out.println(resp.then().log().all());
		String email=resp.jsonPath().get("data[0].email");
		System.out.println(email);
		Assert.assertEquals("george.bluth@reqres.in", email);
	}

}
