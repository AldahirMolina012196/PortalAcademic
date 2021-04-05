package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EnrolledSubjectsPage {
    public static final Target QUANTITY = Target.the("compared number of materials").locatedBy("//td[contains(text(),'{0}')]");
}
