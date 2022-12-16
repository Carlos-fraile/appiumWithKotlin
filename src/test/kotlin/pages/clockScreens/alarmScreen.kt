package pages.clockScreens

import pages.elements.clockElements

class alarmScreen() : clockElements() {
    var alarmElements = clockElements()

    fun clickToAddAlarm() {
        click(alarmElements.ALARM_SCREEN_ADD_ALARM_BUTTON)
    }

    fun setTime() {
        click(alarmElements.ALARM_SCREEN_SET_AM_ALARM_BUTTON)
        click(alarmElements.ALARM_SCREEN_SET_HOUR_ALARM_12H_BUTTON)
        click(alarmElements.ALARM_SCREEN_SET_MINUTE_ALARM_1M_BUTTON)
        click(alarmElements.ALARM_SCREEN_OK_BUTTON)
    }

    fun verifyAlarmIsAdded(): Boolean? {
        return isPresent(alarmElements.ALARM_SCREEN_ALARM_ADDED_BUTTON)
    }

    fun verifyAlarmIsActivated(): Boolean? {
        return matchTextElement(alarmElements.ALARM_SCREEN_ACTIVATE_ALARM_SWITCH, "ON")

    }
}