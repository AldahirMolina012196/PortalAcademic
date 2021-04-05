package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent;
import co.com.tcs.training.test.web.academicportal.userinterfaces.MyclassPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToConsultMyClass implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuStudentComponent.BUTTON_MY_CLASS),
                Click.on(MyclassPage.OPTION_YEAR),
                Click.on(MyclassPage.OPTION_INFORMATIC),
                Click.on(MyclassPage.BUTTON_SEARCH
                )
        );
    }
    public static ToConsultMyClass consultClass(){
        return new ToConsultMyClass();
    }
}
