Feature: Add items in Reminder

Scenario Outline: Enter the items

	Given User is entering "<url>"
	Then type "<task1>" click Enter "<task2>" click Enter "<task3>"

Examples:
|url|task1|task2|task3|
|http://todomvc.com/examples/vue/|Book tickets|Attend Meeting|Send Report|


Scenario Outline: Mark items as completed
	
	When "<task1>" and "<task2>" click on checkbox

Examples:
|task1|task2|
|Book tickets|Attend Meeting|


Scenario Outline: Remove items from ToDo List
	
	When "<task1>" and "<task2>" click on cross button

Examples:
|task1|task2|
|Book tickets|Attend Meeting|

Scenario: Verifying that there are only 1 active task

	Given click on Active button
	Then verify only 1 active task
	
Scenario: Add one more task to verify the number of items left is displayed correctly

	Given Add one more item in the reminder
	Then Verify the number of items left is displayed as 2