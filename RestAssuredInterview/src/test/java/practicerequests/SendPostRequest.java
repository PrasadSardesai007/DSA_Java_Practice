package practicerequests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

/**
 * 
 *  
 * How to send POST request in Rest Assured ?
 * 
 * 
 * 
 */

/**
 * 
 * HSBC Client Interview/ TAO Digital Or EY Client Interview
 *
 */

public class SendPostRequest {

	public static void main(String[] args) {

		String requestBody = "here is requestbody";
		RestAssured.baseURI = "https://api.example.com";
		RestAssured.basePath = "/orders";

		RequestSpecification spec = given().log().all().contentType("application/json").body(requestBody);

		Response response = spec.post();

		response.then().log().all().assertThat().statusCode(200);

		System.out.println("Response : " + response.asPrettyString());

	}

}
