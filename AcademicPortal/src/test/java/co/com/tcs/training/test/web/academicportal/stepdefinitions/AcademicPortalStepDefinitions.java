package co.com.tcs.training.test.web.academicportal.stepdefinitions;

import co.com.tcs.training.test.web.academicportal.models.Credentials;
import co.com.tcs.training.test.web.academicportal.models.FamilyDate;
import co.com.tcs.training.test.web.academicportal.questions.*;
import co.com.tcs.training.test.web.academicportal.tasks.*;
import co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.List;

import static co.com.tcs.training.test.web.academicportal.questions.ValidateAverangeQuestion.confirmationAverange;
import static co.com.tcs.training.test.web.academicportal.questions.ValidateCreditsPendingQuestion.confirmationResult;
import static co.com.tcs.training.test.web.academicportal.questions.ValidateMaterialPenddingQuestion.comparedNameMaterial;
import static co.com.tcs.training.test.web.academicportal.tasks.ToConsultMyClass.consultClass;
import static co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent.*;

public class AcademicPortalStepDefinitions {
    @Managed
    private WebDriver myDriver;
    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDriver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.politecnicojic.edu.co"));
    }

    @Given("^Login in the academic portal$")
    public void loginInTheAcademicPortal(List<Credentials> credentials) {
        OnStage.theActorInTheSpotlight().wasAbleTo(ToLogin.addCredentials(credentials.get(0)));
    }

    @When("^the user of the system consult the class schedule (.*)$")
    public void theUserOfTheSystemConsultTheClassSchedule(String data) {
        OnStage.theActorInTheSpotlight().attemptsTo(ToConsultClassSchedule.consultSchedule(data));
    }

    @Then("^Visibility message (.*)$")
    public void visibilityMessage(String title) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTitleSheduleQuestion.comparedTitle(title)));
    }

    @Then("^Visibility title (.*)$")
    public void visibilityTitlePortalDeServicios(String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTitleMenuQuestion.comparedTitleMenu(title)));
    }

    @When("^the user required consult the material pendding$")
    public void theUserRequiredConsultTheMaterialPendding() {
        OnStage.theActorInTheSpotlight().attemptsTo(ToConsultMaterialEarrings.listMaterial());
    }

    @Then("^Validated name material pendding (.*)$")
    public void validatedNameMaterialPenddingTRABAJODEGRADO(String nameMaterial) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(comparedNameMaterial(nameMaterial)));
    }

    @When("^Enrolled subjects are consulted$")
    public void enrolledSubjectsAreConsulted() {
       OnStage.theActorInTheSpotlight().attemptsTo(Click.on(MenuStudentComponent.BUTTON_ENROLLED));
    }

    @Then("^It is validated that the quantity is equal to (.*)$")
    public void itIsValidatedThatTheQuantityIsEqualTo(String numberMaterials) {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateQuantityQuestion.comparedQuantity(numberMaterials)));
    }

    @Then("^It is validated that the number of credits is equal to (.*)$")
    public void itIsValidatedThatTheNumberOfCreditsIsEqualTo(String numberCredits) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateQuantityQuestion.comparedQuantity(numberCredits)));
    }

    @When("^the payments made are consulted$")
    public void thePaymentsMadeAreConsulted() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_PAYMENTS_MADE));
    }

    @Then("^the last successful payment is validated (.*)$")
    public void theLastSuccessfulPaymentIsValidatedSI(String compared) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePaymentQuestion.comparedPayment(compared)));
    }

    @When("^you enter the section$")
    public void youEnterTheSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_CANCEL_MATTER));
    }
/*
    @Then("^verify the existence of the section (.*)$")
    public void verifyTheExistenceOfTheSectionCancelaciónDeAsignaturas(String data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySectionCancelQuestion.comparedTitle(data), is(equalTo(true))));
    }*/

    @When("^you enter the section story academic$")
    public void youEnterTheSectionStoryAcademic() {
       OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_STORY_ACADEMIC));
    }

    @Then("^verify the existence section story academic (.*)$")
    public void verifyTheExistenceSectionStoryAcademicMisExpedientes(String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySectionStoryQuestion.comparedAcademic(title)));
    }

    @When("^the user enters the data$")
    public void theUserEntersTheData(List<FamilyDate> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(ToUpdateData.addData(data.get(0),data.get(1)));
    }

    @Then("^It is validated that the father's name has been saved (.*)$")
    public void itIsValidatedThatTheFatherSNameHasBeenSavedANTONIOMOLINAOSORIO(String nameFather) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNameParentsQuestion.comparedName(), Matchers.containsString(nameFather)));
    }

    @When("^when you enter the payment summary section$")
    public void whenYouEnterThePaymentSummarySection() {
        OnStage.theActorInTheSpotlight().attemptsTo(ToConsultSummaryEconomic.summaryEconomic());
    }

    @Then("^it is verified that the payment reference is equal to (.*)$")
    public void itIsVerifiedThatThePaymentReferenceIsEqualTo(String reference) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySummaryEconomicQuestion.comparedSummary(),Matchers.containsString(reference)));
    }

    @When("^you enter the recognitions$")
    public void youEnterTheRecognitions() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_ACKNOWLEDGMENTS));
    }

    @Then("^it is validated that they are approved (.*)$")
    public void itIsValidatedThatTheyAreApprovedAPROBADO(String compared) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAcknowledgmentsQuestion.comparedApproved(),Matchers.containsString(compared)));
    }

    @When("^Enter the notes section by semester$")
    public void enterTheNotesSectionBySemester() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_NOTES_SEMESTER));
    }

    @Then("^It is validated that the average is equal to (.*)$")
    public void itIsValidatedThatTheAverageIsEqualTo(double value) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(confirmationAverange(),Matchers.is(Matchers.equalTo(value))));
    }

    @When("^you enter the section of all my notes$")
    public void youEnterTheSectionOfAllMyNotes() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_ALL_NOTES));
    }

    @Then("^It is validated that the number of outstanding credits is equal to (\\d+)$")
    public void itIsValidatedThatTheNumberOfOutstandingCreditsIsEqualTo(int value) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(confirmationResult(),Matchers.is(Matchers.equalTo(value))));
    }

    @When("^you enter the class schedule section$")
    public void youEnterTheClassScheduleSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(consultClass());
    }

    @Then("^The name of the subject (.*) is validated$")
    public void theNameOfTheSubjectOPERATIONALINVESTIGATIONIsValidated(String data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateClassScheduleQuestion.datacompared(data)));
    }

    @Given("^The user tries to enter$")
    public void theUserTriesToEnter(List<Credentials> credentials) {
        OnStage.theActorInTheSpotlight().wasAbleTo(ToLogin.addCredentials(credentials.get(0)));
    }

    @Then("^The message is validated (.*)$")
    public void theMessageIsValidatedVuelvaAIntentarlo(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageQuestion.comparedMessage(message)));
    }

    @When("^personal data is entered and session is closed without saving$")
    public void personalDataIsEnteredAndSessionIsClosedWithoutSaving(List<FamilyDate> data) {
       OnStage.theActorInTheSpotlight().attemptsTo(ToAddDataSignOf.addData(data.get(0), data.get(1)));
    }

    @Then("^indicates by means of a message that the data will be lost (.*)$")
    public void indicatesByMeansOfAMessageThatTheDataWillBeLostLosDatosIngresadosSePerderan(String message) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageQuestion.comparedMessage(message)));
    }


    @After
    public void signOf(){
        OnStage.theActorInTheSpotlight().attemptsTo(ToSignOf.finalSesion());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateButtonStartQuestion.comparedNameButton("Inicio")));
    }
}
