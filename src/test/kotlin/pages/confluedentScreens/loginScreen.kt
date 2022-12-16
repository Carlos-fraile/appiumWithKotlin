package pages.confluedentScreens

import pages.elements.confluedentElements

open class loginScreen : confluedentElements() {
    var loginElements = confluedentElements()

    open fun userEnterCredentials(mail: String?, pass: String?) {
        setText(loginElements.LOGIN_SCREEN_EMAIL_TEXT_INPUT, mail)
        setText(loginElements.LOGIN_SCREEN_PASS_TEXT_INPUT, pass)

    }

    open fun clickToLoginButton() {
        click(loginElements.LOGIN_SCREEN_LOGIN_BUTTON)
    }

    open fun clickToRecoveryPassButton() {
        click(loginElements.LOGIN_SCREEN_RECOVERY_PASS_BUTTON)
    }

    open fun clickToSignUpButton() {
        click(loginElements.LOGIN_SCREEN_SIGN_UP_BUTTON)
    }

    open fun clickToAcceptButton(){
        click(loginElements.LOGIN_SCREEN_ACCEPT_BUTTON)
    }

    open fun verifyMessageText(text: String): Boolean {
        println("Text element = " + getTextElement(loginElements.LOGIN_SCREEN_MESSAGE_POPUP))
        return verifyElementHasText(loginElements.LOGIN_SCREEN_MESSAGE_POPUP, text)!!
    }
}