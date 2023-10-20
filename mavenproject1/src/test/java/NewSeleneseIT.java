/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Usuario
 */
public class NewSeleneseIT {
    
    @Test
    public void testSimple() throws InterruptedException {
        //Abre una nueva instacia de Chrome
        ChromeDriver driver = new ChromeDriver();
        //Maximiza la ventana
        driver.manage().window().maximize();
        //Carga la página https://es.wikipedia.org/wiki/Wikipedia:Portada en el chrome
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        //Define una variable del tipo elemento web que se llama buscar enlazada con ID searchInput (el cuadro de búsqueda)
        WebElement buscar = driver.findElement(By.id("searchInput"));
        //A la variable le envía una cadena de texto
        buscar.sendKeys("Sega 32x");
        //Define una variable del tipo elemento web que se llama boton enlazada con el type button cuya clase es cdx-button cdx-search-input__end-button
        WebElement boton = driver.findElement(By.cssSelector("button[class=\"cdx-button cdx-search-input__end-button\"]"));
        //Hace click en el elemento boton, produciendo la búsqueda de lo escrito en el text box
        boton.click();

//        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
//        WebElement searchInput = driver.findElement(By.id("searchInput"));
//        searchInput.sendKeys("Sega 32X");
//        WebElement submitBtn = driver.findElement(By.cssSelector("button[class=\"cdx-button cdx-search-input__end-button\"]"));
//        submitBtn.click();
//        WebElement imgSrc = driver.findElement(By.cssSelector("img[src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Sega-Genesis-Model2-32X.png/250px-Sega-Genesis-Model2-32X.png\"]"));
//        imgSrc.click();
        driver.close();
        
    }
}
