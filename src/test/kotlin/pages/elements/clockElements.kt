package pages.elements

import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy
import utils.MobilePageObject

open class clockElements() : MobilePageObject() {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // HOME SCREEN
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.google.android.deskclock:id/fab")
    var HOME_SCREEN_WORLD_BUTTON: MobileElement? = null

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    var HOME_SCREEN_CLOCK_ADDED_CITYNAME: MobileElement? = null

    @AndroidFindBy(accessibility = "Alarm")
    val HOME_SCREEN_ALARM_BUTTON: MobileElement? = null

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // SEARCH CITY SCREEN
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.google.android.deskclock:id/search_src_text")
    var SEARCH_CITY_SCREEN_SEARCH_TEXT_INPUT: MobileElement? = null

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
    var SEARCH_CITY_FIRTS_RESULT_LIST: MobileElement? = null

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // ALARM SCREEN
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    @AndroidFindBy(accessibility = "Add alarm")
    var ALARM_SCREEN_ADD_ALARM_BUTTON: MobileElement? = null

    @AndroidFindBy(id = "com.google.android.deskclock:id/onoff")
    var ALARM_SCREEN_ACTIVATE_ALARM_SWITCH: MobileElement? = null

    @AndroidFindBy(id = "com.google.android.deskclock:id/delete")
    var ALARM_SCREEN_DELETE_ALARM_BUTTON: MobileElement? = null

    @AndroidFindBy(accessibility = "12:30 AM")
    var ALARM_SCREEN_ALARM_ADDED_BUTTON: MobileElement? = null

    // set alarm
    @AndroidFindBy(id = "android:id/am_label")
    var ALARM_SCREEN_SET_AM_ALARM_BUTTON: MobileElement? = null

    @AndroidFindBy(accessibility = "12")
    var ALARM_SCREEN_SET_HOUR_ALARM_12H_BUTTON: MobileElement? = null

    @AndroidFindBy(accessibility = "30")
    var ALARM_SCREEN_SET_MINUTE_ALARM_1M_BUTTON: MobileElement? = null

    @AndroidFindBy(id = "android:id/button1")
    var ALARM_SCREEN_OK_BUTTON: MobileElement? = null
}