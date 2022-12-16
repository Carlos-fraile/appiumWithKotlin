package stepsDefinitions.confluedentStepsDefs

import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert
import pages.confluedentScreens.loginScreen
import java.util.*
import scripts.Configuration

class loginScreenSteps {
    // PROPERTIES
    var keyProperties: Properties = Configuration().KEY_PROPERTIES_FILE("Confluedent")

    var loginScreen = loginScreen()

    @When("^the user logins with mail '(.*)' and password '(.*)'$")
    fun userLogin(mail: String?, pass: String?) {
        loginScreen.userEnterCredentials(mail, pass)
    }

    @When("^the user click to login button$")
    fun clickLoginButton() {
        loginScreen.clickToLoginButton()
    }

    @When("^the user click to recovery pass button$")
    fun clickRecoveryPassButton() {
        loginScreen.clickToRecoveryPassButton()
    }

    @When("^the user click to sign up button$")
    fun clickSignUpButton() {
        loginScreen.clickToSignUpButton()
    }

    @Then("^a message displayed with the text '(.*)'$")
    fun verifyMessage(key: String) {
        val message: String? = keyProperties.getProperty(key)?.let { it } ?: key
        println("message = $message")
        Assert.assertTrue("The message has not been found containing: $message", loginScreen.verifyMessageText(message!!))
        loginScreen.clickToAcceptButton()
    }
}