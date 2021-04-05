package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.NotesSemesterPage;
import co.com.tcs.training.test.web.academicportal.utils.CharacterChange;
import co.com.tcs.training.test.web.academicportal.utils.ConvertDouble;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAverangeQuestion implements Question<Double> {
    @Override
    public Double answeredBy(Actor actor) {
        double suma = 0;
        suma = suma + ConvertDouble.convertValues(CharacterChange.number(Text.of(NotesSemesterPage.NOTE_ONE).viewedBy(actor).asString()));
        suma = suma + ConvertDouble.convertValues(CharacterChange.number(Text.of(NotesSemesterPage.NOTE_TWO).viewedBy(actor).asString()));
        suma = suma + ConvertDouble.convertValues(CharacterChange.number(Text.of(NotesSemesterPage.NOTE_THREE).viewedBy(actor).asString()));
        suma = suma + ConvertDouble.convertValues(CharacterChange.number(Text.of(NotesSemesterPage.NOTE_FOUR).viewedBy(actor).asString()));
        suma = suma + ConvertDouble.convertValues(CharacterChange.number(Text.of(NotesSemesterPage.NOTE_FIVE).viewedBy(actor).asString()));
        return suma/5;
    }

    public static ValidateAverangeQuestion confirmationAverange(){
        return new ValidateAverangeQuestion();
    }
}
