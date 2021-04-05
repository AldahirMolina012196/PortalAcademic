package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.DataPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateNameParentsQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DataPersonalPage.DATA_PARENTS).viewedBy(actor).asString();
    }

    public static ValidateNameParentsQuestion comparedName(){
        return new ValidateNameParentsQuestion();
    }
}
