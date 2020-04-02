package tm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass1()  {
	try {
	prop=new Properties();
	FileInputStream ip=new FileInputStream("C:\\Users\\surbh\\eclipse-workspace\\travelmedicare\\src\\main\\java\\tm\\qa\\properties\\Config.properties");
	prop.load(ip);
	}
	catch(FileNotFoundException e){
	e.printStackTrace();
	}
	catch(IOException e){
	e.printStackTrace();
	}}
	
	public static void initialization() {
	String browsername=prop.getProperty("browser");
	if (browsername.equals("chrome")){
	System.setProperty("webdrive.chrome.driver","C:/Users/surbh/Downloads/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	else if (browsername.equals("firefox")){
	System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\surbh\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
		
	}
	
	
	

}}
