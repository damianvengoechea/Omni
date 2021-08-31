Feature: find a product
  I as a user
  want to search for a product
  to buy it


  Scenario: Search a product Adidas
    Given that user wants search zapatos adidas in Amazon
    When you find the shoes and sort them
    And prints in descending order
