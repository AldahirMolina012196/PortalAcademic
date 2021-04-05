package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MaterialEarringsPage {
    public static final Target LIST_COURSES = Target.the("select course principal").locatedBy("//option[@value='8210#941']");
    public static final Target BUTTON_SEARCH = Target.the("select button search").locatedBy("//input[@title='Buscar']");
    public static final Target NAME_MATERIAL_PENDDING = Target.the("compared name").locatedBy("//span[contains(text(),'0')]");
}
