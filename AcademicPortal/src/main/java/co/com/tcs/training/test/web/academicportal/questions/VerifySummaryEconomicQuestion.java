package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.SummaryEconomicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifySummaryEconomicQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SummaryEconomicPage.CAMP_REFERENCE).viewedBy(actor).asString();
    }

    public static VerifySummaryEconomicQuestion comparedSummary(){
        return new VerifySummaryEconomicQuestion();
    }
}
