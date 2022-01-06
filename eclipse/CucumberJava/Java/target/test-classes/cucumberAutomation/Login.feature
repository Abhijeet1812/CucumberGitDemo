Feature: Application login

 Background:
		Given validate the browser
    When Browser is opened
    Then Pop up message should get displayed
    
	@FunctionalTest @RegressionTest
  Scenario: Home page deafault login
    Given User on the login page
    When User logged in the applicaton with "roy" and "123456"
    Then Home page should get displayed
    And Cards should Display "true"
    
    @RegressionTest @WebTest
    Scenario: Home page deafault login
    Given User on the login page
    When User logged in the applicaton with "Alex" and "654321"
    Then Home page should get displayed
    And Cards should Display "false"
    
		@MobileTest
    Scenario: Sign Up page login 
    Given User on the login page
    When User sign up following details
    | jerry | abced | PQR |
    Then Home page should get displayed
    And Cards should Display "false"
     
     @SmokeTest
     Scenario Outline: Sign Up page login 
    Given User on the login page
    When User sign up with multiple<username> and <password>
    Then Home page should get displayed
    And Cards should Display "false"
    
    Examples: 
    | username | password |
    | Aman | 12345 |
    | Username1 | 1 |
    | Username2 | 12 |
    | Username3 | 123 |
    | Username4 | 1234 |
    | Username5 | 12345 |
    