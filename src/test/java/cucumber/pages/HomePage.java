package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	Actions actions;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	// ********Data Structures*********/
		@FindBy(xpath = "/html/body/div[3]/div[1]/div/div/a")
		WebElement btnGatStartDS;
		@FindBy(xpath = "/html/body/div[2]/ul/a")
		WebElement linkTimeComplexity;
		@FindBy(xpath = "//body/div[2]/div/div[2]/a")
		WebElement btnTryHere;
		@FindBy(xpath = "//form[@id='answer_form']/div/div/div[1]/textarea")
		WebElement txtCode;
		@FindBy(xpath = "//button[contains(text(),'Run')]")
		WebElement btnRun;
		@FindBy(xpath="//*[@id=\"output\"]")
		WebElement lebalCode;

		// ********Arrays*********/
		@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/a")
		WebElement btnGatstartArrays;
		@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
		WebElement linkArraysInPython;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkArraysUsingList;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkBasicOperationsInLists;
		@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
		WebElement linkApplicationsOfArray;

		// ********Linked Lists*********/
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/a")///html/body/div[2]/div[3]/div/div/a
		WebElement btnGetStartLL;
		@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
		WebElement linkIntroduction;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkCreatingLinkedLIst;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkTypesOfLinkedList;
		@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
		WebElement linkImplementLinkedListInPython;
		@FindBy(xpath = "/html/body/div[2]/ul[5]/a")
		WebElement linkTraversal;
		@FindBy(xpath = "/html/body/div[2]/ul[6]/a")
		WebElement linkInsertion;
		@FindBy(xpath = "/html/body/div[2]/ul[7]/a")
		WebElement linkDeletion;

		// *********Stack***********/
		@FindBy(xpath = "/html/body/div[3]/div[4]/div/div/a")
		WebElement btngGetStartStack;
		@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
		WebElement linkOperationsInStack;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkImplementation;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkApplications;

		// *********Queue***********/
		@FindBy(xpath = "/html/body/div[3]/div[5]/div/div/a")
		WebElement btnGetStartQueue;
		@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
		WebElement linkImplementationOfQueueInPython;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkImplementationUsingCollections;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkImplementationUsingArray;
		@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
		WebElement linkQueueOperations;

		// *********Tree***********/
		@FindBy(xpath = "/html/body/div[3]/div[6]/div/div/a")
		WebElement btnGetStartTree;
		@FindBy(xpath = "/html/body/div[2]/ul[1]/a")
		WebElement linkOverviewOfTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkTerminologies;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkTypesOfTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
		WebElement linkTreeTraversals;
		@FindBy(xpath = "/html/body/div[2]/ul[5]/a")
		WebElement linkTraversals;
		@FindBy(xpath = "/html/body/div[2]/ul[6]/a")
		WebElement linkBinaryTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[7]/a")
		WebElement linkTypesOfbinaryTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[8]/a")
		WebElement linkImplementationInPython;
		@FindBy(xpath = "/html/body/div[2]/ul[9]/a")
		WebElement linkBinaryTreesTraversals;
		@FindBy(xpath = "/html/body/div[2]/ul[10]/a")
		WebElement linkImplementationOfBinaryTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[11]/a")
		WebElement linkApplicationsOfBinaryTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[12]/a")
		WebElement linkBinarySearchTrees;
		@FindBy(xpath = "/html/body/div[2]/ul[13]/a")
		WebElement linkImplementationOfBST;

		// *********Graph***********/
		@FindBy(xpath = "/html/body/div[3]/div[7]/div/div/a")
		WebElement btnGetStartGraph;
		@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
		WebElement linkGraph;
		@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
		WebElement linkGraphRepresentations;
		
		// ********Data Structures*********/
		public void btnDataStructures() {
			btnGatStartDS.click();
		}

		public void linkTimeComplexity() {
			linkTimeComplexity.click();
		}

		public void btnTryHere() {
			btnTryHere.click();
		}

		public void txtEnterCode(String print) {
			txtCode.clear();
			txtCode.sendKeys();
		}
		
		public void enterCodeUsingAction(String code) {
			actions.sendKeys(txtCode, code).perform();
		}

		public void btnRunCode() {
			btnRun.click();
		}
		public void lebalValidCode(String expectedText) {
			String actualText = lebalCode.getText();
			Assert.assertEquals(expectedText, actualText);
			
		}

		// ********Arrays*********
		public void btnArrays() {
			btnGatstartArrays.click();
		}

		public void linkArraysInPython() {
			linkArraysInPython.click();
		}

		public void linkArraysUsingList() {
			linkArraysUsingList.click();
		}

		public void linkBasicOperationsInLists() {
			linkBasicOperationsInLists.click();
		}

		public void linkApplicationsOfArray() {
			linkApplicationsOfArray.click();
		}

		// ********Linked Lists*********/
		public void btnLinkedList() {
			btnGetStartLL.click();
		}

		public void linkIntroduction() {
			linkIntroduction.click();
		}

		public void linkCreatingLinkedLIst() {
			linkCreatingLinkedLIst.click();
		}

		public void linkTypesOfLinkedList() {
			linkTypesOfLinkedList.click();
		}

		public void linkImplementLinkedListInPython() {
			linkImplementLinkedListInPython.click();
		}

		public void linkTraversal() {
			linkTraversal.click();
		}

		public void linkInsertion() {
			linkInsertion.click();
		}

		public void linkDeletion() {
			linkDeletion.click();
		}

		// *********Stack***********/
		public void btnStack() {
			btngGetStartStack.click();
		}

		public void linkOperationsInStack() {
			linkOperationsInStack.click();
		}

		public void linkImplementation() {
			linkImplementation.click();
		}

		public void linkApplications() {
			linkApplications.click();
		}

		// *********Queue***********/
		public void btnQueue() {
			btnGetStartQueue.click();
		}

		public void linkImplementationOfQueueInPython() {
			linkImplementationOfQueueInPython.click();
		}

		public void linkImplementationUsingCollections() {
			linkImplementationUsingCollections.click();
		}

		public void linkImplementationUsingArray() {
			linkImplementationUsingArray.click();
		}

		public void linkQueueOperations() {
			linkQueueOperations.click();
		}

		// *********Tree***********/
		public void btnTree() {
			btnGetStartTree.click();
		}

		public void linkOverviewOfTrees() {
			linkOverviewOfTrees.click();
		}

		public void linkTerminologies() {
			linkTerminologies.click();
		}

		public void linkTypesOfTrees() {
			linkTypesOfTrees.click();
		}

		public void linkTreeTraversals() {
			linkTreeTraversals.click();
		}

		public void linkTraversals() {
			linkTraversals.click();
		}

		public void linkBinaryTrees() {
			linkBinaryTrees.click();
		}

		public void linkTypesOfbinaryTrees() {
			linkTypesOfbinaryTrees.click();
		}

		public void linkImplementationInPython() {
			linkImplementationInPython.click();
		}

		public void linkBinaryTreesTraversals() {
			linkBinaryTreesTraversals.click();
		}

		public void linkImplementationOfBinaryTrees() {
			linkImplementationOfBinaryTrees.click();
		}

		public void linkApplicationsOfBinaryTrees() {
			linkApplicationsOfBinaryTrees.click();
		}

		public void linkBinarySearchTrees() {
			linkBinarySearchTrees.click();
		}

		public void linkImplementationOfBST() {
			linkImplementationOfBST.click();
		}

		// *********Graph**********/
		public void btnGraphlink() {
			btnGetStartGraph.click();
		}

		public void linkGraph() {
			linkGraph.click();
		}

		public void linkGraphRepresentations() {
			linkGraphRepresentations.click();
		}

		
		

}
