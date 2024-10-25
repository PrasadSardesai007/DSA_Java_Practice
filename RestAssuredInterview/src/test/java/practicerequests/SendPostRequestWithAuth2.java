package practicerequests;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SendPostRequestWithAuth2 {

	public static void main(String[] args) {
		String requestBody = "here is requestbody";
		RestAssured.baseURI = "https://api.example.com";
		RestAssured.basePath = "/orders";

		RequestSpecification spec = given().log().all()
				.auth()
				.oauth2("token")
				.contentType("application/json").body(requestBody);

		Response response = spec.post();

		response.then().log().all().assertThat().statusCode(200);

		System.out.println("Response : " + response.asPrettyString());


	}

}
