package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateMessageQuestion implements Question<Boolean> {
    private String data;

    public ValidateMessageQuestion(String data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.MESSAGE.of(data)).viewedBy(actor).asBoolean();
    }

    public static ValidateMessageQuestion comparedMessage(String data){
        return new ValidateMessageQuestion(data);
    }
}
