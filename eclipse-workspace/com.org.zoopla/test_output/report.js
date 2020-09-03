$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("zoopla.feature");
formatter.feature({
  "line": 1,
  "name": "checking funtionality of search button for  list of homes",
  "description": "",
  "id": "checking-funtionality-of-search-button-for--list-of-homes",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Testcase for validating list with agent name",
  "description": "",
  "id": "checking-funtionality-of-search-button-for--list-of-homes;testcase-for-validating-list-with-agent-name",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Zoopla application launched",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "verify the homepage using homepage title\"\u003chomepagetitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter the \"\u003ccityName\u003e\" in searchbox and press the enter button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "printing price values in decending order",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on fifth th property from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on agentname on the same page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate agents page with agent pageheader",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "check the properties having agent name",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "checking-funtionality-of-search-button-for--list-of-homes;testcase-for-validating-list-with-agent-name;",
  "rows": [
    {
      "cells": [
        "homepagetitle",
        "cityName"
      ],
      "line": 13,
      "id": "checking-funtionality-of-search-button-for--list-of-homes;testcase-for-validating-list-with-agent-name;;1"
    },
    {
      "cells": [
        "Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents",
        "london"
      ],
      "line": 14,
      "id": "checking-funtionality-of-search-button-for--list-of-homes;testcase-for-validating-list-with-agent-name;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16457771700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Testcase for validating list with agent name",
  "description": "",
  "id": "checking-funtionality-of-search-button-for--list-of-homes;testcase-for-validating-list-with-agent-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Zoopla application launched",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "verify the homepage using homepage title\"Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter the \"london\" in searchbox and press the enter button",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "printing price values in decending order",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on fifth th property from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on agentname on the same page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Validate agents page with agent pageheader",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "check the properties having agent name",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.zoopla_application_launched()"
});
formatter.result({
  "duration": 230639900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zoopla \u003e Search Property to Buy, Rent, House Prices, Estate Agents",
      "offset": 41
    }
  ],
  "location": "Stepdefinition.verify_the_homepage_using_homepage_title(String)"
});
formatter.result({
  "duration": 97456600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "london",
      "offset": 11
    }
  ],
  "location": "Stepdefinition.enter_the_in_searchbox_and_press_the_enter_button(String)"
});
formatter.result({
  "duration": 15086579800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.printing_price_values_in_decending_order()"
});
formatter.result({
  "duration": 5504916900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_fifth_th_property_from_the_list()"
});
formatter.result({
  "duration": 3153776300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.click_on_agentname_on_the_same_page()"
});
formatter.result({
  "duration": 1830718200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.validate_agents_page_with_agent_pageheader()"
});
formatter.result({
  "duration": 5586688700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.check_the_properties_having_agent_name()"
});
formatter.result({
  "duration": 5169005100,
  "status": "passed"
});
formatter.after({
  "duration": 7893368000,
  "status": "passed"
});
});{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:59195}, acceptInsecureCerts\u003dfalse, browserVersion\u003d85.0.4183.83, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: fe7ef3abd0c82dd080b0dd65013fb306\n*** Element info: {Using\u003dxpath, value\u003d//ul[@class\u003d\u0027listing-results clearfix js-gtm-list\u0027]//a[@class\u003d\u0027listing-results-price text-price\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:437)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:398)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat com.sun.proxy.$Proxy20.size(Unknown Source)\r\n\tat com.org.pages.Homepage.sortingthehouseepricelist(Homepage.java:55)\r\n\tat com.org.stepdefinition.Stepdefinition.printing_price_values_in_decending_order(Stepdefinition.java:43)\r\n\tat ✽.And printing price values in decending order(zoopla.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.click_on_fifth_th_property_from_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_on_agentname_on_the_same_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.validate_agents_page_with_agent_pageheader()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.check_the_properties_having_agent_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15220231000,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d85.0.4183.83)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027SHARMILA\u0027, ip: \u0027192.168.1.10\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d85.0.4183.87 (cd6713ebf92fa1cacc0f1a598df280093af0c5d7-refs/branch-heads/4183@{#1689}), userDataDir\u003dC:\\Users\\sweet\\AppData\\Local\\Temp\\scoped_dir49560_1972676665}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:59195}, acceptInsecureCerts\u003dfalse, browserVersion\u003d85.0.4183.83, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: fe7ef3abd0c82dd080b0dd65013fb306\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:694)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:382)\r\n\tat com.org.stepdefinition.hooks.reports(hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "failed"
});
});