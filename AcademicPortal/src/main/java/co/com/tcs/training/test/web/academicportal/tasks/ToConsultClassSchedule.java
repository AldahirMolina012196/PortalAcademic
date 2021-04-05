package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.interactions.WaitMoment;
import co.com.tcs.training.test.web.academicportal.interactions.WindowsChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.training.test.web.academicportal.userinterfaces.ClassSchedulePage.*;
import static co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent.BUTTON_CLASS_SCHEDULE;
import static co.com.tcs.training.test.web.academicportal.userinterfaces.SignOfComponent.BUTTON_SIGN_OF;

public class ToConsultClassSchedule implements Task {
    private String data;

    public ToConsultClassSchedule(String data) {
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CLASS_SCHEDULE),
                WaitMoment.just(5000),
                WindowsChange.withTitle("Impresión Horario de Matrícula"),
                Enter.theValue(data).into(INPUT_ID),
                Click.on(PLAN_LIST),
                Click.on(OPTION_INFORMATIC),
                Click.on(BUTTON_ENTRY),
                WaitMoment.just(5000)
        );
    }

    public static ToConsultClassSchedule consultSchedule(String data){
        return new ToConsultClassSchedule(data);
    }
}
