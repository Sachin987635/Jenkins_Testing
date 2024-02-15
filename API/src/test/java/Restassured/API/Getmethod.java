package Restassured.API;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Getmethod {
	public static void main(String[] args) {
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/SeleniumStudents");
		
		System.out.println("Status Code : "+res.statusCode());
	}
}
