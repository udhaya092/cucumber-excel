package com.org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Fbexcel.feature",glue="com.org.stepdefinition",dryRun=false,monochrome=true,plugin= {"pretty","html:target"})

public class Run {
	
	

}
