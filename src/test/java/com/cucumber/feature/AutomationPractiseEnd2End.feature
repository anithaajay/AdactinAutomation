Feature: AutomationPractise end to end testing
Scenario:  Verify the login functionality of the application
Given User launch the automation practice application
When User click on the Signin button in the header
And User enter the email address in the authentication page
And User enter the password in the authentication page
And User click on the signIn button
Then User verify the username in the header 

Scenario: Verfiy the search functionality of the application
When User enter product name in the search feild
And User click on the search button
Then User verify the search result in the search header

Scenario: verify the addtocart functionality of the application
When User clicks on the particular product
And user selects the addto cart product
Then verify whether the product is added to the cart or not

Scenario: verify the proceed to checkout functionality
When user clicks on the proceed to checkout
Then verify whether checkout is getting proceed to next page


Scenario: verify the shopping cart summary
When user click on the proceed to checkout button
Then verify the user can be able to proceed to addresspage

Scenario: verify the Address page proceed to checkout
When user clicks on the proceed to checkout button
Then verify whether the user is getting navigated from address to shiffing page

Scenario: Verify the shipping page and navigate to next page
When user clicks on the  terms and conditions checkbox 
And clicks on the proceed to checkout button
Then verify whether the user is getting navigated from shipping page to Payment page

Scenario: Verify the pagement page and navigate to nextpage
When the user clicks on the paybycheck button
Then verify whether user is able to make the payment and proceed to next page

Scenario: verify the confirm order page 
When the useer clicks on proceed to checkout
Then Verify whether user is able to proceed to checkout 

Scenario: Verify whether the user is able to logout after confirmationorder
When the user clicks on the signout button
Then verify whether the user is able to logout and navigate to authentication page

