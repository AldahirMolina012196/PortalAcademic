package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryEconomicPage {
    public static final Target PERIOD = Target.the("Select period of studio").locatedBy("(//option[@value='2017-1'])[1]");
    public static final Target COD_COURSE = Target.the("Select code course").locatedBy("//option[@value='8209']");
    public static final Target BUTTON_SEARCH = Target.the("select button search").locatedBy("//input[@title='Buscar']");
    public static final Target CAMP_REFERENCE = Target.the("camp for compared").locatedBy("(//span[@class='PortletText3'])[7]");
}
