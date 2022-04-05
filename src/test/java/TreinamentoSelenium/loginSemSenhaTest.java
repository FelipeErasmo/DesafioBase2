package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSemSenhaTest
{
    @Test
    public void loginSemSenhaTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://pt-br.facebook.com/login/device-based/regular/login/");

        driver.findElement(By.id("email")).sendKeys("felipe.neto@gmail.com");

        driver.findElement(By.id("pass")).sendKeys("");

        driver.findElement(By.id("loginbutton")).click();

        Assert.assertEquals("A senha inserida está incorreta.","A senha inserida está incorreta.");

        driver.quit();
    }
}
