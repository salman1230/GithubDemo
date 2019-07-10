Feature: Data Driven Testing
Scenario: Login using different credentials
Scenario Outline: Login using below users
When Login using <Username> and <Password>
Examples:
|Username|Password|
|user1|pass2|
|user2|pass2|

