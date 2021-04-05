package co.com.tcs.training.test.web.academicportal.tasks;

import co.com.tcs.training.test.web.academicportal.models.FamilyDate;
import co.com.tcs.training.test.web.academicportal.userinterfaces.DataPersonalPage;
import co.com.tcs.training.test.web.academicportal.userinterfaces.MenuStudentComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ToUpdateData implements Task {
    private FamilyDate dataFather;
    private FamilyDate dataMother;

    public ToUpdateData(FamilyDate dataFather, FamilyDate dataMother) {
        this.dataFather = dataFather;
        this.dataMother = dataMother;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuStudentComponent.BUTTON_PERSONAL_DATA),
                Click.on(DataPersonalPage.BUTTON_UPDATE),
                Click.on(DataPersonalPage.FIRST_LIST),
                Enter.theValue(dataFather.getIdentification()).into(DataPersonalPage.FATHER_DOCUMENT),
                Enter.theValue(dataFather.getName()).into(DataPersonalPage.NAME_FATHER),
                Enter.theValue(dataFather.getFirstLastName()).into(DataPersonalPage.FIRST_LASTNAME_FATHER),
                Enter.theValue(dataFather.getSecondLastName()).into(DataPersonalPage.SECOND_LASTNAME_FATHER),
                Click.on(DataPersonalPage.SECOND_LIST),
                Enter.theValue(dataMother.getIdentification()).into(DataPersonalPage.MOTHER_DOCUMENT),
                Enter.theValue(dataMother.getName()).into(DataPersonalPage.NAME_MOTHER),
                Enter.theValue(dataMother.getFirstLastName()).into(DataPersonalPage.FIRST_LASTNAME_MOTHER),
                Enter.theValue(dataMother.getSecondLastName()).into(DataPersonalPage.SECOND_LASTNAME_MOTHER),
                Click.on(DataPersonalPage.BUTTON_SEND_DATA)
        );
    }

    public static ToUpdateData addData(FamilyDate dataFather,FamilyDate dataMother){
        return new ToUpdateData(dataFather,dataMother);
    }
}
