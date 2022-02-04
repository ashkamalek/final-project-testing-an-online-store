Feature: Create a new account and add address and contact details

  Scenario Outline: Create a new account on https://mystore-testlab.coderslab.pl that contains address and contact details


    Given The User launches Firefox browser and opens stores website

    When While on the landing page of that site, the User clicks on the Sign in button to create a new account
    And The User fills in email address and password of his new account and clicks the Sign in button
    And While on the account page, the User clicks on the Create new address button
    When The User fills in the form with the following data: "<alias>", "<address>", "<city>", "<postal_code>", "<phone>", "<country>"
    And The User saves changes by clicking the Save button, after which The User can verify the correctness of the Data provided: "<alias>", "<address>", "<city>", "<postal_code>", "<phone>", "<country>"
    Then The User deletes his Data by clicking the Delete button, after which The User receives a message confirming his Data has been deleted

    Examples:
      | alias | address       | city     | postal_code | country        | phone   |
      | y     | 201 Ohua Ave  | Honolulu | 96811       | United Kingdom | 5555555 |
      | x     | Piccadilly    | London   | 78654       | United Kingdom | 6666666 |
      | z     | Tverskaya     | Moscow   | 86424       | United Kingdom | 7777777 |
      | w     | Suurkatu      | Helsinki | 85467       | United Kingdom | 8888888 |