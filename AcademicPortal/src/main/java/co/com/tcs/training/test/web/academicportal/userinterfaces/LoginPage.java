package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USER = Target.the("Add user").locatedBy("//input[@id='c2']");
    public static final Target INPUT_PASS = Target.the("Add pass").locatedBy("//input[@id='c3']");
    public static final Target BUTTON_CONECTAR = Target.the("select button conectar").locatedBy("(//font[@class='OraFieldText'])[3]");
    public static final Target MESSAGE = Target.the("message compared").locatedBy("//font[@class='OraErrorText']");
}
