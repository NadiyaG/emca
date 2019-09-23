package Page_Factory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class pf_CaadminsetupPage extends pf_genericmethods{
	
	@FindBy(xpath="//*[@id='generateID']") WebElement GenerateId;
	@FindBy(xpath="//*[@id='download']") WebElement Dowbtn;
	//Next button in Generate ID
	@FindBy(xpath="//*[@id='nextForRegistration']") WebElement Nextbtn;
	@FindBy(xpath="//*[@id='licenceFile']") WebElement chooseFilebtn;
	
	//New Licenses objects
	//@FindBy(xpath="//*[@id='licyes']") WebElement yesraiobtn;
	@FindBy(xpath="//*[@class='radioInner']/input") WebElement yesraiobtn;
	
	
	public pf_CaadminsetupPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
		wait = new WebDriverWait(driver,30);
		
	}
	
	public void newLicense() {
		cl_click(GenerateId);
		et.log(LogStatus.PASS,"Generate Id button clicked- passed");
		cl_click(Dowbtn);
		et.log(LogStatus.PASS,"Download license button clicked- passed");
		cl_click(Nextbtn);
		et.log(LogStatus.PASS,"Next button is clicked- passed");
		cl_click(chooseFilebtn);
		et.log(LogStatus.PASS,"Choose file is clicked- passed");	
	}
	public void existingLicense() {
		
		//((JavascriptExecutor) w).executeScript("arguments[0].checked = true;", yesraiobtn);
		cl_click(Nextbtn);
		//cl_click(chooseFilebtn);
		
	}

}
