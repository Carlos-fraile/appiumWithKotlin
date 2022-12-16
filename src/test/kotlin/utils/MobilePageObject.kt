package utils

import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.junit.Assert
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.support.PageFactory
import pages.baseAppium.Companion.driver

open class MobilePageObject() {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver), this)
    }

    // FIND ELEMENTS METHODS
    fun findElement(element: MobileElement?): MobileElement? {
        var attempts = 0
        while (attempts < 3) {
            try {
                if (element!!.isDisplayed) return element
            } catch (e: Exception) {
                println("Retry find element:$element")
            }
            attempts++
        }
        throw AssertionError("Fail to find element: $element")
    }

    // CLICK ELEMENTS METHODS
    fun click(element: MobileElement?) {
        try {
            findElement(element)!!.click()
            println("Click on $element")
        } catch (e: NoSuchElementException) {
            Assert.fail("Fail to click on element: $element")
        }
    }

    // SET TEXT METHODS
    fun setText(element: MobileElement?, text: String?) {
        try {
            findElement(element)!!.clear()
            findElement(element)!!.sendKeys(text)
            println("Set text on $element")
        } catch (e: Exception) {
            Assert.fail("Fail to set text on element:$element")
        }
    }

    // GET TEXT METHODS
    fun getTextElement(element: MobileElement?): String? {
        return try {
            println("Get text on $element")
            findElement(element)!!.text
        } catch (e: Exception) {
            Assert.fail("Fail to get text on element:$element")
            null
        }
    }

    // VERIFY METHODS
    fun matchTextElement(element: MobileElement?, text: String?): Boolean? {
        return try {
            var textElement: Regex? = getTextElement(element)!!.toRegex()
            textElement!!.matches(text.toString())
        } catch (e: Exception) {
            Assert.fail("the text of the element is not correct:$element")
            null
        }
    }

    fun isPresent(element: MobileElement?): Boolean? {
        try {
            return element?.isDisplayed
        } catch (e: Exception) {
            Assert.fail("Fail to get text on element:$element")
            return false
        }
    }

    fun verifyElementHasText(element: MobileElement?, text: String): Boolean? {
        return getTextElement(element) == text
    }
}