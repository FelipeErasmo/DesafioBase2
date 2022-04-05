package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class criarContaSemTodosDadosTest
{
    @Test
    public void criarContaSemTodosDadosTest() {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://pt-br.facebook.com/r.php?locale=pt_BR&display=page");

        driver.findElement(By.name("firstname")).sendKeys("Fulano");

        driver.findElement(By.name("lastname")).sendKeys("Oliveira");

        driver.findElement(By.name("reg_email__")).sendKeys("fulano.oliveira@terra.com.br");

        driver.findElement(By.name("websubmit")).click();

        String erro = driver.findElement(By.name("reg_email_confirmation__")).getText();

        Assert.assertEquals("Insira o email novamente",erro);

    }
}
