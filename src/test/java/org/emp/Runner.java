package org.emp;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C://Users//GT AnnaNagar//Desktop//javaproject//Java//Employee//src//test//resources//Feature//flipkart.feature"}, glue= {"org.emp"})
public class Runner {

}
