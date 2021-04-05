package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyclassPage {
    public static final Target CLASS_COMPARED = Target.the("Title class compared").locatedBy("(//span[@class='PortletText3'])[6]");
    public static final Target OPTION_YEAR = Target.the("Select year class shedule").locatedBy("//option[@value='40#2019']");
    public static final Target OPTION_INFORMATIC = Target.the("Select plan infomatic").locatedBy("//option[@value='8210#941']");
    public static final Target BUTTON_SEARCH = Target.the("select button search").locatedBy("//input[@title='Buscar']");
}
