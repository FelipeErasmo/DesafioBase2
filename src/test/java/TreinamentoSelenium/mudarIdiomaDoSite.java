package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mudarIdiomaDoSite
{
    @Test
    public void criarContaSemTodosDadosTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://pt-br.facebook.com");

        driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[2]/a")).click();

        Assert.assertEquals("Connect with friends and the world around you on Facebook.","Connect with friends and the world around you on Facebook.");

        driver.quit();
    }
}