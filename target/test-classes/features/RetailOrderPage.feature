Feature: Retail Order Page

	@orderCancelation
	Scenario: Verify User can cancel the order
  Given User is on retail website
    When User click on Sign In option
    And User enter email 'nothing2@gmail.com' and password '123456@Ewq'
    And User click on login button
    And User should be logged in into account
    And User Click on Order Section
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on cancel order button
    Then A cancelation message should be displayed 'Your Order Has Been Cancelled'
    
    @orderReturn
    Scenario: Verify User can Return the order
    Given User is on retail website
    When User click on Sign In option
    And User enter email 'nothing2@gmail.com' and password '123456@Ewq'
    And User click on login button
    And User should be logged in into account
    And User Click on Order Section
    And User Click on second order
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then A cancelation Message should be Displayed 'Return was successfull'
    
    @orderReview
    Scenario: Verify User can write a review on order placed
    Given User is on retail website
    When User click on Sign In option
    And User enter email 'nothing2@gmail.com' and password '123456@Ewq'
    And User click on login button
    And User should be logged in into account
    And User Click on Order Section
    And User Click on third order
    And User click on Review button
    And User Write Review headline 'Awesome' and 'worth the money'
    And User click Add your Review button
    Then A review message should be displayed 'Your review was added successfully'