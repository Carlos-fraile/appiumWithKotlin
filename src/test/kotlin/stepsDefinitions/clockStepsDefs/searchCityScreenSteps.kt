package stepsDefinitions.clockStepsDefs

import io.cucumber.java.en.When
import org.junit.Assert
import pages.clockScreens.searchCityScreen

class searchCityScreenSteps {
    var searchCityScreen = searchCityScreen()

    @When("^the user search the city '(.*)'$")
    fun searchCity(city: String?) {
        searchCityScreen.searchCity(city)
    }

    @When("^the user add city$")
    fun addCity() {
        searchCityScreen.addCity()
    }

    @When("a city is added '(.*)'$")
    fun verifyCityAdded(city: String?) {
        Assert.assertTrue("The city is not added", searchCityScreen.verifyCityAdded(city)!!)
    }
}