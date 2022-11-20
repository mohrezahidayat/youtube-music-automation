Feature: Home Page
  Scenario: Show Home Page Without Sign In
    Given User launch chrome
    When User visit Music Youtube
    Then User can see youtube music logo
    And User can see navbar Home
    And User can see navbar Library
    And User can see navbar Explore
    And User can see navbar Search
    And User can see cast button
    And User can see bullet setting
    And User can see Sign In button
    And User can see quick picks section
    And Close chrome

  Scenario: Play Music Quick Picks
    Given User launch chrome
    When User visit Music Youtube
    And User click play button
    Then User can see player page
    And User can see player bar background
    And Music playing
    And Close chrome

  Scenario: Pause Music Quick Picks
    Given User launch chrome
    When User visit Music Youtube
    And User click play button
    And User click pause button
    Then Music pausing
    And Close chrome

  Scenario: Search Music
    Given User launch chrome
    When User visit Music Youtube
    And User click navbar search
    And User input search "The Beatles"
    And User click suggestion search
    Then User can see top results
    And Close chrome