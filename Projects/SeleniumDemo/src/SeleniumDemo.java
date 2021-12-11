import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first selenium demo...");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://parent.neverskip.com/#/auth/login");
		cd.manage().window().maximize();
		
		cd.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("8220542854");
		
		cd.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-1"))); 
		
		cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("information");
		
		cd.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_aside_brand\"]")));
		//cd.findElement(By.xpath("//*[@id=\"kt_aside_brand\"]")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")));
		//cd.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")).click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_content\"]/kt-dashboard/db-announcement/div/div/div/div[2]/form/div[1]/div/div/div[3]/a")));
		cd.findElement(By.xpath("//*[@id=\"kt_content\"]/kt-dashboard/db-announcement/div/div/div/div[2]/form/div[1]/div/div/div[3]/a")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kt_content\"]/kt-live-classes/div/div/div[2]/div/kt-portlet/div/kt-portlet-body/div[1]/div[3]/a")));
		//cd.findElement(By.xpath("//*[@id=\"kt_content\"]/kt-live-classes/div/div/div[2]/div/kt-portlet/div/kt-portlet-body/div[1]/div[3]/a")).click();
		
		
		//cd.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Teffila Austin");
		//cd.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.RETURN);
		//Thread.sleep(5000);
		//cd.close();
	}

}
