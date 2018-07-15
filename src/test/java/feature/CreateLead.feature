Feature: Login for LeafTaps
#Background:
#Given Open the browser
#And Launch the url
#And Set the timeouts
#And Maximise the browser
#And Enter the username as DemoSalesManager
#And Enter the password as crmsfa
##And Click on the login button
#And Login is successful
#And Click on crmsfalink
#And Crmsfa successfull

Scenario Outline: CreateLead Positive
And Click on leads
And Click on createlead
And Give companyname as <cname>
And Give firstname as <fname>
And Give lastname as <lname>

Examples:
|cname|fname|lname|
|AON|Indhu|Rajavel|
|TCS|Kalai|TamilSelvan|
