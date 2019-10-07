Feature: Multiply feature

  @positive
  Scenario: simple multiply
    Given 2 and 4
    When multiply
    Then result is 8

  Scenario: another multiply
    Given 2 and 7
    When multiply
    Then result is 14

  Scenario: positive and negative values
    Given 2 and -7
    When multiply
    Then result is -14

  Scenario: negative values
    Given -3 and -8
    When multiply
    Then result is 24

  @severity=critical
  Scenario: failed
    Given 2 and 4
    When multiply
    Then result is 6