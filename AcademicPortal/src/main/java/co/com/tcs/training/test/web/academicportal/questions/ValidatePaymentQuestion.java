package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MyPaymentsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidatePaymentQuestion  implements Question<Boolean> {
    private String confirmation;

    public ValidatePaymentQuestion(String confirmation) {
        this.confirmation = confirmation;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(MyPaymentsPage.DATA_COMPARED.of(confirmation)).viewedBy(actor).asBoolean();
    }

    public static ValidatePaymentQuestion comparedPayment(String confirmation){
        return new ValidatePaymentQuestion(confirmation);
    }
}
