package co.com.tcs.training.test.web.academicportal.questions;

import co.com.tcs.training.test.web.academicportal.userinterfaces.MaterialEarringsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateMaterialPenddingQuestion implements Question<Boolean> {
    private String nameMaterial;

    public ValidateMaterialPenddingQuestion(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(MaterialEarringsPage.NAME_MATERIAL_PENDDING.of(nameMaterial)).viewedBy(actor).asBoolean();
    }

    public static ValidateMaterialPenddingQuestion comparedNameMaterial(String nameMaterial){
        return new ValidateMaterialPenddingQuestion(nameMaterial);
    }
}
