import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proba {

	public static void main(String[] args) throws InterruptedException {
//		1.Zadatak
//		Ucitava stranicu https://demoqa.com/login
//		Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//		Zatim ceka 5sekundi da se korisnik uloguje
//		Proverava da li se korisnik ulogovao, 
//		tako sto se proverava postojanje dugmeta Logout. Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//		Klikce na dugme za logout
//		Gasi google chrome 
		System.setProperty("webdriver.chrome.driver",  
                "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		WebElement username = driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		WebElement loginButton = driver.findElement(By.id("login"));
		username.sendKeys("itbootcamp");
		password.sendKeys("ITBootcamp2021!");
		loginButton.click();
		Thread.sleep(5000);
//		List<WebElement> lista = driver.findElements(By.id("submit"));
		boolean ulogovaoSe = true;
//		if(lista.size() > 0) {
//			System.out.println("Korisnik se ulogovao");
//			WebElement logoutButton = driver.findElement(By.id("submit"));
//			logoutButton.click();
//		}
//		else {
//			System.out.println("Korisnik se nije ulogovao");
//		}
		try {
			WebElement logoutButton = driver.findElement(By.id("submit"));
		}
		catch(Exception e){
			ulogovaoSe = false;
		}
		if(ulogovaoSe = true) {
			System.out.println("Korisnik se ulogovao");
			driver.findElement(By.id("submit")).click();
		}
		else {
			System.out.println("Korisnik se nije ulogovao");
		}
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
