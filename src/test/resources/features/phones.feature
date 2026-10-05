Feature: Check phones in DB

  Scenario: Samsung
    Given I load allo.ua page
    When I search phone "Samsung S26 Ultra"
    Then I check phone in DB