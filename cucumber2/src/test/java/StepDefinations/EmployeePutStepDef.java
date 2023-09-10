package StepDefinations;
import org.json.JSONObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import junit.framework.Assert;


public class EmployeePutStepDef extends TestBase {
	@When("I give POST request for {string} with age {string} and salary{string}")
			public void i_give_post_request_for_with_age_and_salary(String id, String
			age, String salary) {
			JSONObject p=new JSONObject();
			p.put("name", "Cucumber-S2-S2");
			p.put("salary", salary);
			p.put("age", age);
			String body =p.toString();
			r=RestAssured.given().contentType(ContentType.JSON).body(body).post("/create");
			String responseBody=r.getBody().asString();
			System.out.println("Body retrived through the Rest Assured"+ responseBody);
			}
			@Then("response body should contain {string} with age {string} and salary{string}")
			public void response_body_should_contain_with_age_and_salary(String id,
			String age, String salary) {
			String responseBody=r.getBody().asString();
			String check =null;
			if(responseBody.contains(age)&& responseBody.contains(salary))
			{
			check="Checked";
			}
			System.out.println("Body retrived through the Rest Assured"+ responseBody);
			Assert.assertNotNull(check);
			}


}
