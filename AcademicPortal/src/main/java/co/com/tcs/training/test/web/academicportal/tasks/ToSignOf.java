package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.interactions.WindowsChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tcs.training.test.web.academicportal.userinterfaces.SignOfComponent.BUTTON_SIGN_OF;

public class ToSignOf implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // WindowsChange.withTitle("Inicio - Portal de Servicios - Universidad ---"),
                Click.on(BUTTON_SIGN_OF)
        );
    }

    public static ToSignOf finalSesion(){
        return new ToSignOf();
    }
}
