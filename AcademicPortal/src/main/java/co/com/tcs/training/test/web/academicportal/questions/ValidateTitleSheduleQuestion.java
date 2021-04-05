package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.ClassSchedulePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateTitleSheduleQuestion implements Question<Boolean> {
    private String title;

    public ValidateTitleSheduleQuestion(String title) {
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ClassSchedulePage.TITLE_PRINCIPAL.of(title)).viewedBy(actor).asBoolean();
    }

    public static ValidateTitleSheduleQuestion comparedTitle(String title){
        return new ValidateTitleSheduleQuestion(title);
    }
}
