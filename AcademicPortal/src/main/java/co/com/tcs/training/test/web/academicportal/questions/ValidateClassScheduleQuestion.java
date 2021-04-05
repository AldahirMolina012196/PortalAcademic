package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MyclassPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateClassScheduleQuestion implements Question<Boolean> {
    private String data;

    public ValidateClassScheduleQuestion(String data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(MyclassPage.CLASS_COMPARED.of(data)).viewedBy(actor).asBoolean();
    }

    public static ValidateClassScheduleQuestion datacompared(String data){
        return new ValidateClassScheduleQuestion(data);
    }
}
