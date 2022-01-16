Feature: zad1

  Scenario: user can search any keyword


    Given an open browser with https://mystore-testlab.coderslab.pl/index.php

    When a keyword selenium is entered in input field

    Then the first one should contain selenium

    And close browser