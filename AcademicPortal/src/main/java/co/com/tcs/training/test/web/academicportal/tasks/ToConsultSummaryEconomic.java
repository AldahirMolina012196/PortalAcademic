package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent;
import co.com.tcs.training.test.web.academicportal.userinterfaces.SummaryEconomicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToConsultSummaryEconomic implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuStudentComponent.BUTTON_SUMMARY_ECONOMIC),
                Click.on(SummaryEconomicPage.PERIOD),
                Click.on(SummaryEconomicPage.COD_COURSE),
                Click.on(SummaryEconomicPage.BUTTON_SEARCH)
        );
    }

    public static ToConsultSummaryEconomic summaryEconomic(){
        return new ToConsultSummaryEconomic();
    }
}
