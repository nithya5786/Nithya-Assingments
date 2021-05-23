Feature: Login to the Leaftaps Application

Background:
Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login is successful
And Click CRM SFA
And Click Leads Tab

Scenario Outline: Create a new Lead with mandatory fields

When Click Create Lead Menu
And Type Company Name as <companyName>
And Type First Name as <firstName>
And Type Last Name as <lastName>
And Click Create Lead Button
And Verify the lead is created

Examples:
|companyName|firstName|lastName|
|infosys|nithya|ravi|
