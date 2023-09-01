Feature:  Verify Data Structures  page
 

  Scenario: TC01_ Verfying  Data Structures credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Data Structures Get Start
   And User clicks on Time Complexity
   And User clicks on try here
   And User enters code from given rownumber 1 and columnumber 0
   Then User clicks on run
   Then User should validat on code output from excel rownumber 1 and columnumber 1
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
   