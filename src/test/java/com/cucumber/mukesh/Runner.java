package com.cucumber.mukesh;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"com.cucumber.mukesh"},
		plugin={"html:target/cucumber-html-report"})
		
public class Runner {

}
