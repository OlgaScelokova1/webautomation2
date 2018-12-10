Feature: One

 // Scenario: Successful sign-up
 //Given I have opened landing page
 //   When I select My Account menu
 //   And I select Sign up menu
 //   And Sign Up page is opened
 //   And I enter valid first name in signup form
 //   And I enter valid last name in signup form
 //   And I enter valid mobile number in signup form
  //  And I enter valid email address in signup form
  //  And I enter password in signup form
  //  And I re-enter password in signup form
  //  And I select SIGN UP button
  //  Then dashboard is opened


  Scenario: Send sucessfull contact form
    Given I have opened TestDevLab landing page
      When I select Contact Us button
      And contact form is opened
      And I enter first name in contact form
      And I enter last name in contact form
      And I enter email address in contact form
      And I enter phone number in contact form
      And I enter company name in contact form
      And I select services topic
      And I enter message in contact form
      And I select I'm not a robot option
    Then form is sent
