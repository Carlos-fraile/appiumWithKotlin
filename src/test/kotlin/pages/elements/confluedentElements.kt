package pages.elements

import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import utils.MobilePageObject

open class confluedentElements : MobilePageObject()  {
    // LOGIN SCREEN
    @AndroidFindBy(id = "com.example.confluedent:id/loginButton")
    var LOGIN_SCREEN_LOGIN_BUTTON: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/emailEditText")
    var LOGIN_SCREEN_EMAIL_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/passwordEditText")
    var LOGIN_SCREEN_PASS_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "android:id/message")
    var LOGIN_SCREEN_MESSAGE_POPUP: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/signUpButton")
    var LOGIN_SCREEN_SIGN_UP_BUTTON: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/recoveryPass")
    var LOGIN_SCREEN_RECOVERY_PASS_BUTTON: MobileElement? = null

    @AndroidFindBy(id = "android:id/button1")
    var LOGIN_SCREEN_ACCEPT_BUTTON: MobileElement? = null

    // REGISTER SCREEN
    @AndroidFindBy(id = "com.example.confluedent:id/NombreTextView")
    var REGISTER_SCREEN_NAME_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/ApellidosTextView")
    var REGISTER_SCREEN_LAST_NAME_TEXT_Input: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/dniTextView")
    var REGISTER_SCREEN_DNI_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/addressTextView2")
    var REGISTER_SCREEN_ADDRESS_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/phoneTextView")
    var REGISTER_SCREEN_PHONE_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/EmailTextView")
    var REGISTER_SCREEN_EMAIL_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/passTextView")
    var REGISTER_SCREEN_PASS_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(id = "com.example.confluedent:id/saveButton")
    var REGISTER_SCREEN_SAVE_BUTTON: MobileElement? = null
}