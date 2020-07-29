Feature: Registration feature
  @Test
  Scenario: User should able to register successfully,
  so that user can use all user functionality on my website
    Given user is on homepage
    When user clicks on register button
    And user enters all required registration details
    And user clicks on register-submit button
    Then user should able to register successfully