package pages.clockScreens

import pages.elements.clockElements

class searchCityScreen() : clockElements() {

    var searchElements = clockElements()

    fun searchCity(city: String?) {
        setText(searchElements.SEARCH_CITY_SCREEN_SEARCH_TEXT_INPUT, city)
    }

    fun addCity() {
        click(searchElements.SEARCH_CITY_FIRTS_RESULT_LIST)
    }

    fun verifyCityAdded(city: String?): Boolean? {
        return matchTextElement(searchElements.HOME_SCREEN_CLOCK_ADDED_CITYNAME, city)
    }

}