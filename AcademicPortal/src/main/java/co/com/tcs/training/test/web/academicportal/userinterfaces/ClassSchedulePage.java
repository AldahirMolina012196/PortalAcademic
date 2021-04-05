package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ClassSchedulePage  {
    public static final Target INPUT_ID = Target.the("Add id").locatedBy("//input[@name]");
    public static final Target PLAN_LIST = Target.the("Select list").locatedBy("//select[@name='password']");
    public static final Target OPTION_INFORMATIC = Target.the("Select plan infomatic").locatedBy("//option[@value='8210']");
    public static final Target BUTTON_ENTRY = Target.the("select button entry").locatedBy("//input[@value='Entrada']");
    public static final Target TITLE_PRINCIPAL = Target.the("title for validate").locatedBy("//td[contains(text(),'{0}')]");
}
