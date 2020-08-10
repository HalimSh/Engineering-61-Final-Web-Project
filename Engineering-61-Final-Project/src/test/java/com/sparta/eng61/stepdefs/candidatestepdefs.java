package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class candidatestepdefs {
    WebDriver webDriver = new ChromeDriver();
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);
    //    SendAssessment sendAssessment = new SendAssessment(webDriver);

    @Given("A candidate has been contacted")
    //------Method needed from Mohamed's class
    public void aCandidateHasBeenContacted() {
    }

    @When("I go to the dispatches page")
    public void iGoToTheDispatchesPage() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }

    @Then("I should see their name")
    public void iShouldSeeTheirName() {
        iGoToTheDispatchesPage();
       // Assertions.assertEquals(sendAssessment.isSentInfoIncludeName,dispatchesPage.getCandName());
    }

    @Then("I should see their email")
    public void iShouldSeeTheirEmail() {
        iGoToTheDispatchesPage();
        //Assertions.assertEquals(sendAssessment.isSentInfoIncludeEmail,dispatchesPage.getCandidateEmail());
    }
}