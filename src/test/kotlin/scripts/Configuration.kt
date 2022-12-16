package scripts

import java.util.*

class Configuration {
    private val commons = commons()

    ///////////////////////////////////////////////////////////////////////////////
    // FILES
    ///////////////////////////////////////////////////////////////////////////////
    val PROPERTIES_FILE_PATH =
        "C:/Users/carlos.frailemarquez/Desktop/appiumKotlin/src/test/resources/properties/keys/"
    val KEY_PROPERTIES_FILE_PATH = PROPERTIES_FILE_PATH + "keys%s.properties"
    val USER_INFO_PROPERTIES_FILE_PATH = PROPERTIES_FILE_PATH + "userInfo%s.properties"

    ///////////////////////////////////////////////////////////////////////////////
    // PROPERTIES OBJECT
    ///////////////////////////////////////////////////////////////////////////////
    fun KEY_PROPERTIES_FILE(appName: String?): Properties {
        return commons.getProperties(String.format(KEY_PROPERTIES_FILE_PATH, appName))
    }

    fun USER_INFO_PROPERTIES_FILE(appName: String?): Properties {
        return commons.getProperties(String.format(USER_INFO_PROPERTIES_FILE_PATH, appName))
    }
}