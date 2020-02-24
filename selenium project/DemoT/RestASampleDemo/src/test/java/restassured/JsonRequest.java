package restassured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonRequest 
{
	@Test
	public void createResourceTest() throws IOException
	{
	FileInputStream fis=new FileInputStream(new File("./src/test/resources/data.json"));
	RequestSpecification reqsp=RestAssured.given();
	reqsp.contentType(ContentType.JSON);
	reqsp.body(IOUtils.toString(fis));
	
	Response resp=reqsp.post("https://reqres.in/api/users");
	System.out.println(resp.then().log().all());
	}
	

}
