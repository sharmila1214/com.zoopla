import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RestAsuured {
	
	    
		private static final int PORT = 8080;
		private static final String HOST = "localhost";
		private WireMockServer wireMockServer = new WireMockServer(PORT);
		private Response response;
		private ValidatableResponse json;
		@BeforeTest
		void configureSystemUnderTest() throws InterruptedException, IOException {
			wireMockServer.start();
			ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
			mockResponse.withStatus(200).withBodyFile("student.json")
			.withHeader("Content-Type", "application/json");
			WireMock.configureFor(HOST, PORT); 
			WireMock
			.stubFor(WireMock.get("/student/webapi/api/all")
					.willReturn(mockResponse));
		};
			
		@Test
		public void TestGetEndPoint() throws URISyntaxException, IOException {
			String URL ="http://localhost:8080/student/webapi/api/all";
			RestAssured.baseURI =URL;
			response = 	given()
						.contentType(ContentType.JSON)
						.when()
						.get();
			json = response.then().statusCode(200);
			System.out.println(response.asString());
			System.out.println("printing the value of username "+response.jsonPath().getString("username"));
			System.out.println("printing all session ids"+response.jsonPath().getString("sessionid"));
			
			System.out.println("printing last value of session id"+response.jsonPath().getString("sessionid[3]"));
			System.out.println("printing all marks of second student"+response.jsonPath().getString("students[1].marks"));
			//Hashmap<String,String> studentaddress
			System.out.println("printing first  student second city"+response.jsonPath().getString("students[0].adresss.state[1]"));
			System.out.println("printing all cities of second student "+response.jsonPath().getString("students[1].adresss.city"));
			System.out.println("printing second contact value of second student"+response.jsonPath().getString("students[1].contact[1]"));
			System.out.println("printing contacts of all students"+response.jsonPath().getString("students.contact"));
			System.out.println("printing address of first student"+response.jsonPath().getString("students[0].adresss"));

			
		}	
		
		
		@Test
		public void Accessingapi() {
			String URL="https://jsonplaceholder.typicode.com/posts";
			RestAssured.baseURI=URL;
			Response response=given().contentType(ContentType.JSON).when().get();
			json=response.then().statusCode(200);
			System.out.println("response of given  url"+response.asString());
			List<HashMap<String,String>> userlist=response.jsonPath().getList("$");
			for(int i=0;i<userlist.size();i++) {
				
					String userid=String.valueOf(userlist.get(i).get("userId"));
					if(userid.equals("7"))
					System.out.println("titles are   "+userlist.get(i).get("title"));
				}
			}
		
		
	@AfterTest
		void stopWireMockServer() {
			this.wireMockServer.stop();
		}		
		}		
			
