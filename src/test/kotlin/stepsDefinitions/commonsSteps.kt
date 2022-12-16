package stepsDefinitions

import io.cucumber.java.en.Given
import pages.baseAppium
import scripts.Configuration
import java.net.MalformedURLException
import java.util.*

class commonsSteps : baseAppium() {
    val configuration = Configuration()

    // PROPERTIES
    var keyProperties: Properties? = null

    @Given("^the user enter to application '(.*)'$")
    @Throws(MalformedURLException::class)
    fun openAplication(propertiesFile: String?) {
        keyProperties = configuration.KEY_PROPERTIES_FILE(propertiesFile)
        if (propertiesFile != null) {
            try {
                setup(propertiesFile)
            } catch (e: Exception) {
                println("Error connecting to Appium Service. Error: " + e.message)
            }
        }
    }
}