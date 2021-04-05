package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.StoryAcademicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifySectionStoryQuestion implements Question<Boolean> {
    private String data;

    public VerifySectionStoryQuestion(String data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(StoryAcademicPage.TITLE_PRINCIPAL.of(data)).viewedBy(actor).asBoolean();
    }

    public static VerifySectionStoryQuestion comparedAcademic(String data){
        return new VerifySectionStoryQuestion(data);
    }
}
