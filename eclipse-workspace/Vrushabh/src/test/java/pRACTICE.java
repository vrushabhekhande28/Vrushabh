

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pRACTICE {
	WebDriver driver;
	ChromeOptions option = new ChromeOptions();

	@BeforeMethod
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\TestNg\\chromedriver.exe");
		option = option.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	// Check the data after click on the

	// @Test(priority = 1)
	public void m2() {
		// for clear the text
		driver.findElement(By.xpath("//a[normalize-space()='Edit']")).click();
		// for entering an text
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Vrushbah Ekhande");
		// Need to append here
		driver.findElement(By.xpath("//input[@id='join']")).sendKeys("Bhaii I am apppend here");
		// Need to get the textfeild in the given textfeild
		driver.findElement(By.xpath("//input[@id='getMe']")).getText();
		// clear the texfeild
		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
		Boolean checkFeild = driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		if (checkFeild) {
			System.out.println("Yes, Textfeild is enabled.");

		} else {
			System.out.println("No, Textfeild is disbaled");
		}

		String s = driver.findElement(By.xpath("//input[@id='dontwrite']")).getAttribute("value");
		if (s.contains("read only")) {
			System.out.println("Yes.Given Textfeils is read only");
		} else {
			System.out.println("Given Textfeild is not read only");
		}
		driver.close();
	}

	// @Test(priority = 2)
	public void button() {
		driver.findElement(By.xpath("//a[normalize-space()='Click']")).click();

		// move to next page and comes back
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();

		Point d = driver.findElement(By.xpath("//button[@id='position']")).getLocation();

		System.out.println("X Cordinates: " + d.getX());
		System.out.println("Y Cordinates: " + d.getY());

		String color = driver.findElement(By.xpath("//button[@id='color']")).getAttribute("background-color");
		System.out.println(color);

		Dimension si = driver.findElement(By.xpath("//button[@id='property']")).getSize();

		System.out.println("Height of button:" + si.getHeight());
		System.out.println("Weidth of button :" + si.getWidth());

		boolean value = driver.findElement(By.xpath("//div[5]//div[1]//button[1]")).isEnabled();
		System.out.println("Button is " + value);
		driver.close();
	}

	// @Test (priority=3)
	public void search() {
		driver.findElement(By.xpath("//a[normalize-space()='Drop-Down']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//select[@id='fruits']/option"));

		for (WebElement d : list) {
			String d1 = d.getText();
			if (d1.equals("Apple")) {
				d.click();
				break;
			}

		}

		List<WebElement> list1 = driver.findElements(By.xpath("//select[@id='superheros']/option"));

		for (WebElement we : list1) {
			String d2 = we.getText();
			Actions a = new Actions(driver);
			a.keyDown(Keys.CONTROL);
			we.click();
			a.keyUp(Keys.CONTROL);

		}

		List<WebElement> e = driver.findElements(By.xpath("//select [@id='lang']/option"));
		int count = e.size();

		int count1 = 0;
		for (WebElement w : e) {
			count1++;

			if (count1 == count - 1) {
				w.click();
			} else {
				System.out.println(w.getText());
			}
		}

		// select an india
		WebElement we = driver.findElement(By.xpath("//select[@id='country']"));

		Select s = new Select(we);
		s.selectByValue("India");
		driver.close();
	}

	// @Test (priority=4)
	public void alert() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Dialog']")).click();
		// Accept the alert
		System.out.println("1st");

		driver.findElement(By.xpath("//button[@id='accept']")).click();
		driver.switchTo().alert().accept();
		System.out.println("2st");

		// get alert text
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		String data = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(data);
		System.out.println("3st");

		// type the name and accept the alert;

		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("Bhaiii");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("4st");

		// sweet alert
		driver.findElement(By.xpath("//button[@id='modern']")).click();
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		System.out.println("5st");

		driver.close();
	}

	// @Test (priority =5)
	public void frame() {
		driver.findElement(By.xpath("//a[normalize-space()='Inner HTML']")).click();

		WebElement we = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(we);

		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("Vrushabh");
		driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Ekhande");

		WebElement we2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));

		driver.switchTo().frame(we2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vrushabhekhande28@gmail.com");

		driver.switchTo().defaultContent();

		driver.close();
	}

	// @Test(priority=6)
	public void radio() {
		// TC_1

		driver.findElement(By.xpath("//a[normalize-space()='Toggle']")).click();

		WebElement we = driver.findElement(By.xpath("//input[@id='yes']")); // yes button
		we.click();

		WebElement we1 = driver.findElement(By.xpath("//div[2]//div[1]//label[2]")); // No button
		we1.click();

		boolean b = we.isSelected();
		boolean b1 = we1.isSelected();

		if (b == true && b1 == true) {
			System.out.println("radio button is not working properly.");
		} else {
			System.out.println("radio bUtton is not working properly");
		}

		driver.findElement(By.xpath("(//label[contains(text(),'No')])[2]")).click();

		// TC_2

		WebElement foo = driver.findElement(By.xpath("//label[normalize-space()='Foo']"));
		WebElement bar = driver.findElement(By.xpath("//label[normalize-space()='Bar']"));

		foo.click();
		bar.click();

		boolean b11 = foo.isSelected();
		boolean b12 = foo.isSelected();

		if (b11 == true && b12 == true) {
			System.out.println("Bug in the two options are selected at a time");
		} else {
			System.out.println("No Bug in the  options are ");
		}

		// TC-2

		boolean check = driver.findElement(By.xpath("//label[normalize-space()='Maybe']")).isEnabled();
		if (check == true) {
			System.out.println("Maybe textfeild is disbled");
		} else {
			System.out.println("Maybe textfeild is enabled");
		}

		// TC 3

		boolean re = driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).isSelected();
		if (re == true) {
			System.out.println("Yesy its selected");
		} else {
			System.out.println("No.its selectd");
		}

		// TC 4

		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-radio-check[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/label[2]/input[1]"))
				.click();

		// TC -5
		driver.close();

	}

	// @Test(priority = 6)
	public void window() {
		driver.findElement(By.xpath("//a[normalize-space()='Tabs']")).click();

//			// TC_1
//			String page1 = driver.getWindowHandle();
//			driver.findElement(By.xpath("//button[@id='home']")).click();
//			System.out.println("page1"+page1);
//
//			// TC_2
//			 Set<String> s = driver.getWindowHandles();
//		     for(String s1:s)
//		     {
//		    	 if(!s1.equals(page1))
//		    	 {
//		    		 driver.switchTo().window(s1);
//		    		 String title=driver.getTitle();
//		    		 System.out.println(title);
//		    		 driver.close();
//		    	 }
//		     }
//		     

		// TC_3
		driver.findElement(By.xpath("//button[@id='multi']")).click();

		Set<String> s4 = driver.getWindowHandles();
		for (String s3 : s4) {

			driver.switchTo().window(s3);
			String title = driver.getTitle();
			System.out.println(title);
			// driver.close();

		}

//		    
		driver.close();
//		

	}

	// @Test(priority=7)
	public void img() {

		driver.findElement(By.xpath("//a[normalize-space()='Find Elements']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your git user name eg., ortonikc']"))
				.sendKeys("vrushabhekhande28");
		driver.findElement(By.xpath("//button[@id='search']")).click();
		String s = driver.findElement(By.xpath("//span[normalize-space()='6']")).getText();

		int num = Integer.parseInt(s);
		System.out.println(num);

		List<WebElement> d = driver.findElements(By.xpath("//div[@class='block']//ol[@type='1']/li"));

		if (num >= 5) {
			for (WebElement we : d) {
				System.out.println(we.getText());
			}
		}

		WebElement we3 = driver.findElement(By.xpath("//img[@alt='Placeholder image']"));

		if (we3 != null) {
			System.out.println("Image is  present");
		} else {
			System.out.println("Image is not present");
		}

		driver.close();

	}

	// @Test(priority=8)
	public void drag() {
		driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")).click();

		WebElement we = driver.findElement(By.xpath("//h3[@id='header']"));

		Actions act = new Actions(driver);
		act.dragAndDropBy(we, 100, 0);

		driver.close();

	}

	// @Test(priority=9)
	public void drop() {
		driver.findElement(By.xpath("//a[normalize-space()='AUI - 2']")).click();

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);

		act.clickAndHold(drag).moveToElement(drop).perform();

		driver.close();

	}

	// @Test(priority=10)
	public void sort() {
		driver.findElement(By.xpath("//a[normalize-space()='AUI - 3']")).click();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600);");

		WebElement we1 = driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[1]"));
		WebElement we2 = driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[2]"));
		WebElement we3 = driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[3]"));
		WebElement we4 = driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[4]"));

		Actions act = new Actions(driver);

		// act.dragAndDrop(we1,
		// driver.findElement(By.xpath("//div[@id='cdk-drop-list-15']//div[2]"))).perform();
		// driver.close();

		WebElement w1 = driver.findElement(By.xpath("(//div[@id='sample-box1'])[5]"));

		// act.clickAndHold(we1).moveToElement(w1).perform();

		// act.dragAndDrop(we1, w1).perform();

		Point p = w1.getLocation();
		// act.dragAndDropBy(we1, 500, 0).perform();

		act.dragAndDropBy(we1, p.getX(), p.getY()).perform();

	}

	// @Test(priority=11)
	public void multiSelect() {
		driver.findElement(By.xpath("//a[normalize-space()='AUI - 4']")).click();
		Actions act = new Actions(driver);

		List<WebElement> we = driver.findElements(By.xpath("//div[@id='container']/div"));

		act.keyDown(Keys.CONTROL).perform();

		for (WebElement w : we) {
			w.click();
		}
		act.keyUp(Keys.CONTROL).perform();

		driver.close();
	}

	// @Test(priority=12)
	public void Slider() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));

		driver.findElement(By.xpath("//a[normalize-space()='AUI - 5']")).click();

		WebElement slider = driver.findElement(By.xpath("//input[@id='generate']"));
		Actions act = new Actions(driver);

		int Enternumbertoslide = 10;
		act.dragAndDropBy(slider, Enternumbertoslide + 16, 0).perform();

		String s = driver.findElement(By.xpath("//div[@class='has-text-centered']/h1")).getText();
		System.out.println(s);

		char[] d = s.toCharArray();
		int d1 = s.length();

		String s1 = d[d.length - 2] + "" + d[d.length - 1];
		System.out.println(s1);

		int d7 = Integer.parseInt(s1);

		driver.findElement(By.xpath("//button[normalize-space()='Get Countries']")).click();

		WebElement wee = driver.findElement(By.xpath("//p[@class='has-text-primary-light']"));

		String f = wee.getText();

		String[] ssss = f.split("-");
		System.out.println(Arrays.toString(ssss));
		System.out.println("count" + ssss.length);

		Assert.assertEquals(ssss.length, d7);

		driver.close();

	}

	// @Test(priority = 13)
	public void table() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));

		driver.findElement(By.xpath("//a[normalize-space()='Simple table']")).click();

		String s = driver.findElement(By.xpath("(//tr)[3]/td[2]")).getText();
		int l = 0;

		for (int i = 2; i <= 5; i++) {
			String a = driver.findElement(By.xpath("(//tr)[" + i + "]/td[2]")).getText();
			l = l + Integer.parseInt(a);
		}

		System.out.println("Total is : " + l);

		String checkValue = driver.findElement(By.xpath("//body//app-root//tfoot//td[2]")).getText();

		// TC_2

		for (int i = 7; i <= 9; i++) {
			driver.findElement(By.xpath("(//tr)[" + i + "]/td[4]/input")).click();
		}

		// Tc_3
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js1.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//td[normalize-space()='yashwanth@letcode.in']")));

		driver.findElement(By.xpath(
				"(//div[@class='mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns-c30-1 ng-star-inserted'])[1]"))
				.click();
		int firstValue = 0;

		for (int i = 1; i <= 5; i++) {
			WebElement we = driver.findElement(By.xpath("//div[@class='card-conetnt']//tr[" + i + "]/td[2]"));

			String name = we.getText();

			int updatedValue = Integer.parseInt(name);

			if (firstValue < updatedValue) {
				System.out.println("Ok Bhaii");
			}
			firstValue = updatedValue;
		}

		driver.close();
	}

	// @Test(priority=14)
	public void calander() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));

		// driver.findElement(By.xpath("//a[normalize-space()='Date & Time']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Date & Time']")).click();

		LocalDateTime now = LocalDateTime.now();

		// Extract the day of the month
		int dayOfMonth = now.getDayOfMonth();
		// Print the day of the month
		System.out.println("Day of the month: " + dayOfMonth);

		// click on open the calander for this logo(>)
		driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']")).click();

		String month1 = driver
				.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-nav-month']"
						+ "[normalize-space()='October']"))
				.getText();

		String year1 = driver
				.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-nav-year']"
						+ "[normalize-space()='2023']"))
				.getText();

		if (month1.equals("October") && year1.equals("2023")) {
			driver.findElement(
					By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-date is-current-month']"
							+ "//button[@type='button'][normalize-space()='3']"))
					.click();
		}

		else {
			// for next month click
			WebElement nextMonthClick = driver.findElement(By.xpath("(//button[@type='button'])[43]"));

			while (month1.equals("October") && year1.equals("2023")) {
				nextMonthClick.click();
				String month = driver
						.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-nav-month']"
								+ "[normalize-space()='October']"))
						.getText();

				String year = driver
						.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-nav-year']"
								+ "[normalize-space()='2023']"))
						.getText();

				if (month.equals("October") && year.equals("2023")) {
					List<WebElement> ll = driver.findElements(
							By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-days']/div/button"));

					for (WebElement we : ll) {
						String getDateText = we.getText();
						if (getDateText.equals("3")) {
							we.click();
						}
					}
				}
			}
		}
		driver.close();

	}

	// @Test(priority=15)
	public void timeout() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));

		driver.findElement(By.xpath("//a[normalize-space()='Timeout']")).click();
		driver.findElement(By.xpath("//button[@id='accept']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

		driver.close();

	}

	// @Test(priority=16)
	public void forms() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));

		driver.findElement(By.xpath("//a[normalize-space()='All in One']")).click();

		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vrushbah");
		driver.findElement(By.xpath("//input[@id='lasttname']")).sendKeys("Ekhande");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vrehsd@gmail.com");

		List<WebElement> l = driver.findElements(By.xpath("(//select)[1]/option"));

		for (WebElement we : l) {
			String checkMe = we.getText();
			if (checkMe.equalsIgnoreCase("INDIA")) {
				we.click();
			}
		}

		driver.findElement(By.xpath("(//input[@id='Phno'])[1]")).sendKeys("7420909108");
		driver.findElement(By.xpath("//input[@id='Addl1']")).sendKeys("vrushabekahnde");

		driver.findElement(By.xpath("(//input[@id='Addl2'])[1]")).sendKeys("vrushabhkhande");

		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("maharashtra");

		driver.findElement(By.xpath("//input[@id='postalcode']")).sendKeys("413504");

		driver.findElement(By.xpath("//input[@id='Date']")).sendKeys("13-10-2023");
		System.out.println("Bugs in the date fucnctionality");

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.close();

	}
	
	
	@Test(priority =17)
	public void fileUpload()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[normalize-space()='AUI - 1']")));
		
		
		driver.findElement(By.xpath("//a[normalize-space()='File management']")).click();
		
		
		WebElement we =driver.findElement(By.xpath("//span[@class='file-label']"));
		we.click();
           we.sendKeys("C:\\Users\\Asus\\Desktop\\Bhaii Valnarabbilitied.txt");
		
	}
  
	 
}