package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AllNotesPage {
    public static final Target CREDITS_REQUIRED = Target.the("amount credits required").locatedBy("//span[contains(text(),'109')]");
    public static final Target CREDITS_OBTAINED = Target.the("amount credits obtained").locatedBy("(//span[contains(text(),'94')])[2]");
}
