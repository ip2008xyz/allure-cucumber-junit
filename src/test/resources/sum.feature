Feature: Sum feature
  Add extra info about description here, no need for annotation

  @issue=TCA-13 @severity=critical @simple @positive
  Scenario: simple sum
    Given 2 and 4
    When sum
    Then result is 6

  Scenario: another simple sum
    Given 2 and 7
    When sum
    Then result is 9

  Scenario: positive and negative values
    Given 2 and -7
    When sum
    Then result is -5

  Scenario: negative values
    Given -3 and -8
    When sum
    Then result is -11

  @severity:trivial @TMS:7889
  Scenario: failed
    Given 2 and 4
    When sum
    Then result is 5