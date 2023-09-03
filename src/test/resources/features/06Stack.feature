Feature:  Verify Stack  page
 

  Scenario: TC01_ Verfying Operations in Stack credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Stack Get Start
   And User clicks on Operations in Stack
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
   
  Scenario: TC02_ Verfying  Implementation credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Stack Get Start
   And User clicks on Implementation
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
     
  Scenario: TC03_ Verfying  Applications credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Stack Get Start
   And User clicks on Applications
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
     
     
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
   