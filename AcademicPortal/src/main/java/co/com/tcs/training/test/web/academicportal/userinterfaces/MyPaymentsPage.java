package co.com.tcs.training.test.web.academicportal.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class MyPaymentsPage {
    public static final Target DATA_COMPARED = Target.the("compared date").locatedBy("//span[contains(text(),'{0}')]");
}
