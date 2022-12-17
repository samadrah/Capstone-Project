Feature: Create new Account feature

@creatingaccount
Scenario: Verify user can create an account into Retail Website
 Given User is on retail website
 When User click on Sign In option
 And User click on Create New Account button
 And  User fill the signUp information with below data
 |name|email|password|confirmPassword|
 |alphalegend|legend0006@tekschool.us|12345@Qwe|12345@Qwe|
 And User click on SignUp button
 Then User should be logged in into account page
 