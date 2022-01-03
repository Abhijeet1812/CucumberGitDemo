Feature: Search and place order for vegetables

@SeleniumTest
Scenario: search item and validate the actual result
Given User is on GreenKart page
When User searched for cucumber vegetable
Then "cucumber" should be dispplayed


@SeleniumTest
Scenario Outline: search item and move to checkout page
Given User is on GreenKart page
When User searched for <FlowerName> vegetable
And add to items to cart
And user procceed to checkout page
Then verify selected <FlowerName> items is displayed or not

Examples:
|FlowerName|
|Cauliflower|
|cucumber|
|beetroot|