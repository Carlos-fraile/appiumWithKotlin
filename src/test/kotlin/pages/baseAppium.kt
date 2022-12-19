package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.jupiter.api.TestInstance
import org.openqa.selenium.remote.DesiredCapabilities
import utils.PropertyLoader
import java.io.File
import java.net.URL

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

open class baseAppium {

    companion object {
        var driver: AppiumDriver<MobileElement>? = null
    }

    fun setup(propertieFile: String): AppiumDriver<MobileElement>? {
        //Property loader
        val loadproperty = PropertyLoader()
        val propertiesFile = "params$propertieFile.properties"

        //Desire capabilities
        val capabilities = DesiredCapabilities()
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60)
        capabilities.setCapability(
            MobileCapabilityType.PLATFORM_NAME,
            loadproperty.loadProperties(propertiesFile)!!.getProperty("platformName")
        )
        capabilities.setCapability(
            MobileCapabilityType.AUTOMATION_NAME,
            loadproperty.loadProperties(propertiesFile)!!.getProperty("AndroidAutomationName")
        )
        capabilities.setCapability(
            "appActivity",
            loadproperty.loadProperties(propertiesFile)!!.getProperty("appActivity")
        ) //.AuthActivity
        capabilities.setCapability(
            "appPackage",
            loadproperty.loadProperties(propertiesFile)!!.getProperty("appPackage")
        ) //com.example.confluedent
        capabilities.setCapability("abdExecTimeout", 3000)
        capabilities.setCapability(
            MobileCapabilityType.UDID,
            loadproperty.loadProperties(propertiesFile)!!.getProperty("androidUdid")
        )
        capabilities.setCapability(
            MobileCapabilityType.DEVICE_NAME,
            loadproperty.loadProperties(propertiesFile)!!.getProperty("androidDeviceName")
        )
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false)
        val app: File = File(
            loadproperty.loadProperties(propertiesFile)!!.getProperty("apkDir"),
            loadproperty.loadProperties(propertiesFile)!!.getProperty("apkName")
        )
        capabilities.setCapability("app", app.absolutePath)
        //Init driver
        var url = URL("http://localhost:4723/wd/hub")
        driver = AndroidDriver(url, capabilities)
        println("Application stated.........")
        println("Driver(BaseAppium): " + driver)

        return driver
    }
}