package com.omni.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/search.feature",
    glue = "com/omni/stepDefinitions",
        snippets = CAMELCASE)
public class Search {
}
