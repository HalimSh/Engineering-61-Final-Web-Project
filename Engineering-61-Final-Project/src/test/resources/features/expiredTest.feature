Feature: Expired Test

  @TestNotExpired
  Scenario: Test has not expired
    Given A candidate has been sent a test 10 days ago
    When The candidate has submitted the test
    And I go to the dispatches page to see Expired
    Then I should see a No under Expired

    @TestExpired
  Scenario: Test has expired
    Given A candidate has been sent a test 10 days ago
    When The candidate has not submitted the test
    And I go to the dispatches page to see Expired
    Then I should see a Yes under Expired


