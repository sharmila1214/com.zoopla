$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Redfin Application",
  "description": "",
  "id": "redfin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"\u003ctestName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using \"\u003chomePageTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003ccityName\u003e\" in searchbox and press the enter button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"\u003cSelectionFromPopUp\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"\u003cestatePageHeader\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"\u003ccityName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"\u003cMinPriceIndex\u003e\" and max price as \"\u003cMaxPriceIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"\u003csearchResult\u003e\", if no homes listed throw an errorMessage",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "redfin-application;usecase1;",
  "rows": [
    {
      "cells": [
        "testName",
        "homePageTitle",
        "cityName",
        "SelectionFromPopUp",
        "estatePageHeader",
        "MinPriceIndex",
        "MaxPriceIndex",
        "searchResult"
      ],
      "line": 17,
      "id": "redfin-application;usecase1;;1"
    },
    {
      "cells": [
        "test1",
        "Real Estate, Homes for Sale, MLS Listings, Agents",
        "Sunnyvale",
        "https://www.redfin.com/city/19457/CA/Sunnyvale",
        "Sunnyvale Real Estate",
        "25",
        "3",
        "/CA/Sunnyvale/"
      ],
      "line": 18,
      "id": "redfin-application;usecase1;;2"
    },
    {
      "cells": [
        "test2",
        "Real Estate, Homes for Sale, MLS Listings, Agents",
        "Sunnyvale",
        "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
        "Sunnyvale Real Estate",
        "21",
        "4",
        "/TX/Dallas"
      ],
      "line": 19,
      "id": "redfin-application;usecase1;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 20119849200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using \"Real Estate, Homes for Sale, MLS Listings, Agents\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Sunnyvale\" in searchbox and press the enter button",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"https://www.redfin.com/city/19457/CA/Sunnyvale\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"Sunnyvale Real Estate\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"Sunnyvale\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"25\" and max price as \"3\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"/CA/Sunnyvale/\", if no homes listed throw an errorMessage",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 40
    }
  ],
  "location": "StepDefinition.the_redfin_application_is_launched_for(String)"
});
formatter.result({
  "duration": 627279100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real Estate, Homes for Sale, MLS Listings, Agents",
      "offset": 28
    }
  ],
  "location": "StepDefinition.verify_the_home_page_using(String)"
});
formatter.result({
  "duration": 234039400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 11
    }
  ],
  "location": "StepDefinition.enter_the_in_searchbox_and_press_the_enter_button(String)"
});
formatter.result({
  "duration": 338494300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validate_pop_up_appears()"
});
formatter.result({
  "duration": 381002500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/city/19457/CA/Sunnyvale",
      "offset": 32
    }
  ],
  "location": "StepDefinition.on_the_pop_up_select_the_entry(String)"
});
formatter.result({
  "duration": 5570746200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale Real Estate",
      "offset": 40
    }
  ],
  "location": "StepDefinition.verify_the_city_Real_Estate_page_using(String)"
});
formatter.result({
  "duration": 2829357200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 48
    }
  ],
  "location": "StepDefinition.assert_the_Search_box_on_the_top_left_side_has(String)"
});
formatter.result({
  "duration": 38785900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 25
    },
    {
      "val": "3",
      "offset": 47
    }
  ],
  "location": "StepDefinition.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 5447357900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/CA/Sunnyvale/",
      "offset": 38
    }
  ],
  "location": "StepDefinition.verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String)"
});
formatter.result({
  "duration": 339788000,
  "status": "passed"
});
formatter.after({
  "duration": 3507955200,
  "status": "passed"
});
formatter.before({
  "duration": 7704703400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"test2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using \"Real Estate, Homes for Sale, MLS Listings, Agents\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Sunnyvale\" in searchbox and press the enter button",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"Sunnyvale Real Estate\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"Sunnyvale\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"21\" and max price as \"4\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"/TX/Dallas\", if no homes listed throw an errorMessage",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test2",
      "offset": 40
    }
  ],
  "location": "StepDefinition.the_redfin_application_is_launched_for(String)"
});
formatter.result({
  "duration": 103800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Real Estate, Homes for Sale, MLS Listings, Agents",
      "offset": 28
    }
  ],
  "location": "StepDefinition.verify_the_home_page_using(String)"
});
formatter.result({
  "duration": 31048000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 11
    }
  ],
  "location": "StepDefinition.enter_the_in_searchbox_and_press_the_enter_button(String)"
});
formatter.result({
  "duration": 180380900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validate_pop_up_appears()"
});
formatter.result({
  "duration": 235037400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
      "offset": 32
    }
  ],
  "location": "StepDefinition.on_the_pop_up_select_the_entry(String)"
});
formatter.result({
  "duration": 4732139000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale Real Estate",
      "offset": 40
    }
  ],
  "location": "StepDefinition.verify_the_city_Real_Estate_page_using(String)"
});
formatter.result({
  "duration": 375532000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 48
    }
  ],
  "location": "StepDefinition.assert_the_Search_box_on_the_top_left_side_has(String)"
});
formatter.result({
  "duration": 41885400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21",
      "offset": 25
    },
    {
      "val": "4",
      "offset": 47
    }
  ],
  "location": "StepDefinition.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 5352068000,
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: Cannot read property \u0027click\u0027 of undefined\n  (Session info: chrome\u003d85.0.4183.102)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027SHARMILA\u0027, ip: \u0027192.168.1.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d85.0.4183.87 (cd6713ebf92fa1cacc0f1a598df280093af0c5d7-refs/branch-heads/4183@{#1689}), userDataDir\u003dC:\\Users\\sweet\\AppData\\Local\\Temp\\scoped_dir25036_1951352104}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dXP, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:59985}, acceptInsecureCerts\u003dfalse, browserVersion\u003d85.0.4183.102, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: acb3b550ceb3c63d6e0796197d4bcede\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:582)\r\n\tat com.redfin.pages.RealEstatePage.enterMaxValue(RealEstatePage.java:78)\r\n\tat com.redfin.stepdefinitions.StepDefinition.select_the_min_price_as_and_max_price_as(StepDefinition.java:69)\r\n\tat ✽.When Select the min price as \"21\" and max price as \"4\"(scenarios.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "/TX/Dallas",
      "offset": 38
    }
  ],
  "location": "StepDefinition.verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3611013200,
  "status": "passed"
});
});