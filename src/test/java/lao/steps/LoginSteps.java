package lao.steps;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	Logger logger = LogManager.getLogger(LoginSteps.class);
	//
	@Given("navigated to login page")
	public void navigated_to_login_page() {
	    // 
		System.out.println("1");
		logger.info("slf4j - testing");
	}

	@When("enters valid credentials {string} and {string}")
	public void enters_valid_credentials_and(String string, String string2) {
	    // 
		System.out.println("2");
	}

	@Then("validate {string} is displayed")
	public void validate_is_displayed(String string) {
	    // 
		System.out.println("3");
	}

}
