package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.AllNotesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateCreditsPendingQuestion implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        int result = 0;
        result = Integer.parseInt(Text.of(AllNotesPage.CREDITS_REQUIRED).viewedBy(actor).asString()) -
                Integer.parseInt(Text.of(AllNotesPage.CREDITS_OBTAINED).viewedBy(actor).asString());
        return result;
    }

    public static ValidateCreditsPendingQuestion confirmationResult(){
        return new ValidateCreditsPendingQuestion();
    }

}
