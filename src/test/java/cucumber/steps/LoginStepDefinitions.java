package cucumber.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.pages.HomePage;
import cucumber.pages.LandingPage;
import cucumber.pages.LoginPage;
import cucumber.pages.RegisterPage;
import cucumber.utilities.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	public static WebDriver driver;
	public static LoginPage loginPage;
	public static RegisterPage registerPage;
	public static LandingPage landingPage;
	public static HomePage homePage;

	@BeforeAll
	public static void beforeAll() {
		String currentDirectory = System.getProperty("user.dir");
		String browserDriverDirectory = currentDirectory + "/../browser_drivers/";
		System.setProperty("webdriver.edge.driver", browserDriverDirectory + "msedgedriver.exe");	
	}
	@Before
	public void before() {
		driver = new EdgeDriver();
		loginPage=new LoginPage(driver);
		registerPage=new RegisterPage(driver);
		landingPage=new LandingPage(driver);
		homePage=new HomePage(driver);
	}
	@After
	public void after() {
		driver.close();
	}
	@AfterAll
	public static void afterAll() {
		driver.quit();
	}
	
	@Given("Request base url is {string}")
	public void request_base_url_is(String url) {
		driver.get(url);
	}
	@When("User clicks on Get Started")
	public void user_clicks_on_get_started() {
		landingPage.clickStart();
	}

	@Then("User clicks on Logout")
	public void user_clicks_on_logout() {
		loginPage.btnLogout();

	}

	@When("Homepage should be displayed with text {string}")
	public void homepage_should_be_displayed_with_text(String expectedText) {
		loginPage.labelHomepage(expectedText);

	}
	@When("User  clicks on Register")
	public void user_clicks_on_register() {
		registerPage.clickRegister();
		
	}

	@When("User enters valid username as {string}")
	public void user_enters_valid_username_as(String txtUsername) {
		registerPage.txtUsername(txtUsername);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		registerPage.txtPassword(password);

	}

	@When("User enters password confirmation as {string}")
	public void user_enters_password_confirmation_as(String txtConfpassword) {
		registerPage.txtConfpassword(txtConfpassword);

	}

	@When("User should clicks on verification Register")
	public void user_should_clicks_on_verification_register() {
		registerPage.clickVerificationRegister();
	}

	@Then("Mismatch label should be displayed with text {string}")
	public void mismatch_label_should_be_displayed_with_text(String expectedText) {
		registerPage.labelInvalidHomepage(expectedText);

	
	}
	/*************login************/

	@When("User clicks on Sign in")
	public void user_clicks_on_sign_in() {
		loginPage.btnSigIn();
	}

	@When("User enters username from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enters_username_as(String sheetname,int rowNumber,int columNumber) {
		String newUserName = ExcelReader.getExcelValue(sheetname, rowNumber, columNumber);
		loginPage.txtIdName(newUserName);

	}

	@When("User enters signIn password from given sheetname {string} rownumber {int} and columnumber {int}")
	public void user_enters_signIn_password_as(String sheetname,int rowNumber,int columNumber) {
		String newPassword=ExcelReader.getExcelValue(sheetname, rowNumber, columNumber);
		loginPage.txtIdPassword(newPassword);
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		loginPage.btnLogIn();

	}

	@When("Invalid homepage should be displayed with text {string}")
	public void invalid_homepage_should_be_displayed_with_text(String expectedText) {
		loginPage.labelInvalidLogIn(expectedText);

	}

	
	// ********Data Structures*********/
	
	@When("User clicks on Data Structures Get Start")
	public void user_clicks_on_data_structures_get_start() {
		homePage.btnDataStructures();

	}

	@When("User clicks on Time Complexity")
	public void user_clicks_on_time_complexity() {
		homePage.linkTimeComplexity();

	}

	@When("User clicks on try here")
	public void User_clicks_on_try_here() {
		homePage.btnTryHere();
	}

	@When("User enters code from given sheetname {string} rownumber {int} and columnumber {int}")
	public void User_enters_code(String sheetname,int rowNumber,int columNumber) {
		String code=ExcelReader.getExcelValue(sheetname, rowNumber, columNumber);
		homePage.enterCodeUsingAction(code);
			
	}
	

	@When("User clicks on run")
	public void user_clicks_on_run() {
		homePage.btnRunCode();

	}
	@Then("User should validat on code output from excel sheetname {string} rownumber {int} and columnumber {int}")
	public void User_should_validate_on_code_output_from_excel(String sheetname,int rowNumber,int columNumber) {
		String code=ExcelReader.getExcelValue(sheetname, rowNumber, columNumber);
		homePage.lebalValidCode(code);
			
	}

	// ********Arrays*********
	
	@When("User clicks on Arrays Get Start")
	public void user_clicks_on_arrays_get_start() {
		homePage.btnArrays();

	}

	@When("User clicks on Arrays in Python")
	public void user_clicks_on_arrays_in_python() {
		homePage.linkArraysInPython();

	}

	@When("User clicks on Arrays Using List")
	public void user_clicks_on_arrays_using_list() {
		homePage.linkArraysUsingList();
	}

	@When("User clicks on Basic Operations in Lists")
	public void user_clicks_on_basic_operations_in_lists() {
		homePage.linkBasicOperationsInLists();
	}

	@When("User clicks on Applications of Array")
	public void user_clicks_on_applications_of_array() {
		homePage.linkApplicationsOfArray();
	}
	
	// ********Linked Lists*********/

	@When("User clicks on Linked List Get Start")
	public void user_clicks_on_linked_list_get_start() {
		homePage.btnLinkedList();
	}

	@When("User clicks on Introduction")
	public void user_clicks_on_Introduction() {
		homePage.linkIntroduction();
	}

	@When("User clicks on Creating Linked LIst")
	public void user_clicks_on_creating_linked_lIst() {
		homePage.linkCreatingLinkedLIst();
	}

	@When("User clicks on Types of Linked List")
	public void user_clicks_on_types_of_linked_list() {
		homePage.linkTypesOfLinkedList();
	}

	@When("User clicks on Implement Linked List in Python")
	public void user_clicks_on_implement_linked_list_in_python() {
		homePage.linkImplementLinkedListInPython();
	}

	@When("User clicks on Traversal")
	public void user_clicks_on_traversal() {
		homePage.linkTraversal();
	}

	@When("User clicks on Insertion")
	public void user_clicks_on_insertion() {
		homePage.linkInsertion();
	}

	@When("User clicks on Deletion")
	public void user_clicks_on_deletion() {
		homePage.linkDeletion();
	}
	
	// *********Stack***********/

	@When("User clicks on Stack Get Start")
	public void user_clicks_on_stack_get_start() {
		homePage.btnStack();
	}

	@When("User clicks on Operations in Stack")
	public void user_clicks_on_operations_in_stack() {
		homePage.linkOperationsInStack();
	}

	@When("User clicks on Implementation")
	public void user_clicks_on_implementation() {
		homePage.linkImplementation();
	}

	@When("User clicks on Applications")
	public void user_clicks_on_applications() {
		homePage.linkApplications();
	}
	
	// *********Queue***********/

	@When("User clicks on Queue Get Start")
	public void user_clicks_on_queue_get_start() {
		homePage.btnQueue();
	}

	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_Implementation_of_queue_in_pythoi() {
		homePage.linkImplementationOfQueueInPython();
	}

	@When("User clicks on Implementation using collections")
	public void user_clicks_on_implementation_using_collections() {
		homePage.linkImplementationUsingCollections();
	}

	@When("User clicks on Implementation using array")
	public void user_clicks_on_implementation_using_array() {
		homePage.linkImplementationUsingArray();
	}

	@When("User clicks on Queue Operations")
	public void user_clicks_on_queue_perations() {
		homePage.linkQueueOperations();
	}
	
	// *********Tree***********/

	@When("User clicks on Tree Get Start")
	public void user_clicks_on_Tree_get_start() {
		homePage.btnTree();
	}

	@When("User clicks on Overview of Trees")
	public void user_clicks_on_overview_of_trees() {
		homePage.linkOverviewOfTrees();
	}

	@When("User clicks on Terminologies")
	public void user_clicks_on_terminologies() {
		homePage.linkTerminologies();
	}

	@When("User clicks on Types of Trees")
	public void user_clicks_on_types_of_trees() {
		homePage.linkTypesOfTrees();
	}

	@When("User clicks on Tree Traversals")
	public void user_clicks_on_tree_traversals() {
		homePage.linkTreeTraversals();
	}

	@When("User clicks on Traversals")
	public void user_clicks_on_traversals() {
		homePage.linkTraversals();
	}

	@When("User clicks on Binary Trees")
	public void user_clicks_on_binary_trees() {
		homePage.linkBinaryTrees();
	}

	@When("User clicks on Types of Binary Trees")
	public void user_clicks_on_types_of_binary_trees() {
		homePage.linkTypesOfbinaryTrees();
	}

	@When("User clicks on Implementation in Python")
	public void user_clicks_on_implementation_in_python() {
		homePage.linkImplementationInPython();
	}

	@When("User clicks on Binary Tree Traversals")
	public void user_clicks_on_binary_tree_traversals() {
		homePage.linkBinaryTreesTraversals();
	}

	@When("User clicks on Implementation of Binary Trees")
	public void user_clicks_on_implementation_of_binary_trees() {
		homePage.linkImplementationOfBinaryTrees();
	}

	@When("User clicks on Applications of Binary trees")
	public void user_clicks_on_applications_of_binary_trees() {
		homePage.linkApplicationsOfBinaryTrees();
	}

	@When("User clicks on Binary Search Trees")
	public void user_clicks_on_binary_search_trees() {
		homePage.linkBinarySearchTrees();
	}

	@When("User clicks on Implementation Of BST")
	public void user_clicks_on_implementation_Of_BST() {
		homePage.linkImplementationOfBST();
	}
	
	// *********Graph**********/

	@When("User clicks on Graph Get Start")
	public void user_clicks_on_graph_get_start() {
		homePage.btnGraphlink();
	}

	@When("User clicks on Graph")
	public void user_clicks_on_graph() {
		homePage.linkGraph();
	}

	@When("User clicks on Graph Representations")
	public void user_clicks_on_graph_representations() {
		homePage.linkGraphRepresentations();
	}

}
