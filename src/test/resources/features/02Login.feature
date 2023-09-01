
Feature:  Verify Login  for https://dsportalapp.herokuapp.com 
 

  Scenario: TC01_ Verfying  valid login credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   Then Homepage should be displayed with text "NumpyNinja"
   And User clicks on Logout
   
   
   Scenario: TC02_ Verfying  Invalid login credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And  Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 2 and columnumber 0
   And User enters signIn password from given rownumber 2 and columnumber 1
   And User clicks on login
   Then Invalid homepage should be displayed with text "Invalid Username and Password"
  
   
   
   
  
  
  

