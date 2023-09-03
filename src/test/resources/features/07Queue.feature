Feature:  Verify Queue  page
 

  Scenario: TC01_ Verfying Implementation of Queue in Python credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Queue Get Start
   And User clicks on Implementation of Queue in Python
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
   
  Scenario: TC02_ Verfying  Implementation using collections.deque credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Queue Get Start
   And User clicks on Implementation using collections
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
    
  Scenario: TC03_ Verfying  Implementation using array credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Queue Get Start
   And User clicks on Implementation using array
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
   
    Scenario: TC04_ Verfying  Queue Operations credentials
     Given  Request base url is "https://dsportalapp.herokuapp.com"
     When User clicks on Get Started
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Sign in
     And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
     And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
     And User clicks on login
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Queue Get Start
     And User clicks on Queue Operations
     And User clicks on try here
     And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
     Then User clicks on run  
     Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1   
     
  