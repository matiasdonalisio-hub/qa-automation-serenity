package ar.qa.camioneros.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class HealthCheckStepDefinitions {

    @When("{actor} checks the health endpoint")
    public void checksTheHealthEndpoint(Actor actor) {
        actor.attemptsTo(Get.resource("/health"));
    }

    @Then("the API should respond with status {int}")
    public void theApiShouldRespondWithStatus(int expectedStatus) {
        theActorInTheSpotlight().should(
                seeThatResponse("the HTTP status is " + expectedStatus,
                        response -> response.statusCode(expectedStatus)));
    }

    @Then("the service status should be {string}")
    public void theServiceStatusShouldBe(String expectedEstado) {
        theActorInTheSpotlight().should(
                seeThatResponse("the 'estado' field is " + expectedEstado,
                        response -> response.body("estado", equalTo(expectedEstado))));
    }
}
