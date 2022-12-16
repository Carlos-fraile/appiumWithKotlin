package pages.clockScreens

import pages.elements.clockElements

class homeScreen() : clockElements() {
    val homeElements = clockElements()

    fun clickToWorldButton() {
        click(homeElements.HOME_SCREEN_WORLD_BUTTON)
    }

    fun clickToAlarmButton() {
        click(homeElements.HOME_SCREEN_ALARM_BUTTON)
    }
}