package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Createuser 
{
	@Test
	public void createResourceTest()
	{
		JSONObject jobject=new JSONObject();
		jobject.put("name", "Geeta");
		jobject.put("job", "IT");
		RequestSpecification reqsp=RestAssured.given();
		reqsp.contentType(ContentType.JSON);
		reqsp.body(jobject.toJSONString());
		
		Response resp=reqsp.post("https://reqres.in/api/users");
		System.out.println(resp.then().log().all());
	}

}
