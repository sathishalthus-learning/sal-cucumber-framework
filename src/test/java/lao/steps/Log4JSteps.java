package lao.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.*;

public class Log4JSteps {
	//
	Logger logger = LogManager.getLogger(Log4JSteps.class);
	//
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // 
		logger.info("given - precondition");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // 
		logger.info("and - precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // 
		logger.info("when - an action");
	}

	@When("some other action")
	public void some_other_action() {
	    // 
		logger.info("and - other action");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // 
		logger.info("and - other action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // 
		logger.info("then - validate outcome");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // 
		logger.info("and - valiadte more outcome");
	}


}
