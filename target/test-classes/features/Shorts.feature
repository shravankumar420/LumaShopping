Feature: user orders Shorts
@Shorts
Scenario: user place order for shorts
Given user click on "Women"
And user click on "Shorts" from section "Bottoms"
And user click on "Angel Light Running Short"
And user click on "29"
And user click on "Purple" color
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
And user click on "Washington"
And user enter random 6 number into shipping address "Zip/Postal Code"
And user enter random 10 number into shipping address "Phone Number"
And user click on "Fixed"
And user click on "Next"
And user click on "Place Order" button
And user click on "Continue Shopping"