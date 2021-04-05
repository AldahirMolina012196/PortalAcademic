package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateTitleMenuQuestion implements Question<Boolean> {
    private String titlePrincipal;

    public ValidateTitleMenuQuestion(String titlePrincipal) {
        this.titlePrincipal = titlePrincipal;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(MenuStudentComponent.TITLE_PORTAL_SERVICES.of(titlePrincipal)).viewedBy(actor).asBoolean();
    }

    public static ValidateTitleMenuQuestion comparedTitleMenu(String titlePrincipal){
        return new ValidateTitleMenuQuestion(titlePrincipal);
    }
}
