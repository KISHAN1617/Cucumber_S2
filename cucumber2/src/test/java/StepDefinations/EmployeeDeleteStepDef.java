package StepDefinations;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class EmployeeDeleteStepDef {
	@When("I give DELETE request for {string}")
	public void i_give_delete_request_for(String id) {
	RestAssured.given().delete("/delete/"+id);
	}


}
