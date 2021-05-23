Feature: Edit Lead to the Leaftaps Application

Background:
Given Launch Chrome browser for Delete Lead
When Load URL for Delete Lead 'http://leaftaps.com/opentaps'
And Type username for Delete as 'DemoSalesManager' 
And Type password for Delete as 'crmsfa'
And Click Login Button for Delete
Then Verify Login is successful for Delete
And Click CRM SFA for Delete
And Click Leads Tab for Delete

Scenario Outline: Delete a Lead with mandatory fields

When To Click on the Find Leads for Delete
And To click on phone
And Send phone number as <phoneNumber>
And Submit Find Leads button
And Get LeadId
And Click first match 
And Click Delete
And Click Find Leads
And Send LeadId button 
And Click Find Leads Button
Then Verify No Records Display Message 

Examples:
|phoneNumber|
|99|
|123|