package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateButtonStartQuestion implements Question<Boolean> {
    private String nameButton;

    public ValidateButtonStartQuestion(String nameButton) {
        this.nameButton = nameButton;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PrincipalPage.BUTTON_START.of(nameButton)).viewedBy(actor).asBoolean();
    }

    public static ValidateButtonStartQuestion comparedNameButton(String nameButton){
        return new ValidateButtonStartQuestion(nameButton);
    }
}
