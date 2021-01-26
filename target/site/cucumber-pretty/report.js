$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Jigsaw.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Jigsaw First Time registration",
  "description": "",
  "id": ";jigsaw-first-time-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open Jigsaw web application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on the First time user button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify that Login page is open",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click the Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify that My Profile page is open and assert that your email address is pre-populated in the Email address field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill up the required fields and close the page",
  "keyword": "Then "
});
formatter.match({
  "location": "JigsawSteps.open_Jigsaw_web_application()"
});
formatter.result({
  "duration": 5765618536,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.clickTheFirstTimeUserButton()"
});
formatter.result({
  "duration": 118563140,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.verifyThatLoginPageIsOpen()"
});
formatter.result({
  "duration": 404834599,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.enterEmail()"
});
formatter.result({
  "duration": 144698382,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.pressContinue()"
});
formatter.result({
  "duration": 1531337193,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.verifyEmailAddress()"
});
formatter.result({
  "duration": 432881743,
  "status": "passed"
});
formatter.match({
  "location": "JigsawSteps.fillUpRequiredFields()"
});
formatter.result({
  "duration": 1025826702,
  "status": "passed"
});
});