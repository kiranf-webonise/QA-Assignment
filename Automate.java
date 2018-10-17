package test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Automate {
		 public static void main(String []args) throws InterruptedException {
			 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");  
			 	LocalDateTime now = LocalDateTime.now();  
			 	System.out.println(dtf.format(now)); 
			 	String vr=dtf.format(now);
			 	String ab="ab";
			 	WebDriver driver;
				System.setProperty("webdriver.chrome.driver","/home/webonise/workspace/Automation Testing/resource/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://web-stg.gofaceoff.com");
			
				WebElement signup = driver.findElement(By.xpath("//a[@href='/signup']"));
				signup.click();
				
				WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys(ab.concat(vr).concat("@yahoo.com"));
				
				WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
				username.sendKeys("Abc".concat(vr));
				
				WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys("key4321098");
				
				WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("keyfartalek");
				
				WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
				lastname.sendKeys("fartalekeyf");
				
				WebElement dob = driver.findElement(By.xpath("//input[@name='dateOfBirth']"));
				dob.sendKeys("12/15/1991");
				
				WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
				Select dropdown = new Select(state);
				dropdown.selectByVisibleText("HI");
				
				WebElement refercode = driver.findElement(By.xpath("//input[@name='referralCode']"));
				refercode.sendKeys("ian");
				
				WebElement register = driver.findElement(By.xpath("//button[text()='Sign Up For Free']"));
				register.click();
				
				Thread.sleep(10000);
				WebElement skip = driver.findElement(By.xpath("//a[text()='Skip']"));
				skip.click();
				
				driver.findElement(By.xpath("//span[@class='dropDownIcon']")).click();
				
				driver.findElement(By.xpath("//a[text()='Log Out']")).click();
				
				Thread.sleep(7000);
				driver.quit();
			}
		}