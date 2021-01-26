Feature:

  @Test
  Scenario: Jigsaw First Time registration
    Given open Jigsaw web application
    When click on the First time user button
    And verify that Login page is open
    And enter a valid email address
    And click the Continue button
    And verify that My Profile page is open and assert that your email address is pre-populated in the Email address field
    Then fill up the required fields and close the page




