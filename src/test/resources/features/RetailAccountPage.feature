@smokeTest
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign In option
    And User enter email 'nothing2@gmail.com' and password '123456@Ewq'
    And User click on login button
    And User should be logged in into account

  @accountInfo
  Scenario: Verify user can update Profile information
    When User click on Account option
    And User update Name 'Genius' and Phone '202-548-1124'
    And User click on update option
    Then User profile information should be updated

  #@passChange
  #Scenario: Verify User Can Update Password
    #When User click on Account option
    #And User enter below information
      #| previousPassword | newPassword | confrimPassword |
      #| 123456@Ewq       | 123456@Rewq  | 123456@Rewq      |
    #And User click on change password button
    #Then a message should be displayed 'Password Updated Successfully'
    #Run above scenario after running all other scenarios because it will change the 
    #password value and all other scenarios will fail in sign in step 

  @addingPaymentMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on add a payment method link
    And User fill Debit or Credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3747220926656098 | Genius  |              12 |           2029 |          958 |
    And User click on add your card button
    Then A message should be displayed 'Payment Method added sucessfully'

  @updatingCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 5425974892711112 | Still Genius |              12 |           2030 |          736 |
    And User click on Update your card button
    Then a Message should be displayed 'Payment Method updated Successfully'

  @removingCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then Payment details should be removed

  @addingAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on add Address option
    And User fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress      | apt | city         | state    | zipCode |
      | United States | Still Genius |  2025483501 | 3045 Somewhere Ave | 523 | FairFax | Virginia |   23543 |
    And User click Add Your Address button
    Then a Message should Be Displayed 'Address Added Successfully'

  @updatingAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below Information
      | country | fullName   | phoneNumber | streetAddress       | apt | city     | state     | zipCode |
      | Canada  | Now Lazy |  2028343256 | 3541 somewhere else | 345 | Ontario | Ontario |   34532 |
    And User click update your address button
    Then a mesaage Should Be displayed 'Address Updated Successfully'

	@removingAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of address section
    Then Address details should be removed
