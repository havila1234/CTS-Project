@Demoblaze
Feature: DemoblazeApp

  @TC01_Demoblaze
  Scenario: Login in the Demoblaze
    Given Launch web browser
    When user open the demoblaze homepage
    And click on the login button popup window appears
    And user enter the username
    And user enter the passsword
    Then user click on Login button to go to homePage

  @TC02_Demoblaze
  Scenario: Add Laptop to cart
    Given user tap on Laptop
    Then user will click on desired Laptop
    Then tap on add to cart
    Then tap Ok on popup
    Then the user click on cart page

  @TC03_Demoblaze
  Scenario: Add Monitors to cart
    Given person  click on Monitor
    Then user click on desired Monitor
    Then user tap add to cart
    And click OK in message
    Then click on cart

  @TC04_Demoblaze
  Scenario: Add phone to cart
    Given user click on Phone
    And select the desired phone
    Then select add to cart button
    And handle the window alerts
    Then person tap cart page

  @TC05_Demoblaze
  Scenario Outline: Purchase a product
    Given User launch the chrome browser
    When user open  demoblaze homepage
    And click  login button popup window appears
    And user fill up  <username>
    And user fills up the <password>
    Then select Login button
    Then click on Laptop link
    And user choose desired Laptop
    Then user select add to cart option
    And person  need to handle the alert
    Then tap on cart link
    Then click home button to go homePage
    And user on pc link
    Then user has to choose desired option
    Then choose add to cart
    Then popup message should be handle
    Then tap the cart button
    And again go to homePage
    Then click on phone link
    Then user clicks on a desired phone
    And add the phone to cart
    Then handle alert message
    Then go to cart page
    Then user click on purchase with credentials<name> <country> <city> <card> <month> <year>
    And tap the accept button
    Then logout the website

    Examples: 
      | username | password        | name | country | city | card        | month | year |
      | User_1   | Workfromhome$12 | ABC  | ABC     | ABC  | 12345674544 |     4 | 2020 |

  
  @TC06_Demoblaze
  Scenario Outline: User Exists
    Given User launch browser
    When user opens homepage
    And click on the signup button popup window appears
    And enter the  <username>
    And user fill up the <password>
    Then user click on signup button
    Then click OK on alert message

    Examples: 
      | username | password        |
      | User_1   | Workfromhome$12 |

  @TC07_Demoblaze
  Scenario: number of items in the page
    Given user launch demoblaze application
    Then user check the number of products in a webpage
    Then print the number of products in a webpage

  @TC08_Demoblaze
  Scenario: Assertion of Email Address
    Given user launch Web application
    Then get the Email address from footer
    Then assert the actual and expected Email addresses
