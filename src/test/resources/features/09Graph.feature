Feature:  Verify Graph  page
 

  Scenario: TC01_ Verfying Graph credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Graph Get Start
   And User clicks on Graph
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1 
   
  Scenario: TC02_ Verfying  Graph Representations credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Graph Get Start
   And User clicks on Graph Representations
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1 