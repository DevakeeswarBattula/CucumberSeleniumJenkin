Feature: purchasing headphones
@addproduct
 Scenario: purchase product
     Given user enter url of app
     When user adds product to cart and make payment
     Then product purchased successfully