Feature: user orders Hoodies
@Hoodies
Scenario: user place order for hoodies
Given user click on "Men"
And user click on "Hoodies & Sweatshirts" from section "Tops"
And user click on "Ajax Full-Zip Sweatshirt"
And user click on "XS"
And user click on "Blue" color
And user click on "Add to Cart"
And user click on "shopping cart"
When user click on "Proceed to Checkout" button
And user enter random 10 char into shipping mail
And user enter random 10 char into shipping address "First Name"
And user enter random 10 char into shipping address "Last Name"
And user enter random 10 char into shipping address "Company"
And user enter random 10 char into shipping address "Street Address"
And user enter random 10 char into shipping address "City"
And user click on "Please select a region, state or province."
And user click on "Texas"
And user enter random 5 number into shipping address "Zip/Postal Code"
And user enter random 10 number into shipping address "Phone Number"
And user click on "Fixed"
And user click on "Next"
And user wait for 30 seconds
When user click on "action primary checkout" buttonSpan
#And user click on "Place Order"
And user click on "Continue Shopping"