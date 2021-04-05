package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.interactions.WaitMoment;
import co.com.tcs.training.test.web.academicportal.interactions.WindowsChange;
import co.com.tcs.training.test.web.academicportal.models.Credentials;
import co.com.tcs.training.test.web.academicportal.userinterfaces.LoginPage;
import co.com.tcs.training.test.web.academicportal.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.training.test.web.academicportal.userinterfaces.LoginPage.*;
import static co.com.tcs.training.test.web.academicportal.userinterfaces.PrincipalPage.BUTTON_PORTAL;
import static co.com.tcs.training.test.web.academicportal.userinterfaces.PrincipalPage.BUTTON_STUDENTS;

public class ToLogin implements Task {
    private Credentials data;

    public ToLogin(Credentials data) {
        this.data = data;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Click.on(BUTTON_STUDENTS),
                Click.on(BUTTON_PORTAL),
                WaitMoment.just(5000),
                WindowsChange.withTitle("Sign In"),
                Click.on(INPUT_USER),
                Enter.theValue(data.getUser()).into(INPUT_USER),
                Enter.theValue(data.getPass()).into(INPUT_PASS),
                Click.on(BUTTON_CONECTAR)
        );

    }
    public static ToLogin addCredentials(Credentials data){
        return Tasks.instrumented(ToLogin.class, data);
    }
}
