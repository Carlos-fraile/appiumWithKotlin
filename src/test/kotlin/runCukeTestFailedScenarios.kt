import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["@rerun/failed_scenarios.txt"],
    tags = "",
    glue =  ["stepsDefinitions", "stepsDefinitions/confluedentStepsDefs", "stepsDefinitions/clockStepsDefs", "hooks"],
    plugin = ["com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/SparkReport/rerun.html", "rerun:rerun/failed_scenarios.txt"],
)
class runCukeTestFailedScenarios {
}