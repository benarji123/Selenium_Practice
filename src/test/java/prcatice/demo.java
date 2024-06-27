package prcatice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
public class demo {
 public int id;
//	@Test
//	public void getusers() {
//		 given()
//		  
//		.when()
//		     .get("https://reqres.in/api/users?page=2")
//		.then()
//		   .statusCode(200)
//		    .body("page",equalTo(2))
//		   .log().all();
//	}
	@Test
	public void createUser() {
		 Map<String, String> myHashMap = new HashMap();
		 myHashMap.put("name", "narada");
		 myHashMap.put( "job", "leader");	   
		id=given()
		  .contentType("application/json")
		  .body(myHashMap)
		.when()
		  .post("https://reqres.in/api/users").jsonPath().getInt("id");
		 System.out.println("=====>"+id);
	}
   @Test(dependsOnMethods = "createUser")
	public void getuser() {
		 given()
		  
			.when()
			     .get("https://reqres.in/api/users/"+id)
			.then()
			.log().all();
			  // .statusCode(200)
		        //.log().all();
	}
   
   @Test(dependsOnMethods = "getuser")
   public void updateUser() {
	   Map<String, String> myHashMap = new HashMap();
		 myHashMap.put("name", "alekh");
		 myHashMap.put( "job", "student");	   
		given()
		  .contentType("application/json")
		  .body(myHashMap)
		.when()
		  .put("https://reqres.in/api/users/"+id)
		.then()
		  .log().all();
   }
   @Test(dependsOnMethods = "updateUser")
  	public void getupdateduser() {
  		 given()
  		  
  			.when()
  			     .get("https://reqres.in/api/users/"+id)
  			.then()
  			     //.statusCode(200)
  		        .log().all();
  	}
}



