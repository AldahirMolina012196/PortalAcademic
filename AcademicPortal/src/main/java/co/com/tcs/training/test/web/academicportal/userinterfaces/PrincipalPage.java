package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {
    public static final Target BUTTON_STUDENTS = Target.the("Select button students").locatedBy("//a[contains(text(),'Estudiantes')]");
    public static final Target BUTTON_PORTAL = Target.the("select button portal students").locatedBy("//a[contains(text(),'Portal Académico')]");
    public static final Target BUTTON_START = Target.the("Validated existence").locatedBy("//a[contains(text(),'{0}')]");
}
