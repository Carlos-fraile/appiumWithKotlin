package pages.confluedentScreens

import pages.elements.confluedentElements
import scripts.Configuration
import java.util.*


open class singUpScreen : confluedentElements() {
    // PROPERTIES
    private val properties: Properties = Configuration().USER_INFO_PROPERTIES_FILE("Confluedent")

    var registerElements = confluedentElements()

    open fun fillsFields() {
        val address: String = (singUpScreen().properties.getProperty("country") + ", "
                + singUpScreen().properties.getProperty("province") + ", "
                + singUpScreen().properties.getProperty("city") + ", "
                + singUpScreen().properties.getProperty("zip_code") + ", "
                + singUpScreen().properties.getProperty("type_street") + ", "
                + singUpScreen().properties.getProperty("street") + ", "
                + singUpScreen().properties.getProperty("home_number") + ", "
                + singUpScreen().properties.getProperty("buildin_block") + ", "
                + singUpScreen().properties.getProperty("stairs") + ", "
                + singUpScreen().properties.getProperty("floor") + ", "
                + singUpScreen().properties.getProperty("door"))
        setText(
            singUpScreen().registerElements.REGISTER_SCREEN_NAME_TEXT_INPUT,
            singUpScreen().properties.getProperty("first_name")
        )
        setText(
            singUpScreen().registerElements.REGISTER_SCREEN_LAST_NAME_TEXT_Input,
            singUpScreen().properties.getProperty("last_name")
        )
        setText(
            singUpScreen().registerElements.REGISTER_SCREEN_DNI_TEXT_INPUT,
            singUpScreen().properties.getProperty("nif")
        )
        setText(singUpScreen().registerElements.REGISTER_SCREEN_ADDRESS_TEXT_INPUT, address)
        setText(
            singUpScreen().registerElements.REGISTER_SCREEN_PHONE_TEXT_INPUT,
            singUpScreen().properties.getProperty("prefix_phone") + singUpScreen().properties.getProperty("phone_number")
        )
        setText(singUpScreen().registerElements.REGISTER_SCREEN_EMAIL_TEXT_INPUT, "")
        setText(singUpScreen().registerElements.REGISTER_SCREEN_PASS_TEXT_INPUT, "")
    }

    open fun clickToRegisterButton() {
        click(singUpScreen().registerElements.REGISTER_SCREEN_SAVE_BUTTON)
    }

}