package stepsDefinitions.confluedentStepsDefs

import io.cucumber.java.en.When
import pages.confluedentScreens.singUpScreen

class registerScreenSteps {
    var singUpScreen = singUpScreen()
    
    @When("^the user fills in the fields$")
    fun fillRegisterFields() {
        singUpScreen.fillsFields()
    }

    @When("^the user click to save button$")
    fun clickToSaveButton() {
        singUpScreen.clickToRegisterButton()
    }
}