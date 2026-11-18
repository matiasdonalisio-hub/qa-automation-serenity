Feature: API health check
  As a QA engineer
  I want to confirm the camioneros API is up
  So that the rest of the suite runs against a live service

  Scenario: The health endpoint reports that the service is running
    When Ops checks the health endpoint
    Then the API should respond with status 200
    And the service status should be "ok"
