Feature: AutomationPractise end to end testing
Scenario: Verify the Womentab functionality
Given user launch the automation practise application
When the user mousehover on the Women tab
Then Verify the Dresses in the header


Scenario: verify the Casual Dresses functionality
When the user clicks on the casualdresses options
Then verify the selected result in header

Scenario: Verify the casual dresses select page
When the user mousehover on a selected dress
And clicks on the more button
Then verify whether the user is able to select the dress and proceeds next

Scenario: verify the functionality of printed dress page
When the user clicks on plus sign for adding the qunatity
And select the size from drop down
And click on add to cart
Then verify whether the item added successfully in the header of the page

Scenario: Verify the proceed to check click button 
When the user clicks on proceed to check out button
Then verify whether the user is able to go to next page 

Scenario: verify the proceed to checkout button
When the user clicks onthe proceed to checkout button
Then verify whether the user is navigating to next page

Scenario: verify the login functionality of authentication page
When the user clicks on the email id "anitha.popuri@gmail.com"
And the user gives the password "dummy"
And the user clicks on signin





