package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MaterialEarringsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent.BUTTON_MATERIAL_EARRINGS;

public class ToConsultMaterialEarrings implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MATERIAL_EARRINGS),
                Click.on(MaterialEarringsPage.LIST_COURSES),
                Click.on(MaterialEarringsPage.BUTTON_SEARCH)
        );
    }

    public static ToConsultMaterialEarrings listMaterial(){
        return new ToConsultMaterialEarrings();
    }
}
