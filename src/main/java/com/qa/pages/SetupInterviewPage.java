package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.TestBase;

public class SetupInterviewPage extends TestBase {

	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static Actions acts = new Actions(driver);

	public static final By setupinterviewbutton = By
			.xpath("//span[@class='nav-txt'][normalize-space()='Setup Interview']");
	public static final By interviewkitbutton = By.xpath("//span[normalize-space()='Interview Kit']");
	public static final By interviewlistingpagr = By.xpath("//*[@id=\"toggle-nav-brand\"]/span");
	public static final By addnewkit = By.xpath("//button[@id='add_new_kit_btn']");
	public static final By createownkit = By.xpath("//a[@id='create_kit']");
	public static final By titletextbox = By.xpath("//input[@id='kit_title']");
	public static final By videoquestbutton = By.xpath("//button[@id='qtype_1']");
	public static final By videoquesttextbox = By.xpath("//textarea[@id='data']");
	public static final By retakebutton = By.xpath("//span[@id='select2-takes_1-container']");
	public static final By listofretakecount = By.xpath("//*[@class='select2-results__options']/li");
	public static final By thinktimebutton = By.xpath("//span[@id='select2-thinkTime1-container']");
	public static final By listofthinktimecount = By.xpath("//*[@class='select2-results__options']/li");
	public static final By ansdurationbutton = By.xpath("//span[@id='select2-timeDuration1-container']");
	public static final By ansdurationcount = By.xpath("//*[@class='select2-results__options']/li");
	public static final By savebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By mcqbutton = By.xpath("//button[@id='qtype_2']");
	public static final By mcqtextbox = By.xpath("//textarea[@id='data']");
	public static final By mcqradiobutton = By.xpath("//li[1]//span[1]//input[1]");
	public static final By mcqtextboxofselect = By.xpath("//li[1]//span[2]//input[1]");
	public static final By mcqtextboxofselect2 = By.xpath("//li[2]//span[2]//input[1]");
	public static final By mcqsavebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By essaybutton = By.xpath("//button[@id='qtype_3']");
	public static final By essaytextbox = By.xpath("//textarea[@id='data']");
	public static final By essaysavebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By audiobutton = By.xpath("//button[@id='qtype_4']");
	public static final By audiotextbox = By.xpath("//textarea[@id='data']");
	public static final By audiosavebutton = By.xpath("//button[normalize-space()='Save']");
	// public static final By addmediabutton = By.xpath("//*[contains(.,'Add
	// Media')][contains(@class,'btn btn-primary btn-sm mediaID31610')]");
	public static final By addmediabutton = By.xpath(
			"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
	public static final By picfromlibrary = By.xpath("//a[normalize-space()='Pick from Library']");
	public static final By addvideobutton = By.xpath("//a[normalize-space()='Add Video']");
	public static final By recordvideobutton = By.xpath("//button[normalize-space()='Record Video']");
	public static final By recordstartbutton = By.xpath("//button[@class='btn btn-secondary mx-1 my-2 strtRecord']");
	public static final By recordfinishbutton = By.xpath("//button[normalize-space()='Finish Recording']");
	public static final By record_add_videobutton = By.xpath("//button[@id='btnAddMediaVideoJQ']");
	public static final By medialib_cancelbutton = By
			.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']");
	public static final By pickmediaroundbutton = By.xpath(
			"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	public static final By pickmediacancelbutton = By
			.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']");
	public static final By addwelcomenotebutton = By.xpath("//button[@id='qtype_6']");
	public static final By addwelcomenotedecrip = By.xpath("//textarea[@id='intro_desc']");
	public static final By welcomenoteaddmediabutton = By.xpath("//button[@id='addMedia']");
	public static final By addwelcomentesavebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By addexitnotebutton = By.xpath("//button[@id='qtype_7']");
	public static final By exitnotetextbox = By.xpath("//textarea[@id='exit_desc']");
	public static final By exitnotetaddmediabutton = By.xpath("//button[@id='addMedia']");
	public static final By exitnotetadddocumentbutton = By.xpath("//a[normalize-space()='Add Documents']");
	public static final By exitnoteuploaddoc = By.xpath("//input[@id='uploadDoc']");
	public static final By exituploadaddbutton = By.xpath("//button[normalize-space()='Add']");
	public static final By exitnotesavebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By addslidebutton = By.xpath("//button[@id='qtype_5']");
	public static final By slidetextbox = By.xpath("//textarea[@id='data']");
	public static final By slidesavebutton = By.xpath("//button[normalize-space()='Save']");
	public static final By slideaddmedia = By.xpath(
			"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
	public static final By slidemediacancel = By
			.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']");
	public static final By savekitbutton = By.xpath("//button[normalize-space()='Save Kit']");
	public static final By addInterviewkitPredefbutton = By.xpath("//button[@id='add_new_kit_btn']");
	public static final By clickonPredefinedkitbutton = By.xpath("//h6[normalize-space()='Pre Defined Interview Kit']");
	public static final By nextbuttonpredefined = By.xpath("//button[@id='default_kit_nxt_btn']");
	public static final By savekitbuttonpredefined = By.xpath("//button[normalize-space()='Save Kit']");
	public static final By videouploadaddbutton = By
			.xpath("//button[@class='btn btn-primary-soft2 mx-1 my-2 videoUploadJQ']");
	public static final By addaudiobutton = By.xpath("//a[normalize-space()='Add Audio']");
	public static final By audiouploadbutton = By
			.xpath("//button[@class='btn btn-primary-soft2 mx-1 my-2 uploadAudioJQ']");
	public static final By selectradiobuttonInterviewkit = By.xpath("//label[@class='form-check-label']");

	public SetupInterviewPage(WebDriver driver) {

		this.driver = driver;
	}

	public void user_click_on_setup_interview() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(setupinterviewbutton).click();

		Thread.sleep(3000);

	}

	public void user_clicks_on_interview_kit() throws InterruptedException {

		driver.findElement(interviewkitbutton).click();
		Thread.sleep(3000);
	}

	public void user_have_to_see_the_interview_listing_page() {

		System.out.println(driver.findElement(interviewlistingpagr).isDisplayed());

	}

	public void user_click_on_add_interview_kit() throws InterruptedException, AWTException {

		driver.findElement(addnewkit).click();

		Thread.sleep(2000);

		driver.findElement(createownkit).click();
		Thread.sleep(2000);
		driver.findElement(titletextbox).sendKeys("TestKit178");
		Thread.sleep(2000);
		driver.findElement(videoquestbutton).click();
		Thread.sleep(2000);
		driver.findElement(videoquesttextbox).sendKeys(
				" This is another get-to-know-you question that gives you an opportunity to share your experience and passions. ");
		Thread.sleep(2000);
		driver.findElement(retakebutton).click();
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", retake_ele);
		Thread.sleep(3000);
		List<WebElement> retakesltr = driver.findElements(listofretakecount);
		System.out.println("The retakes counts of:" + retakesltr.size());
		Thread.sleep(3000);
		for (int i = 0; i < retakesltr.size(); i++) {

			System.out.println("The retakes text: " + retakesltr.get(i).getText());

			if (retakesltr.get(i).getText().contains("3")) {

				Thread.sleep(2000);

				retakesltr.get(i).click();

				Thread.sleep(2000);

				break;

			}

		}

		driver.findElement(thinktimebutton).click();
//        JavascriptExecutor j1 = (JavascriptExecutor) driver;
//		j1.executeScript("arguments[0].click();", thinktime_ele);
		Thread.sleep(2000);
		List<WebElement> thinktimeltr = driver.findElements(listofthinktimecount);
		System.out.println("The unlimited counts of:" + thinktimeltr.size());
		for (int i = 0; i < thinktimeltr.size(); i++) {

			System.out.println("The think time text: " + thinktimeltr.get(i).getText());

			if (thinktimeltr.get(i).getText().contains("20 Second")) {

				Thread.sleep(2000);

				thinktimeltr.get(i).click();

				Thread.sleep(2000);

				break;

			}

		}

		driver.findElement(ansdurationbutton).click();

//		JavascriptExecutor j2 = (JavascriptExecutor) driver;
//		j2.executeScript("arguments[0].click();", ansduration_ele);
		Thread.sleep(2000);

		List<WebElement> ansduration = driver.findElements(ansdurationcount);
		System.out.println("The unlimited counts of:" + ansduration.size());
		Thread.sleep(3000);
		for (int i = 0; i < ansduration.size(); i++) {

			System.out.println("The answerduration text: " + ansduration.get(i).getText());

			if (ansduration.get(i).getText().contains("4 minute")) {

				Thread.sleep(2000);

				ansduration.get(i).click();

				Thread.sleep(2000);

				break;

			}

		}

		driver.findElement(savebutton).click();

		Thread.sleep(2000);

		driver.findElement(mcqbutton).click();

		Thread.sleep(2000);

		driver.findElement(mcqtextbox).sendKeys(" Employers want employees who are excited about their work,");
		Thread.sleep(2000);

		driver.findElement(mcqradiobutton).click();
		;

		Thread.sleep(2000);

		driver.findElement(mcqtextboxofselect).sendKeys("Boundary Analysis");
		Thread.sleep(2000);

		driver.findElement(mcqtextboxofselect2).sendKeys("Test Coverage");

		Thread.sleep(3000);

		WebElement mcqbutton = driver.findElement(mcqsavebutton);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", mcqbutton);

		Thread.sleep(2000);

		driver.findElement(essaybutton).click();

		Thread.sleep(2000);

		driver.findElement(essaytextbox).sendKeys(
				"Even though I generally enjoy my work, working with a long stream of difficult customers becomes draining.");

		Thread.sleep(2000);

		WebElement essaybutton = driver.findElement(essaysavebutton);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", essaybutton);

		Thread.sleep(2000);

		driver.findElement(audiobutton).click();

		Thread.sleep(2000);

		driver.findElement(audiotextbox)
				.sendKeys(" Your interviewers want to know what sets you apart from other candidates.");

		Thread.sleep(2000);

		WebElement audio_save_button = driver.findElement(audiosavebutton);
		JavascriptExecutor javaexe = (JavascriptExecutor) driver;
		javaexe.executeScript("arguments[0].click();", audio_save_button);

		Thread.sleep(3000);
		driver.findElement(addmediabutton).click();

		Thread.sleep(3000);
//	driver.findElement(picfromlibrary).click();
//		
//		Thread.sleep(3000);

		WebElement pickroundbutton = driver.findElement(pickmediaroundbutton);
		JavascriptExecutor javaexescript = (JavascriptExecutor) driver;
		javaexescript.executeScript("arguments[0].click();", pickroundbutton);

		Thread.sleep(2000);

		WebElement mediacancelbutton = driver.findElement(pickmediacancelbutton);
		JavascriptExecutor javaexesc = (JavascriptExecutor) driver;
		javaexesc.executeScript("arguments[0].click();", mediacancelbutton);

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);

		driver.findElement(addwelcomenotebutton).click();

		Thread.sleep(2000);

		driver.findElement(addwelcomenotedecrip).sendKeys("This is an welcome note");

		Thread.sleep(2000);

		WebElement welcomemedia = driver.findElement(welcomenoteaddmediabutton);
		JavascriptExecutor javaexe1 = (JavascriptExecutor) driver;
		javaexe1.executeScript("arguments[0].click();", welcomemedia);
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"))
				.click();
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement welcomesavebutton = driver.findElement(addwelcomentesavebutton);
		JavascriptExecutor welcomebuttonsave = (JavascriptExecutor) driver;
		welcomebuttonsave.executeScript("arguments[0].click();", welcomesavebutton);
		Thread.sleep(2000);

		Thread.sleep(2000);

		driver.findElement(addexitnotebutton).click();

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		a.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(2000);

		driver.findElement(exitnotetextbox).sendKeys("This is exit note");

		Thread.sleep(2000);

		driver.findElement(exitnotetaddmediabutton).click();

		Thread.sleep(2000);

		driver.findElement(exitnotetadddocumentbutton).click();

		Thread.sleep(2000);

		WebElement exitnoteupload = driver.findElement(exitnoteuploaddoc);
		JavascriptExecutor javascriex = (JavascriptExecutor) driver;
		javascriex.executeScript("arguments[0].click();", exitnoteupload);

		Thread.sleep(3000);

		StringSelection ss = new StringSelection("C:\\Users\\User\\Downloads\\60202_pdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);

		Actions act = new Actions(driver);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement exitaddbuttonmedia = driver.findElement(exituploadaddbutton);
		JavascriptExecutor jexecu = (JavascriptExecutor) driver;
		jexecu.executeScript("arguments[0].click();", exitaddbuttonmedia);

		Thread.sleep(2000);

		WebElement exitsavebutton = driver.findElement(exitnotesavebutton);
		JavascriptExecutor jsetor = (JavascriptExecutor) driver;
		jsetor.executeScript("arguments[0].click();", exitsavebutton);

		Thread.sleep(2000);

		driver.findElement(addslidebutton).click();

		Thread.sleep(2000);

		driver.findElement(slidetextbox).sendKeys("This is slide need to view");

		Thread.sleep(2000);

		WebElement slidebuttonsave = driver.findElement(slidesavebutton);
		JavascriptExecutor exes = (JavascriptExecutor) driver;
		exes.executeScript("arguments[0].click();", slidebuttonsave);

		Actions acts = new Actions(driver);

		acts.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(2000);

		driver.findElement(slideaddmedia).click();

		Actions act1 = new Actions(driver);

		act1.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/input[1]"));

		Thread.sleep(2000);

		WebElement cancelslide = driver.findElement(slidemediacancel);
		JavascriptExecutor exejavasc = (JavascriptExecutor) driver;
		exejavasc.executeScript("arguments[0].click();", cancelslide);

		Thread.sleep(2000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_UP).build().perform();

		WebElement ele2 = driver.findElement(savekitbutton);
		JavascriptExecutor exscrip = (JavascriptExecutor) driver;
		exscrip.executeScript("arguments[0].click();", ele2);

		driver.close();
	}
	// *****************Addding Predefined Interview Kit*****************

	public void user_click_on_add_interview() throws InterruptedException {

		driver.findElement(addInterviewkitPredefbutton).click();

		Thread.sleep(2000);

	}

	public void user_click_on_predefined_interview_kit() throws InterruptedException {

		driver.findElement(clickonPredefinedkitbutton).click();

		Thread.sleep(2000);

	}

	public void user_select_one_of_the_interview_kit() throws InterruptedException {
		List<WebElement> predefinedltr = driver.findElements(By.xpath("//*[@class='form-check mb-3']"));
		Thread.sleep(2000);
		System.out.println("The size of" + predefinedltr.size());
		Thread.sleep(2000);
		for (int i = 0; i < predefinedltr.size(); i++) {

			System.out.println("The list of " + predefinedltr.get(i).getText());

			if (predefinedltr.get(i).getText().contains("Marketing Coordinator")) {

				Thread.sleep(3000);
				predefinedltr.get(i).click();
				Thread.sleep(3000);

				break;

			}

		}

	}

	public void user_click_on_next_button() throws InterruptedException {

		driver.findElement(nextbuttonpredefined).click();

		Thread.sleep(2000);

	}

	public void user_click_on_save_kit_button() {

		WebElement elesavekitpredef = driver.findElement(savekitbuttonpredefined);

		JavascriptExecutor exscrip = (JavascriptExecutor) driver;
		exscrip.executeScript("arguments[0].click();", elesavekitpredef);

	}

	public void user_view_the_added_intervie_kit_in_interview_listing_page() {

		WebElement namekitadded = driver.findElement(By.xpath("(//div[@class='d-flex flex-wrap top-info-innr'])[1]"));

		String nameofAddedKitpredefined = namekitadded.getText();

		System.out.println("The kit name" + namekitadded.isDisplayed());

		System.out.println("The name of kit:" + nameofAddedKitpredefined);

	}

	// ********************Adding Interview through
	// Flexible*************************************

	public void user_click_on_create_you_own() throws InterruptedException {

		driver.findElement(createownkit).click();

		Thread.sleep(2000);

	}

	public void enter_title_of_interview() throws InterruptedException {

		driver.findElement(titletextbox).sendKeys("TestKit Software DEveloper");

		Thread.sleep(5000);
	}

	public void user_select_flexible_to_add_interview_question() throws InterruptedException, AWTException {

		List<WebElement> selectInterviewtypeoption = driver.findElements(selectradiobuttonInterviewkit);

		System.out.println("The total count of Interview Types :" + " " + selectInterviewtypeoption.size());

		for (int i = 0; i < selectInterviewtypeoption.size(); i++) {

			System.out.println(">>>>>>>" + selectInterviewtypeoption.get(i).getText());

			if (selectInterviewtypeoption.get(i).getText().contains("Flexible")) {

				Thread.sleep(3000);

				selectInterviewtypeoption.get(i).click();

				Thread.sleep(3000);

				break;

			}

		}

		driver.findElement(videoquestbutton).click();
		Thread.sleep(3000);
		driver.findElement(videoquesttextbox).sendKeys(" Screening questions help to ensure that respondents  ");
		Thread.sleep(2000);

		WebElement saveeleclick = driver.findElement(savebutton);

		JavascriptExecutor exscriptsaveclick = (JavascriptExecutor) driver;
		exscriptsaveclick.executeScript("arguments[0].click();", saveeleclick);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Add Media')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Add Video']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='btn btn-primary-soft2 mx-1 my-2 videoUploadJQ']")).click();

		Thread.sleep(3000);

		WebElement browserbutton = driver.findElement(By.xpath("(//input[@id='upload-btn'])[1]"));
		JavascriptExecutor exscripbro = (JavascriptExecutor) driver;
		exscripbro.executeScript("arguments[0].click();", browserbutton);

		Thread.sleep(4000);

		StringSelection ss = new StringSelection("C:\\Users\\User\\Desktop\\sample-5s.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		Thread.sleep(14000);

		WebElement addele = driver.findElement(By.xpath("//button[@id='btnAddMediaVideoJQ']"));

		JavascriptExecutor exscriptadd = (JavascriptExecutor) driver;
		exscriptadd.executeScript("arguments[0].click();", addele);

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']")).click();

		Thread.sleep(3000);

		driver.findElement(audiobutton).click();

		Thread.sleep(2000);

		driver.findElement(audiotextbox).sendKeys(" Your interviewers want");

		Thread.sleep(2000);

		WebElement saveeleclickaudio = driver.findElement(savebutton);

		JavascriptExecutor exscriptaudiosaveclick = (JavascriptExecutor) driver;
		exscriptaudiosaveclick.executeScript("arguments[0].click();", saveeleclickaudio);

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Add Audio']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[normalize-space()='Record Audio']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@id='btn-start-recording']")).click();

		Thread.sleep(12000);

		driver.findElement(By.xpath("//button[@id='btn-start-recording']")).click();

		Thread.sleep(8000);

		WebElement addeleaudio = driver.findElement(By.xpath("//button[normalize-space()='Add Audio']"));

		JavascriptExecutor exscriptaddaudio = (JavascriptExecutor) driver;
		exscriptaddaudio.executeScript("arguments[0].click();", addeleaudio);

		Actions actionaudio = new Actions(driver);

		actionaudio.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@id='qtype_3']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//textarea[@id='data']")).sendKeys("This");

		Thread.sleep(2000);

		WebElement saveeleclickessay = driver.findElement(savebutton);

		JavascriptExecutor exscriptessaysaveclick = (JavascriptExecutor) driver;
		exscriptessaysaveclick.executeScript("arguments[0].click();", saveeleclickessay);

		// driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		Thread.sleep(4000);

		WebElement essaymediaclick = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[5]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));

		JavascriptExecutor exscriptessaymediaclick = (JavascriptExecutor) driver;
		exscriptessaymediaclick.executeScript("arguments[0].click();", essaymediaclick);

		Thread.sleep(3000);

		// driver.findElement(By.xpath("//button[normalize-space()='Save
		// Kit']")).click();

		List<WebElement> ltraddmeddia = driver.findElements(By.xpath("//div[@class='select-icon']"));

		System.out.println("The total count of media:" + ltraddmeddia.size());

		Thread.sleep(3000);

		for (int a = 0; a < ltraddmeddia.size(); a++) {

			Thread.sleep(2000);

			ltraddmeddia.get(a).click();

			Thread.sleep(2000);

			Thread.sleep(2000);

//			WebElement elepage=driver.findElement(By.xpath("//a[normalize-space()='14']"));
//			 
//			JavascriptExecutor exscriptpageclick = (JavascriptExecutor) driver;
//		    
//			exscriptpageclick.executeScript("arguments[0].click();", elepage);
//			

		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Add Documents']")).click();

		Thread.sleep(3000);

		WebElement eledoc = driver.findElement(By.xpath("//input[@name='Doc']"));

		JavascriptExecutor exscriptdoc = (JavascriptExecutor) driver;
		exscriptdoc.executeScript("arguments[0].click();", eledoc);

		Thread.sleep(2000);

		StringSelection docsel = new StringSelection("C:\\Users\\User\\Desktop\\Login_ExtentPdf_Report.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(docsel, null);

		Thread.sleep(4000);
		Robot robotseldoc = new Robot();
		robotseldoc.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robotseldoc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robotseldoc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robotseldoc.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robotseldoc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robotseldoc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		Thread.sleep(14000);

		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

		Thread.sleep(2000);

		WebElement docelecancel = driver
				.findElement(By.xpath("//button[@class='btn btn-secondary btn-shadow cancelJQ slideQuestion']"));

		JavascriptExecutor exscriptdocancel = (JavascriptExecutor) driver;
		exscriptdocancel.executeScript("arguments[0].click();", docelecancel);

		Thread.sleep(3000);

	}

	// ********************Adding Interview through
	// Timed******************************

	public void user_select_timed_and_set_time_to_add_interview_questions() throws InterruptedException, AWTException {

		List<WebElement> selectInterviewtypeoption1 = driver.findElements(selectradiobuttonInterviewkit);

		System.out.println("The total count of Interview Types :" + " " + selectInterviewtypeoption1.size());

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Timed']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='answer_duration']")).sendKeys("10");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='saveDuration']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='qtype_6']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='addMedia']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Add Images']")).click();

		Thread.sleep(2000);

		WebElement eleimage = driver.findElement(By.xpath("//input[@name='Img']"));

		JavascriptExecutor exscriptimage = (JavascriptExecutor) driver;
		exscriptimage.executeScript("arguments[0].click();", eleimage);

		Thread.sleep(2000);

		StringSelection imagesel = new StringSelection("C:\\Users\\User\\Desktop\\fff.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagesel, null);

		Thread.sleep(4000);
		Robot robotselimh = new Robot();
		robotselimh.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robotselimh.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robotselimh.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robotselimh.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robotselimh.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robotselimh.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		Thread.sleep(14000);

		Actions actionimage = new Actions(driver);

		actionimage.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(2000);

		WebElement addindinageele = driver.findElement(By.xpath("//button[@id='btnAddMediaImgJQ']"));

		JavascriptExecutor exscriptimageadd = (JavascriptExecutor) driver;
		exscriptimageadd.executeScript("arguments[0].click();", addindinageele);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//textarea[@id='intro_desc']")).sendKeys("This is WelCome Note!");

		Thread.sleep(2000);

		WebElement imagesavebuttonele = driver.findElement(By.xpath("//button[normalize-space()='Save']"));

		JavascriptExecutor exscriptsaveimagebutton = (JavascriptExecutor) driver;
		exscriptsaveimagebutton.executeScript("arguments[0].click();", imagesavebuttonele);
		Thread.sleep(3000);

		Actions actionimage1 = new Actions(driver);

		actionimage1.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='qtype_7']")).click();

		Thread.sleep(3000);

		// **Add video in Exit Note****

		WebElement addexitimages = driver.findElement(By.xpath("//button[@id='addMedia']"));

		JavascriptExecutor exscriptsaveimagebutton1 = (JavascriptExecutor) driver;
		exscriptsaveimagebutton1.executeScript("arguments[0].click();", addexitimages);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Add Video']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Record Video']")).click();

		Thread.sleep(3000);

		WebElement startele = driver.findElement(By.xpath("//button[@class='btn btn-secondary mx-1 my-2 strtRecord']"));
		JavascriptExecutor exscriptstartbutton = (JavascriptExecutor) driver;
		exscriptstartbutton.executeScript("arguments[0].click();", startele);

		Thread.sleep(15000);

		driver.findElement(By.xpath("//button[normalize-space()='Finish Recording']")).click();

		Thread.sleep(12000);

		WebElement addvideoele = driver.findElement(By.xpath("//button[@id='btnAddMediaVideoJQ']"));
		JavascriptExecutor exscriptaddvideobutton = (JavascriptExecutor) driver;
		exscriptaddvideobutton.executeScript("arguments[0].click();", addvideoele);

		Thread.sleep(5000);

		WebElement addvideoelesave = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		JavascriptExecutor exscriptaddvideosave = (JavascriptExecutor) driver;
		exscriptaddvideosave.executeScript("arguments[0].click();", addvideoelesave);

		Thread.sleep(3000);

	}

	// ***********Schedule the Interview****************

	public void user_click_on_schedule_interview() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Schedule Interview']")).click();

		Thread.sleep(2000);

	}

	public void user_enter_detail_in_setup_interview_page() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("//span[@id='select2-job_id-container']")).click();

		Thread.sleep(2000);

		List<WebElement> selectjobltr = driver.findElements(By.xpath("//*[@id='select2-job_id-results']/li"));

		System.out.println("The count of select job are " + selectjobltr.size());

		Thread.sleep(2000);

		for (int i = 0; i < selectjobltr.size(); i++) {

			System.out.println("The list of Select job are:" + "   " + selectjobltr.get(i).getText());

			if (selectjobltr.get(i).getText().contains("QA Tester")) {

				selectjobltr.get(i).click();

				break;

			}

		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@id='select2-job_assessment_kit-container']")).click();

		Thread.sleep(3000);

		List<WebElement> intkitltr = driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));

		System.out.println("The count of Interview Job are:" + "   " + intkitltr.size());

		Thread.sleep(2000);

		for (int i = 0; i < intkitltr.size(); i++) {

			System.out.println("The list of Interview Job are: " + "    " + intkitltr.get(i).getText());

			if (intkitltr.get(i).getText().contains("TestKit178")) {

				Thread.sleep(2000);

				intkitltr.get(i).click();

				Thread.sleep(2000);

				break;
			}

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='preRecordedDate']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//td[normalize-space()='15']")).click();

		Thread.sleep(3000);

		Actions actionimage2 = new Actions(driver);

		actionimage2.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='form-control checkName']")).sendKeys("testdimple");

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@placeholder='Enter Email Address'])[1]"))
				.sendKeys("testdimple78@yopmail.com.com");

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@id='jobma_phone']")).sendKeys("8319620297");

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@id='sms_notification']")).click();

		Thread.sleep(2000);

		WebElement schedulesend = driver.findElement(By.xpath("//button[@id='submit']"));

		JavascriptExecutor exscriptschedulebuttonsend = (JavascriptExecutor) driver;
		exscriptschedulebuttonsend.executeScript("arguments[0].click();", schedulesend);

		Thread.sleep(8000);

		driver.navigate().to("https://testing.jobma.com/employer/invitations");

		Thread.sleep(4000);

		WebElement copylink = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]"));

		Thread.sleep(4000);
		copylink.click();
		Thread.sleep(4000);

		String sscopy = copylink.getAttribute("data-clipboard-text");

		System.out.println(">>>>" + copylink.getAttribute("data-clipboard-text"));

		Thread.sleep(2000);

//		((JavascriptExecutor) driver).executeScript("window.open()");
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
		
		//***********opening a new tab*********
		
		JavascriptExecutor exnewwind = (JavascriptExecutor) driver;
		
		exnewwind.executeScript("window.open()");
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		
		driver.get(sscopy);

		Thread.sleep(2000);
		
	    System.out.println("The title of page:"  +driver.getTitle());
		Thread.sleep(10000);
		
		WebElement okele=driver.findElement(By.xpath("//button[normalize-space()='Ok']"));
	
		JavascriptExecutor exscriptokele = (JavascriptExecutor) driver;
		exscriptokele.executeScript("arguments[0].click();", okele);
		Thread.sleep(4000);
		
	WebElement getstartedele=driver.findElement(By.xpath("//button[normalize-space()='Get Started']"));
		
		Thread.sleep(5000);
		
		JavascriptExecutor exscriptgetstart = (JavascriptExecutor) driver;
		exscriptgetstart.executeScript("arguments[0].click();", getstartedele);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='flexCheckDefault']")).click();
		
		Thread.sleep(14000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		Thread.sleep(12000);
		
		WebElement eleskip=driver.findElement(By.xpath("//button[normalize-space()='Skip']"));
		
		JavascriptExecutor exscriptskip = (JavascriptExecutor) driver;
		exscriptskip.executeScript("arguments[0].click();", eleskip);
		
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[@class='btn px-7 rounded-lg bg-white py-4 btn-shadow-lg startInterviewProcess']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

	}

}
