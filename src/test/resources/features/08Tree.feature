Feature:  Verify Tree  page
 

  Scenario: TC01_ Verfying Overview of Trees credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Overview of Trees
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
   
  Scenario: TC02_ Verfying  Terminologies credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Terminologies
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
     
  Scenario: TC03_ Verfying  Types of Trees credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Types of Trees
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
     
  Scenario: TC04_ Verfying  Tree Traversals credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Tree Traversals
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1 
     
  Scenario: TC05_ Verfying  Traversals credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Traversals
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1   
   
     
  Scenario: TC06_ Verfying  Binary Trees credentials
   Given  Request base url is "https://dsportalapp.herokuapp.com"
   When User clicks on Get Started
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Sign in
   And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
   And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
   And User clicks on login
   And Homepage should be displayed with text "NumpyNinja"
   And User clicks on Tree Get Start
   And User clicks on Binary Trees
   And User clicks on try here
   And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
   Then User clicks on run  
   Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
   
   Scenario: TC07_ Verfying Types of Binary Trees credentials
    Given  Request base url is "https://dsportalapp.herokuapp.com"
    When User clicks on Get Started
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Sign in
    And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks on login
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Tree Get Start
    And User clicks on Types of Binary Trees
    And User clicks on try here
    And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
    Then User clicks on run  
    Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1      
    
   Scenario: TC08_ Verfying  Implementation in Python credentials
    Given  Request base url is "https://dsportalapp.herokuapp.com"
    When User clicks on Get Started
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Sign in
    And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks on login
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Tree Get Start
    And User clicks on Implementation in Python
    And User clicks on try here
    And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
    Then User clicks on run  
    Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1    
    
   Scenario: TC09_ Verfying  Binary Tree Traversals credentials
    Given  Request base url is "https://dsportalapp.herokuapp.com"
    When User clicks on Get Started
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Sign in
    And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks on login
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Tree Get Start
    And User clicks on Binary Tree Traversals
    And User clicks on try here
    And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
    Then User clicks on run  
    Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
    
   Scenario: TC10_ Verfying  Implementation of Binary Trees credentials
    Given  Request base url is "https://dsportalapp.herokuapp.com"
    When User clicks on Get Started
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Sign in
    And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks on login
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Tree Get Start
    And User clicks on Implementation of Binary Trees
    And User clicks on try here
    And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
    Then User clicks on run  
    Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1
     
          
   Scenario: TC11_ Verfying  Implementation of Binary Trees credentials
    Given  Request base url is "https://dsportalapp.herokuapp.com"
    When User clicks on Get Started
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Sign in
    And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
    And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
    And User clicks on login
    And Homepage should be displayed with text "NumpyNinja"
    And User clicks on Tree Get Start
    And User clicks on Applications of Binary trees
    And User clicks on try here
    And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
    Then User clicks on run  
    Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1     
    
   Scenario: TC12_ Verfying  Binary Search Trees credentials
     Given  Request base url is "https://dsportalapp.herokuapp.com"
     When User clicks on Get Started
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Sign in
     And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
     And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
     And User clicks on login
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Tree Get Start
     And User clicks on Binary Search Trees
     And User clicks on try here
     And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
     Then User clicks on run  
     Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
     
   Scenario: TC13_ Verfying  Implementation Of BST credentials
     Given  Request base url is "https://dsportalapp.herokuapp.com"
     When User clicks on Get Started
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Sign in
     And User enters username from given sheetname "Sheet2" rownumber 1 and columnumber 0
     And User enters signIn password from given sheetname "Sheet2" rownumber 1 and columnumber 1
     And User clicks on login
     And Homepage should be displayed with text "NumpyNinja"
     And User clicks on Tree Get Start
     And User clicks on Implementation Of BST
     And User clicks on try here
     And User enters code from given sheetname "Sheet1" rownumber 1 and columnumber 0
     Then User clicks on run  
     Then User should validat on code output from excel sheetname "Sheet1" rownumber 1 and columnumber 1  
     
      