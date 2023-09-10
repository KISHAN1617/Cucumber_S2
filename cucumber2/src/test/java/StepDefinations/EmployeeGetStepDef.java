package StepDefinations;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class EmployeeGetStepDef extends TestBase {
	@Given("API URL {string} is up")
	public void api_url_is_up(String employeeid) {
	RequestSpecification h= RestAssured.given();
	r=h.request(Method.GET, "/employee/"+employeeid );
	}


}
