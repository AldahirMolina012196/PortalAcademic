package co.com.tcs.training.test.web.academicportal.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowsChange implements Interaction {
    private String title;

    public WindowsChange(String nameTitle) {
        this.title = nameTitle;
    }

    @Step("{0} change windows")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> displayList = driver.getWindowHandles();
        for(String display: displayList){
            driver.switchTo().window(display);
            if (driver.getTitle().contains(title)){
                break;
            }
        }
        if (!driver.getTitle().contains(title)){
            throw new NoSuchWindowException("No se encontro una ventana con el titulo "+ title);
        }
    }

    public static WindowsChange withTitle(String title){
        return Tasks.instrumented(WindowsChange.class, title);
    }
}
