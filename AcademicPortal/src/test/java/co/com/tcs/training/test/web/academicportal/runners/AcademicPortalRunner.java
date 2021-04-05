package co.com.tcs.training.test.web.academicportal.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\features\\academic_portal.feature",
        glue ="co.com.tcs.training.test.web.academicportal.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        tags="@Amount_Credits"
)
public class AcademicPortalRunner {
}
