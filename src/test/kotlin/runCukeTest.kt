import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/features"],
    //tags = "@confluedentApp or @clockApp",
    //tags = "@searchCity",
    glue = ["stepsDefinitions", "stepsDefinitions/confluedentStepsDefs", "stepsDefinitions/clockStepsDefs", "hooks"],
    plugin = ["com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:rerun/failed_scenarios.txt"],
)

class runCukeTest {

}