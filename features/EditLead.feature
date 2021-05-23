Feature: Edit Lead to the Leaftaps Application

Background:
Given Launch Chrome browser for Edit Lead
When Load URL for Edit Lead 'http://leaftaps.com/opentaps'
And Type username for Edit as 'DemoSalesManager' 
And Type password for Edit as 'crmsfa'
And Click Login Button for Edit
Then Verify Login is successful for Edit
And Click CRM SFA for Edit
And Click Leads Tab for Edit

Scenario Outline: Edit a  Lead with mandatory fields

When To Click on the Find Leads for Edit
And To enter firstname as <firstName>
And To click on the find leads button
And Click on first resulting lead
And To get existing company name
And To click on Edit option 
And To clear existing value and update new Company name as <companyName>
And To click on update button 
Then Verify changed company value 


Examples:
|firstName|companyName|
|nithya|wipro|
|nithya|infosys|