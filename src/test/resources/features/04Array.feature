Feature:  Verify Array  page

  Scenario: TC01_ Verfying Arrays in Python credentials
   Given Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Arrays Get Start
   And User clicks on Arrays in Python
   And User clicks on try here
   And User enters code from given rownumber 1 and columnumber 0
   Then User clicks on run
   Then User should validat on code output from excel rownumber 1 and columnumber 1
   
  Scenario: TC02_ Verfying  Arrays Using Lists credentials
   Given Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Arrays Get Start
   And User clicks on Arrays Using List
   And User clicks on try here
   And User enters code from given rownumber 1 and columnumber 0
   Then User clicks on run
   Then User should validat on code output from excel rownumber 1 and columnumber 1
     
  Scenario: TC03_ Verfying  Basic Operations in Lists credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Arrays Get Start
   And User clicks on Basic Operations in Lists
   And User clicks on try here
   And User enters code from given rownumber 1 and columnumber 0
   Then User clicks on run 
   Then User should validat on code output from excel rownumber 1 and columnumber 1 
   
  Scenario: TC04_ Verfying  Applications of Arrays credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given rownumber 1 and columnumber 0
   And User enters signIn password from given rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Arrays Get Start
   And User clicks on Applications of Array
   And User clicks on try here
   And User enters code from given rownumber 1 and columnumber 0
   Then User clicks on run 
   Then User should validat on code output from excel rownumber 1 and columnumber 1
