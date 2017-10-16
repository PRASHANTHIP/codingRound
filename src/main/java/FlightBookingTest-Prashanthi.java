package flight;

import java.util.List;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import org.w3c.dom.stylesheets.LinkStyle;

public class bookingtest<WebElement> {


    @Test
    public void testThatResultsAppearForAOneWayJourney() {
    	FirefoxDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
        driver.get("https://www.cleartrip.com/");
        wait(2000);
        Object By;
		driver.findElement(By.id(//input class="placeAutocomplete")).click();

        driver.findElement(By.id(//input class="placeAutocomplete")).clear();
        driver.findElement(((Object) By).id(//input name="from"")).sendKeys("Bungler");

        //wait for the auto complete options to appear for the origin
         
        Object a;
		List<WebElement> originOptions = driver.findElement(By.id("<strong>")).findElements(By.tagName(a));
System.out.println("Number of originOptions "+originOptions.size() );
		
		WebElement box = originOptions.get(0);
		List<WebElement> originOptions1 = originOptions1.findElements(By.tagName(a));
		List<WebElement> links;
		System.out.println("Total links are -- "+links.size());
		
		for(int i=1 ; i<links.size();i++){
		
		originOptions1.get(i);

        driver.findElement(By.xpath(//input placeholder="Any worldwide city")).clear();
        driver.findElement(By.id(//input placeholder="Any worldwide city")).sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        wait(2000);
        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName(a));
        destinationOptions.get(0).click();

        driver.findElement(By.xpath(//input id="dp1510715957884")).click();

        //all fields filled in. Now click on search
        driver.findElement(By.xpath(//input id="submit_search_form")).click();

        wait(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));

        //close the browser
        driver.quit();

    }


    private void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    private <By> boolean isElementPresent(By by) {
        try {
            Object driver;
			driver.findelement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }
}


}
