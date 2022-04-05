package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFicticioTest
{
    @Test
    public void loginFicticioTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://pt-br.facebook.com/login/device-based/regular/login/");

        driver.findElement(By.id("email")).sendKeys("felipe.cabral@terra.com.br");

        driver.findElement(By.id("pass")).sendKeys("123456");

        driver.findElement(By.id("loginbutton")).click();

        Assert.assertEquals("O email que você inseriu não está conectado a uma conta.","O email que você inseriu não está conectado a uma conta.");

        driver.quit();
    }
}
