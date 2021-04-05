package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NotesSemesterPage {
    public static final Target NOTE_ONE = Target.the("note for sum").locatedBy("(//span[@class='PortletText3'])[40]");
    public static final Target NOTE_TWO = Target.the("note for sum").locatedBy("(//span[@class='PortletText3'])[47]");
    public static final Target NOTE_THREE = Target.the("note for sum").locatedBy("(//span[@class='PortletText3'])[54]");
    public static final Target NOTE_FOUR = Target.the("note for sum").locatedBy("(//span[@class='PortletText3'])[61]");
    public static final Target NOTE_FIVE = Target.the("note for sum").locatedBy("(//span[@class='PortletText3'])[68]");
    public static final Target RESULT_AVERANGE = Target.the("note compared").locatedBy("(//td[@class='PortletHeading2'])[6]");
}
