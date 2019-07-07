Feature: Automation practise complete testing
Scenario: verify the login functionality of the application with invalid user details
Given User launch the automation practice application
When User click on the Signin button in the header
And User enter the email address in the authentication page
And User enter the password in the authentication page
And User click on the signIn button
Then verify whenther the application showing the error message or not

Scenario: verify the login functionality with valid user details
When User enter the email id  in the authentication page
And User enter the password in the password feild
And User clicks on the signIn button
Then Verify the User is able to proceed to the My Account page.

Scenario: Verify the My personal information button
When the user clicks on the particualr button from My Account Page
Then Verify whether the user is able to navigae to personal details page

Scenario: verify whether the user is navigating to home page when user is clicking on Homebutton in the footer
When the user clicks on Home button in the footer
Then verify whether the user is able to go back to home page

Scenario: verify the Women tab functionality is showing all the options when mouse hover on the element
When the user Mouse hover on the women tab
And user should be able to click on the Tops button
Then verify whether the user is able to navigate to Tops page

Scenario: verify the functionality of Tshirts subcategory
When the user clicks on Tshirts button 
Then verify whether is user is able to navigate to the T-shirts page


Scenario: verify the functionality of List type view
When the user clicks on the List button
Then verify whether the user is able to see the change in view

Scenario: verify the functionality of catalog
When the user clicks on any one option of size checkbox
And the user checkin the sleeves checkbox
Then verify whether the user is able to check the boxes

Scenario: verify the functionality of addtocompare and wishlist
When the user clicks on add to compare
And user clicks on wishlist button
And verify whether a new window is popup with informaation
Then verify whether the user is able to close the popup window

Scenario: verify the login functionality of addto compare button
When the user clicks on compare button in the header
Then verify whether the user is able to navigate to  comparisionheader

Scenario: verify the view button functiolaity of view button in comparision page
When the user clicks on view button in comparision button
Then verify whether the user is able to navigate to productdetailspage

Scenario: verify the write a review functionality
When the user clicks on write a review functionality
Then verify whether is able to see a new popup window to submit review
Then click on close button to navigae to original page


Scenario: verify the review functionality window
When the user provides data in title feild
And provides the input values in the comment feild
And User clicks on send button
Then verify whether the review has been recorded or not.


Scenario: verify all the elemnets in the product details
When the user clicks on add qunatity
And user clicks on the color
And select size from drop down
And click on the add to cart button
Then verify whether the product is added to cart


Scenario: verify the addtocart button functionality
When the user clicks on the add to cart button
Then verify whether the user is able to navigate to the next page

Scenario: verify whether qty field is active or not in the cart summary page
When the user clicks on minus button in qty
Then verify whether the quantity is changing accordingly or not

Scenario: verify the functionality of proceed to checkout
When the user clicks on proceed to checkout button
Then verify whether the user is navigating to address page

Scenario: Verify the functionality of update button in addresspage
When the user clicks on update button in address page
Then verify whether the user is able to navigate to My addresses page

Scenario: Verify the functionality of update address page
When the user updates the last name from the address page
And click on the save button
Then verify whether the page is navigating back to the proceed to address page










