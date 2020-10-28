package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles/Reminder.feature","FeatureFiles/ToDoMVCUser.feature"}, 
						  
glue="StepDefinitions", plugin="html:target/cucumber-html-report")
public class TestRunner {

}

