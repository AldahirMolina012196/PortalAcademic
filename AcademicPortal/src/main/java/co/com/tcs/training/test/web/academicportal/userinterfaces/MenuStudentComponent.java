package co.com.tcs.training.test.web.academicportal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuStudentComponent {
    public static final Target BUTTON_CLASS_SCHEDULE = Target.the("Select button for consult my class schedule").
            locatedBy("//a[contains(text(),'Mi horario de clases')]");
    public static final Target TITLE_PORTAL_SERVICES = Target.the("Compared title").locatedBy("//font[contains(text(),'{0}')]");
    public static final Target BUTTON_MATERIAL_EARRINGS = Target.the("Select button material earrings").locatedBy("//a[contains(text(),'Asignaturas pendientes')]");
    public static final Target BUTTON_ENROLLED = Target.the("Select button enrolled subjects").locatedBy("//a[contains(text(),'Asignaturas matriculadas')]");
    public static final Target BUTTON_PAYMENTS_MADE = Target.the("select button payments made").locatedBy("//a[contains(text(),'Pagos efectuados')]");
    public static final Target BUTTON_CANCEL_MATTER = Target.the("select button cancel matter").locatedBy("//a[contains(text(),'Cancelación de asignaturas')]");
    public static final Target BUTTON_STORY_ACADEMIC = Target.the("select button cancel matter").locatedBy("//a[contains(text(),'Historias Académicas')]");
    public static final Target BUTTON_PERSONAL_DATA = Target.the("select button data personal").locatedBy("//a[contains(text(),'Datos Personales')]");
    public static final Target BUTTON_SUMMARY_ECONOMIC = Target.the("select button summary economic").locatedBy("//a[contains(text(),'Mi resumen económico de matrícula')]");
    public static final Target BUTTON_ACKNOWLEDGMENTS = Target.the("select button acknowledgments").locatedBy("//a[contains(text(),'Reconocimientos')]");
    public static final Target BUTTON_NOTES_SEMESTER = Target.the("select button nottes per semester").locatedBy("//a[contains(text(),'Notas por semestre')]");
    public static final Target BUTTON_ALL_NOTES = Target.the("select button all my notes").locatedBy("//a[contains(text(),'Todas mis notas')]");
    public static final Target BUTTON_MY_CLASS = Target.the("select button class").locatedBy("//a[contains(text(),'Horario de clases')]");
}
