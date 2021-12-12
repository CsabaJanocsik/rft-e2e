Feature: Open localhost swagger

  Scenario: Go to addStudent

    Given browser is open
    And user in localhost:8080
    When user click on StudentCourseRegistrationController
    And user click on addStudent
    And user click on Tryitout
    Then user is navigated to Execute

