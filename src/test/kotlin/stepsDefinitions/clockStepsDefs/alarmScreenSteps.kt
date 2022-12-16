package stepsDefinitions.clockStepsDefs

import io.cucumber.java.en.When
import org.junit.Assert
import pages.clockScreens.alarmScreen

class alarmScreenSteps {
    var alarmScreen = alarmScreen()

    @When("^user clicks on the new alarm button$")
    fun clickToAlarmButton() {
        alarmScreen.clickToAddAlarm()
    }

    @When("^the user sets a time$")
    fun setTime() {
        alarmScreen.setTime()
    }

    @When("^the user verifies that the alarm has been added$")
    fun verifyAlarmIsAdded() {
        Assert.assertTrue("The alarm is not added", alarmScreen.verifyAlarmIsAdded()!!)
    }

    @When("^the user verifies that the alarm is active$")
    fun verifyAlarmIsActivated() {
        Assert.assertTrue("The alarm is not activate.", alarmScreen.verifyAlarmIsActivated()!!)
    }
}