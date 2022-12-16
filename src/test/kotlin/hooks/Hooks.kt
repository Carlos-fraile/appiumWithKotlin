package hooks

import io.cucumber.java.After
import io.cucumber.java.AfterStep
import io.cucumber.java.Before
import io.cucumber.java.Scenario
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import pages.baseAppium.Companion.driver
import java.io.IOException
import java.util.concurrent.TimeUnit


open class Hooks {
    var featureTag: String? = null
    var start = System.currentTimeMillis()

    @Before
    @Throws(IOException::class)
    open fun beforeFeature(scenario: Scenario) {
        featureTag = scenario.sourceTagNames.toString()
        println("---------- Start of Scenario: $featureTag -----------------------")
    }


    @After()
    @Throws(IOException::class)
    open fun afterScenario() {
        driver?.quit()
        val stop = System.currentTimeMillis()
        val actualTimeMinutes = TimeUnit.MILLISECONDS.toSeconds(stop - start) / 60
        val actualTimeSeconds = TimeUnit.MILLISECONDS.toSeconds(stop - start) % 60
        println("---------- End of Scenario: $featureTag -----------------------")
        println("---------- Execution time: $actualTimeMinutes min $actualTimeSeconds s -----------------------")
    }

    @AfterStep
    open fun addScreenshot(scenario: Scenario) {
        if (scenario.isFailed) {
            val screenshot = (driver as TakesScreenshot).getScreenshotAs<ByteArray>(OutputType.BYTES)
            scenario.attach(screenshot, "image/png", "image")
            println("Added screenshot")
        }
    }
}