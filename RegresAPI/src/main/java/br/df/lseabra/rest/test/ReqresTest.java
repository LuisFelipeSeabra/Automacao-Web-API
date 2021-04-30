package br.df.lseabra.rest.test;

import java.util.Map;
import org.hamcrest.Matchers;
import org.junit.Test;

import br.df.lseabra.rest.core.BaseTest;
import io.restassured.RestAssured;

public class ReqresTest extends BaseTest {
	
	@Test
	public void createUser() {
		
		
		Map<String, String> cliente = criarCliente("name","luis","job","QA");
		
		RestAssured.given()
			.body(cliente)		
		.when()
			.post("/api/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", Matchers.notNullValue());
	}
	@Test
	public void getSingleUser() {
				
		RestAssured.given()	
		.when()
			.get("/api/users/2")
		.then()
	 	.log().all()
	 	.statusCode(200)
		.body("data.id", Matchers.is(2))
		.body("data.email", Matchers.is("janet.weaver@reqres.in"))
		.body("data.first_name", Matchers.is("Janet"))
		.body("data.last_name", Matchers.is("Weaver"));
		
	}
	
	@Test
	public void getListUsers() {
				
		RestAssured.given()	
		.when()
			.get("/api/users?page=2")
		.then()
	 	.log().all()
	 	.statusCode(200)
	 	.body("page", Matchers.is(2))
		.body("data.$", Matchers.hasSize(6))
		.body("data.id", Matchers.hasItems(7,8,9,10,11,12))
		.body("data.first_name", Matchers.hasItems("Michael","Lindsay","Tobias","Byron","George","Rachel"));

	}
	@Test
	public void patchUser() {
		Map<String, String> cliente = criarCliente("name","luis","job","Tester");
		
		RestAssured.given()
			.body(cliente)		
		.when()
			.patch("/api/users/2")
		.then()
			.log().all()
			.statusCode(200)
			.body("updatedAt", Matchers.startsWith(obterData()));
	}

}
