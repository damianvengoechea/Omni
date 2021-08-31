package com.omni.stepDefinitions;

import com.omni.tasks.OpenBrowser;
import com.omni.tasks.OrderByProducts;
import com.omni.tasks.PrintResults;
import com.omni.tasks.Searchproduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SearchStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver browser;
    public static final Actor userSearch = Actor.named("userSearch");

    @Before
    public void start(){
        userSearch.can(BrowseTheWeb.with(browser));
    }

    @Given("^that user wants search (.*) (.*) in Amazon$")
    public void thatUserWantsSearchProductInAmazon(String product, String brand) {
        userSearch.wasAbleTo(OpenBrowser.on(),
                Searchproduct.correct(product, brand));
    }
    @When("you find the shoes and sort them")
    public void youFindTheShoesAndSortThem() {
        userSearch.attemptsTo(OrderByProducts.correct());
    }
    @When("prints in descending order")
    public void printsInDescendingOrder() {
         userSearch.attemptsTo(PrintResults.descending());
    }
}
