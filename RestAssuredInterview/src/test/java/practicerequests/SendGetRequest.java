package practicerequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
/**
 * 
 * How do you send a get request in Rest Assured? 
 * Please write a simple script
 * @author Prasad.Sardesai
 *
 */

public class SendGetRequest {
	
	/**
	 * 
	 * 
	 * How to send Get request in Rest Assured ?
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		RestAssured.baseURI="http://216.10.245.166";
		RestAssured.basePath="/Library/GetBook.php";
	
		
		RequestSpecification spec =given()
				.contentType("application/json")
				.queryParam("AuthorName", "Rajesh P");
		
		
		Response response=spec
				.when()
				.get();
		
		response.then().assertThat().statusCode(200);
		
		System.out.println("Response: "+ response.asPrettyString());
		
		
		
		
	}
	
	
	
}
