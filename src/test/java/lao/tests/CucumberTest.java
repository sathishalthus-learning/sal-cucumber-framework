package lao.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "classpath:/features",
					glue = {"lao"},
					plugin = {"pretty"}
		)
public class CucumberTest {

}
