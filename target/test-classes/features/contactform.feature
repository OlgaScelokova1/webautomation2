Feature: This feature is about successfull sending of contact form



  Scenario: Send successfull contact form
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
