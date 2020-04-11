$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoblazeApp",
  "description": "",
  "id": "demoblazeapp",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demoblaze"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login in the Demoblaze",
  "description": "",
  "id": "demoblazeapp;login-in-the-demoblaze",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user open the demoblaze homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on the login button popup window appears",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the username",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enter the passsword",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on Login button to go to homePage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_TC.launch_web_browser()"
});
formatter.result({
  "duration": 6207807004,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_open_the_demoblaze_homepage()"
});
formatter.result({
  "duration": 2194436101,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.click_on_the_login_button_popup_window_appears()"
});
formatter.result({
  "duration": 396333373,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_enter_the_username()"
});
formatter.result({
  "duration": 6901217816,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_enter_the_passsword()"
});
formatter.result({
  "duration": 353989663,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_click_on_login_button_to_go_to_homepage()"
});
formatter.result({
  "duration": 10730032779,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Add Laptop to cart",
  "description": "",
  "id": "demoblazeapp;add-laptop-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TC02_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user tap on Laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user will click on desired Laptop",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "tap on add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "tap Ok on popup",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "the user click on cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Laptop_TC.user_tap_on_laptop()"
});
formatter.result({
  "duration": 7190928076,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.user_will_click_on_desired_laptop()"
});
formatter.result({
  "duration": 1816700555,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.tap_on_add_to_cart()"
});
formatter.result({
  "duration": 4704033743,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.tap_ok_on_popup()"
});
formatter.result({
  "duration": 37476016,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.the_user_click_on_cart_page()"
});
formatter.result({
  "duration": 3403078786,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Add Monitors to cart",
  "description": "",
  "id": "demoblazeapp;add-monitors-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TC03_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "person  click on Monitor",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user click on desired Monitor",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user tap add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click OK in message",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Monitor_TC.person_click_on_monitor()"
});
formatter.result({
  "duration": 7183399381,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_click_on_desired_monitor()"
});
formatter.result({
  "duration": 1502880319,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_tap_add_to_cart()"
});
formatter.result({
  "duration": 3760032498,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.click_ok_in_message()"
});
formatter.result({
  "duration": 7680490,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.click_on_cart()"
});
formatter.result({
  "duration": 3338945238,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Add phone to cart",
  "description": "",
  "id": "demoblazeapp;add-phone-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@TC04_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user click on Phone",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "select the desired phone",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "select add to cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "handle the window alerts",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "person tap cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Phone_TC.user_click_on_Phone()"
});
formatter.result({
  "duration": 6378022390,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.select_the_desired_phone()"
});
formatter.result({
  "duration": 1393630779,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.select_add_to_cart_button()"
});
formatter.result({
  "duration": 2784573548,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.handle_the_window_alerts()"
});
formatter.result({
  "duration": 9035839,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.person_tap_cart_page()"
});
formatter.result({
  "duration": 3166086678,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "Purchase a product",
  "description": "",
  "id": "demoblazeapp;purchase-a-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@TC05_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user open  demoblaze homepage",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click  login button popup window appears",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user fill up  \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user fills up the \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "select Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "click on Laptop link",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user choose desired Laptop",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user select add to cart option",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "person  need to handle the alert",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "tap on cart link",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "click home button to go homePage",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "user on pc link",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user has to choose desired option",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "choose add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "popup message should be handle",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "tap the cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "again go to homePage",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on phone link",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user clicks on a desired phone",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "add the phone to cart",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "handle alert message",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "go to cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "user click on purchase with credentials\u003cname\u003e \u003ccountry\u003e \u003ccity\u003e \u003ccard\u003e \u003cmonth\u003e \u003cyear\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "tap the accept button",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "logout the website",
  "keyword": "Then "
});
formatter.examples({
  "line": 66,
  "name": "",
  "description": "",
  "id": "demoblazeapp;purchase-a-product;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "name",
        "country",
        "city",
        "card",
        "month",
        "year"
      ],
      "line": 67,
      "id": "demoblazeapp;purchase-a-product;;1"
    },
    {
      "cells": [
        "User_1",
        "Workfromhome$12",
        "ABC",
        "ABC",
        "ABC",
        "12345674544",
        "4",
        "2020"
      ],
      "line": 68,
      "id": "demoblazeapp;purchase-a-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 68,
  "name": "Purchase a product",
  "description": "",
  "id": "demoblazeapp;purchase-a-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@TC05_Demoblaze"
    },
    {
      "line": 1,
      "name": "@Demoblaze"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user open  demoblaze homepage",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "click  login button popup window appears",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user fill up  User_1",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user fills up the Workfromhome$12",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "select Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "click on Laptop link",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user choose desired Laptop",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user select add to cart option",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "person  need to handle the alert",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "tap on cart link",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "click home button to go homePage",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "user on pc link",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user has to choose desired option",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "choose add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "popup message should be handle",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "tap the cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "again go to homePage",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on phone link",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user clicks on a desired phone",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "add the phone to cart",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "handle alert message",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "go to cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "user click on purchase with credentialsABC ABC ABC 12345674544 4 2020",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "tap the accept button",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "logout the website",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchaseproduct_TC.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 3947159764,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_open_demoblaze_homepage()"
});
formatter.result({
  "duration": 2048076799,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.click_login_button_popup_window_appears()"
});
formatter.result({
  "duration": 2473583394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User_1",
      "offset": 14
    }
  ],
  "location": "Purchaseproduct_TC.user_fill_up(String)"
});
formatter.result({
  "duration": 2180214392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Workfromhome$12",
      "offset": 18
    }
  ],
  "location": "Purchaseproduct_TC.user_fills_up_the(String)"
});
formatter.result({
  "duration": 2207657910,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.select_login_button()"
});
formatter.result({
  "duration": 112331351,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.click_on_laptop_link()"
});
formatter.result({
  "duration": 3113109772,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_choose_desired_laptop()"
});
formatter.result({
  "duration": 3840008881,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_select_add_to_cart_option()"
});
formatter.result({
  "duration": 3115722694,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.person_need_to_handle_the_alert()"
});
formatter.result({
  "duration": 23235940,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.tap_on_cart_link()"
});
formatter.result({
  "duration": 3510476539,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.click_home_button_to_go_homepage()"
});
formatter.result({
  "duration": 944338867,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_on_pc_link()"
});
formatter.result({
  "duration": 3162781766,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_has_to_choose_desired_option()"
});
formatter.result({
  "duration": 3485210547,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.choose_add_to_cart()"
});
formatter.result({
  "duration": 2122200711,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.popup_message_should_be_handle()"
});
formatter.result({
  "duration": 7925739,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.tap_the_cart_button()"
});
formatter.result({
  "duration": 3235901455,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.again_go_to_homepage()"
});
formatter.result({
  "duration": 798601327,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.click_on_phone_link()"
});
formatter.result({
  "duration": 3133015951,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.user_clicks_on_a_desired_phone()"
});
formatter.result({
  "duration": 2765718589,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.add_the_phone_to_cart()"
});
formatter.result({
  "duration": 2129947644,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.handle_alert_message()"
});
formatter.result({
  "duration": 7205119,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.go_to_cart_page()"
});
formatter.result({
  "duration": 3646464101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 39
    },
    {
      "val": "ABC",
      "offset": 43
    },
    {
      "val": "ABC",
      "offset": 47
    },
    {
      "val": "12345674544",
      "offset": 51
    },
    {
      "val": "4",
      "offset": 63
    },
    {
      "val": "2020",
      "offset": 65
    }
  ],
  "location": "Purchaseproduct_TC.user_click_on_purchase_with_credentials(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 6445149158,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.tap_the_accept_button()"
});
formatter.result({
  "duration": 1675989529,
  "status": "passed"
});
formatter.match({
  "location": "Purchaseproduct_TC.logout_the_website()"
});
formatter.result({
  "duration": 3583476845,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 72,
  "name": "User Exists",
  "description": "",
  "id": "demoblazeapp;user-exists",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 71,
      "name": "@TC06_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 74,
  "name": "user opens homepage",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "click on the signup button popup window appears",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "enter the  \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user fill up the \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user click on signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "click OK on alert message",
  "keyword": "Then "
});
formatter.examples({
  "line": 81,
  "name": "",
  "description": "",
  "id": "demoblazeapp;user-exists;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 82,
      "id": "demoblazeapp;user-exists;;1"
    },
    {
      "cells": [
        "User_1",
        "Workfromhome$12"
      ],
      "line": 83,
      "id": "demoblazeapp;user-exists;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 83,
  "name": "User Exists",
  "description": "",
  "id": "demoblazeapp;user-exists;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 71,
      "name": "@TC06_Demoblaze"
    },
    {
      "line": 1,
      "name": "@Demoblaze"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 74,
  "name": "user opens homepage",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "click on the signup button popup window appears",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "enter the  User_1",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user fill up the Workfromhome$12",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user click on signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "click OK on alert message",
  "keyword": "Then "
});
formatter.match({
  "location": "Userexists_TC.user_launch_browser()"
});
formatter.result({
  "duration": 5430117698,
  "status": "passed"
});
formatter.match({
  "location": "Userexists_TC.user_opens_homepage()"
});
formatter.result({
  "duration": 4697410414,
  "status": "passed"
});
formatter.match({
  "location": "Userexists_TC.click_on_the_signup_button_popup_window_appears()"
});
formatter.result({
  "duration": 4241016020,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User_1",
      "offset": 11
    }
  ],
  "location": "Userexists_TC.enter_the(String)"
});
formatter.result({
  "duration": 160390323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Workfromhome$12",
      "offset": 17
    }
  ],
  "location": "Userexists_TC.user_fill_up_the(String)"
});
formatter.result({
  "duration": 247751709,
  "status": "passed"
});
formatter.match({
  "location": "Userexists_TC.user_click_on_signup_button()"
});
formatter.result({
  "duration": 3154641030,
  "status": "passed"
});
formatter.match({
  "location": "Userexists_TC.click_ok_on_alert_message()"
});
formatter.result({
  "duration": 2413969114,
  "status": "passed"
});
formatter.scenario({
  "line": 86,
  "name": "number of items in the page",
  "description": "",
  "id": "demoblazeapp;number-of-items-in-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 85,
      "name": "@TC07_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 87,
  "name": "user launch demoblaze application",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "user check the number of products in a webpage",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "print the number of products in a webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Itemscount_TC.user_launch_demoblaze_application()"
});
formatter.result({
  "duration": 6100520531,
  "status": "passed"
});
formatter.match({
  "location": "Itemscount_TC.user_check_the_number_of_products_in_a_webpage()"
});
formatter.result({
  "duration": 625285223,
  "status": "passed"
});
formatter.match({
  "location": "Itemscount_TC.print_the_number_of_products_in_a_webpage()"
});
formatter.result({
  "duration": 245091790,
  "status": "passed"
});
formatter.scenario({
  "line": 92,
  "name": "Assertion of Email Address",
  "description": "",
  "id": "demoblazeapp;assertion-of-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 91,
      "name": "@TC08_Demoblaze"
    }
  ]
});
formatter.step({
  "line": 93,
  "name": "user launch Web application",
  "keyword": "Given "
});
formatter.step({
  "line": 94,
  "name": "get the Email address from footer",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "assert the actual and expected Email addresses",
  "keyword": "Then "
});
formatter.match({
  "location": "Emailidfooter_TC.user_launch_web_application()"
});
formatter.result({
  "duration": 5017009114,
  "status": "passed"
});
formatter.match({
  "location": "Emailidfooter_TC.get_the_email_address_from_footer()"
});
formatter.result({
  "duration": 4093959325,
  "status": "passed"
});
formatter.match({
  "location": "Emailidfooter_TC.assert_the_actual_and_expected_email_addresses()"
});
formatter.result({
  "duration": 2142592525,
  "status": "passed"
});
});