package stepsDefinitions.clockStepsDefs

import io.cucumber.java.en.When
import pages.clockScreens.homeScreen

class homeScreenSteps {
    var homeScreen = homeScreen()

    @When("^the user click to world clock button$")
    fun clickToWorldButton() {
        homeScreen.clickToWorldButton()
    }

    @When("^the user clicks to alarm button$")
    fun clickToAlarmButton() {
        homeScreen.clickToAlarmButton()
    }
}