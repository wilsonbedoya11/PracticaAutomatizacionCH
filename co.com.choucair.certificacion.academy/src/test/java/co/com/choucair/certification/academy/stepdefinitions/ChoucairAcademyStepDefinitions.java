package co.com.choucair.certification.academy.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.SearchP;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Actor_Wilson wants to learn automation at the academy Ch$")
    public void thanActor_WilsonWantsToLearnAutomationAtTheAcademyCh() {
        OnStage.theActorCalled("Wilson").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he searches for the course (.*) on the choucair academy platform$")
    public void heSearchesForTheCourseAutomatizacióndePruebasOnTheChoucairAcademyPlatform(String course)  {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchP.the(course));
    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledAutomatizacióndePruebas(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
