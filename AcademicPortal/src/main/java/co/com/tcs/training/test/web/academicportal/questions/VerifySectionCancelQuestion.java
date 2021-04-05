package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.SectionCancelMatterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifySectionCancelQuestion implements Question<Boolean> {
    private String title;

    public VerifySectionCancelQuestion(String title) {
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(SectionCancelMatterPage.TITLE_PRINCIPAL.of(title)).viewedBy(actor).asBoolean();
    }

    public static VerifySectionCancelQuestion comparedTitle(String title){
        return new VerifySectionCancelQuestion(title);
    }

}
