Feature: log in on account and add address

  Scenario Outline: log in on the website https://mystore-testlab.coderslab.pl


    Given i launch firefox browser and open stores website

    When on the main page click on sign in
    And log in
    And on the account site click on the Create new address
    When refill address to the account with the following data: <alias>, <address>, <city>, <zip/postal code>, <country>, <phone>
    And click save
    Then delete the address

    Examples:
      | alias | address     | city     | zip/postal code | country        | phone |
      | kot   | 201 Ohua Ave| Honolulu | 96811           | United Kingdom | 5555555 |