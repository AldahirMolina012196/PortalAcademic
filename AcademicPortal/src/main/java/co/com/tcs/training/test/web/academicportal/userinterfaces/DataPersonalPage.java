package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DataPersonalPage {
    public static final Target BUTTON_UPDATE = Target.the("select button update").locatedBy("//input[@value='Modificar']");
    public static final Target FIRST_LIST = Target.the("select  first type document").locatedBy("(//option[contains(text(),'CEDULA DE CIUDADANIA')])[1]");
    public static final Target SECOND_LIST = Target.the("select second type document").locatedBy("(//option[contains(text(),'CEDULA DE CIUDADANIA')])[2]");
    public static final Target FATHER_DOCUMENT = Target.the("add father document").locatedBy("//input[@name='familiaresPadreDni']");
    public static final Target MOTHER_DOCUMENT = Target.the("add mother document").locatedBy("//input[@name='familiaresMadreDni']");
    public static final Target NAME_FATHER =  Target.the("add name of father").locatedBy("//input[@name='familiaresPadreNombre']");
    public static final Target NAME_MOTHER =  Target.the("add name of mother").locatedBy("//input[@name='familiaresMadreNombre']");
    public static final Target FIRST_LASTNAME_FATHER =  Target.the("add lastname of father").locatedBy("//input[@name='familiaresPadreApellido1']");
    public static final Target FIRST_LASTNAME_MOTHER =  Target.the("add lastname of mother").locatedBy("//input[@name='familiaresMadreApellido1']");
    public static final Target SECOND_LASTNAME_FATHER =  Target.the("add second lastname of father").locatedBy("//input[@name='familiaresPadreApellido2']");
    public static final Target SECOND_LASTNAME_MOTHER =  Target.the("add second lastname of mother").locatedBy("//input[@name='familiaresMadreApellido2']");
    public static final Target BUTTON_SEND_DATA = Target.the("Select button send data").locatedBy("//a[@class='PortletSubHeaderLink']");
    public static final Target DATA_PARENTS = Target.the("compared data father").locatedBy("(//span[@class='PortletText1'])[9]");

}
