package StepDefinations;
import org.json.JSONObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;


public class EmployePostStepDef  extends TestBase{
	@Given("API {string} is up")
	public void api_is_up(String URI) {
	RestAssured.baseURI = URI;
	}
	@When("I give POST request for {string}")
	public void i_give_post_request_for(String name) {
	JSONObject p=new JSONObject();
	p.put("name", name);
	p.put("salary", "12345");
	p.put("age", "60");
	String body =p.toString();
	r=RestAssured.given().contentType(ContentType.JSON).body(body).post("/create");
	}
	@Then("I should get status code {int}")
	public void i_should_get_status_code(Integer Estatuscode) {
	int actualStatuscode=r.getStatusCode();
	System.out.println("Status code is retived throughRestAssured"+actualStatuscode);
	// Assert.assertEquals(Estatuscode,actualStatuscode);
	}
	@Then("response body should contain {string}")
	public void response_body_should_contain(String name) {
	String responseBody=r.getBody().asString();
	String check =null;
	if(responseBody.contains(name))
	{
	check="Checked";
	}
	Assert.assertNotNull(check);
	}
	}



