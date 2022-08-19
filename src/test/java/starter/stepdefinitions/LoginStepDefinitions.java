package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("(.*) has an active english account")
    public void julian_has_an_active_account(String name){
        this.name=name;

    }

    @When("he books their class for the next day")
    public void he_books_their_class_for_the_next_day(){
        theActorCalled(name).attemptsTo(
                DoLogin.withCredentials("1006693450","dragones123")
        );
    }

    @Then("he should have schedule his class correctly")
    public void he_should_have_schedule_his_class_correctly(){

    }
}
