package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.AcknowledgmentsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyAcknowledgmentsQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AcknowledgmentsPage.CAMP_RESULT).viewedBy(actor).asString();
    }

    public static VerifyAcknowledgmentsQuestion comparedApproved(){
        return new VerifyAcknowledgmentsQuestion();
    }
}
