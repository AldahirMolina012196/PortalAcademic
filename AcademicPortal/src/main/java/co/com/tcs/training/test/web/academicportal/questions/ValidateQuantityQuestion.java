package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.EnrolledSubjectsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateQuantityQuestion implements Question<Boolean> {
    private String number;

    public ValidateQuantityQuestion(String number) {
        this.number = number;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(EnrolledSubjectsPage.QUANTITY.of(number)).viewedBy(actor).asBoolean();
    }

    public static ValidateQuantityQuestion comparedQuantity(String number){
        return new ValidateQuantityQuestion(number);
    }
}
