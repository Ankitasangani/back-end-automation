Feature: Testing different currencies responses

  @smoke
  Scenario Outline: Verify response contains correct currencies respectively
    When User sends a GET request to "<currency>" endpoint
    Then User must get response with valid status code 200

    Examples:
      |currency|
      |GBP     |
      |EUR     |
      |SEK     |

