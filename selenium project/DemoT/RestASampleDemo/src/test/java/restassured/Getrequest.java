package restassured;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getrequest 
{
@Test
public void getResponseTest()
{
	Response resp= RestAssured.get("https://reqres.in/api/users?pages=2");
	System.out.println(resp.asString());
	System.out.println(resp.then().log().all());
	int actsc=resp.getStatusCode();
	System.out.println(actsc);
	Assert.assertEquals(actsc, 200);
	String rect=resp.getContentType();
	System.out.println(rect);
	Assert.assertEquals(rect, "application/json; charset=utf-8");
}
}
