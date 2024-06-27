package prcatice;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
public class Demo1 {
 int id;
    @Test
	public void postRequest() throws FileNotFoundException {
//		HashMap m=new HashMap();
//		m.put("name","benarji");
//		m.put("location", "hyd");
//		String[]courses= {"automation","Qa"};
//		m.put("courses",courses);
//       JSONObject j=new JSONObject();
//       j.put("name","benarji");
//       j.put("location", "hyd");
//		String[]course= {"automation","Qa"};
//		j.put("courses",course);
//    	pojo p=new pojo();
//    	p.setName("narada");
//    	p.setLocation("hyd");
//    	String[]course= {"automation","Qa"};
//    	p.setCourses(course);
    	File f=new File("./body.json");
    	FileReader fr=new FileReader(f);
    	JSONTokener t=new JSONTokener(fr);
    	JSONObject o=new JSONObject(t);
    	
		id=given()
				.contentType("application/json")
		.body(o.toString())
		
		.when()
          .post("http://localhost:3000/students").jsonPath().getInt("id");
		
		
	}
//@Test(dependsOnMethods = "postRequest")
//public void deleteRecord() {
//System.out.println(id);
//	when()
//      .delete("http://localhost:3000/students/"+id)
//    .then()
//      .statusCode(200);
//}

}
