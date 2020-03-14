$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Feature.feature");
formatter.feature({
  "name": "To validate the Login Function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the Login with Valid user name and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User open the url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter user \"\u003cName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the Login",
  "keyword": "And "
});
formatter.step({
  "name": "Select  the \"\u003cLocation\u003e\" and \"\u003cHotel\u003e \" and \"\u003cRoomType\u003e\" and \"\u003cNoRooms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Give Date \"\u003cCheck in date\u003e\" and \"\u003cCheck out Date\u003e\" and \"\u003cAdult per room\u003e\" and \"\u003cChild per room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on search and navigate to the Next page",
  "keyword": "And "
});
formatter.step({
  "name": "Select the Radio Button and click ok",
  "keyword": "And "
});
formatter.step({
  "name": "Fill \"\u003cFirst Name\u003e\" and \"\u003cLast Name\u003e\" and \"\u003cAddress\u003e\" and \"\u003cCard No\u003e\" and  \"\u003cCard type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click \"\u003cMonth\u003e\" and \"\u003cYear\u003e\" and \"\u003cCvv\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Book Now and navigate to next page",
  "keyword": "And "
});
formatter.step({
  "name": "Print the order number and take screenshot",
  "keyword": "And "
});
formatter.step({
  "name": "LogOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Password",
        "Location",
        "Hotel",
        "RoomType",
        "NoRooms",
        "Check in date",
        "Check out Date",
        "Adult per room",
        "Child per room",
        "First Name",
        "Last Name",
        "Address",
        "Card No",
        "Card type",
        "Month",
        "Year",
        "Cvv"
      ]
    },
    {
      "cells": [
        "Richards",
        "Asdf*963.",
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "3",
        "21/03/2020",
        "25/03/2020",
        "2",
        "1",
        "Richard",
        "Sam",
        "Po Box 452,Salt Lake city,Uta",
        "1234567891234567",
        "American Express",
        "3",
        "2022",
        "452"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the Login with Valid user name and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_open_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user \"Richards\" and \"Asdf*963.\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.enter_user_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Login",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_the_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select  the \"Melbourne\" and \"Hotel Sunshine \" and \"Double\" and \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.select_the_and_and_and(String,String,String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.tsc.Stepdefinition.select_the_and_and_and(Stepdefinition.java:30)\r\n\tat ✽.Select  the \"Melbourne\" and \"Hotel Sunshine \" and \"Double\" and \"3\"(src/test/resources/Feature/Feature.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Give Date \"21/03/2020\" and \"25/03/2020\" and \"2\" and \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.give_Date_and_and_and(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on search and navigate to the Next page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.click_on_search_and_navigate_to_the_Next_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the Radio Button and click ok",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.select_the_Radio_Button_and_click_ok()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Fill \"Richard\" and \"Sam\" and \"Po Box 452,Salt Lake city,Uta\" and \"1234567891234567\" and  \"American Express\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.fill_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click \"3\" and \"2022\" and \"452\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.click_and_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Book Now and navigate to next page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.click_Book_Now_and_navigate_to_next_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Print the order number and take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.print_the_order_number_and_take_screenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});