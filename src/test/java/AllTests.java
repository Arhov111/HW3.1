import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTests {

        public static WebDriver webDriver;
        @BeforeClass
        public static void initWebDriver() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
        }

        @Test
        public void clickTest(){
            webDriver.get("http://soccerstand.com");
            webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/a[2]")).click();
            Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.soccerstand.com/tennis/", "https://www.soccerstand.com/tennis/");

        }

        @Test
        public void DidLanguageChangeTest(){
            webDriver.get("http://soccerstand.com");
            webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/a[3]")).click();
            Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.soccerstand.com/ru/", "https://www.soccerstand.com/ru/");
        }


        @Test
        public void goToBasketballTest(){
            webDriver.get("http://soccerstand.com");
            webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/a[3]")).click();
            Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.soccerstand.com/basketball/", "https://www.soccerstand.com/basketball/");
        }

        @Test
        public void atpFrenchOpenTest(){
            webDriver.get("https://www.soccerstand.com/tennis/");
            webDriver.findElement(By.xpath("//*[@id=\"my-leagues-list\"]/div[2]/a")).click();
            Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.soccerstand.com/tennis/atp-singles/french-open/", "https://www.soccerstand.com/tennis/atp-singles/french-open/");
        }


    }




