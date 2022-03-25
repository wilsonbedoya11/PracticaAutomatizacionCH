package co.com.choucair.certification.academy.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Actor_Wilson wants to learn automation at the academy Ch$")
    public void thanActor_WilsonWantsToLearnAutomationAtTheAcademyCh() {

    }

    @When("^he searches for the course Recursos Automatizacion Banco on the choucair academy platform$")
    public void heSearchesForTheCourseRecursosAutomatizacionBancoOnTheChoucairAcademyPlatform()  {

    }

    @Then("^he finds the course called Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledRecursosAutomatizaciónBancolombia()  {

    }

}
