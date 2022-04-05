package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pesquisaMercadoriaCorretaTest
{
    @Test
    public void pesquisaMercadoriaCorretaTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.mercadolivre.com.br/");

        driver.findElement(By.name("as_word")).sendKeys("televisao");

        driver.findElement(By.className("nav-icon-search")).click();

        Assert.assertEquals("Televisao","Televisao");

        driver.quit();
    }
}