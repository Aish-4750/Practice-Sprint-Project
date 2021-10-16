package com.buyItemsStepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\seth\\git\\DWS_BUYITEM\\DEMOWEBSHOPSPRINT_PROJECT2\\src\\test\\java\\BuyItemsFeatures", glue = {
		"com.buyItemsStepsDefinition" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReports",
				"junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json" }, strict = true)

public class BuyItemsTestRunner {

}
