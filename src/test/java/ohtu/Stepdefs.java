package ohtu;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Stepdefs {

    WebDriver driver;

    public Stepdefs() {
        File file;
        if (System.getProperty("os.name").matches("Mac OS X")) {
            file = new File("lib/macgeckodriver");
        } else {
            file = new File("lib/geckodriver");
        }
        String absolutePath = file.getAbsolutePath();
        System.setProperty("webdriver.gecko.driver", absolutePath);

        this.driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    //
    @Given("^user is at vinkki page$")
    public void user_is_at_vinkki_page() throws Throwable {
        driver.get("http://localhost:" + 8080 + "/");
        WebElement element = driver.findElement(By.name("salasana"));
        element.submit();
        Thread.sleep(1000);
    }

    //
    @When("^user inputs \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" for new kirjavinkki and submits information")
    public void user_inputs_kirjoittaja_otsikko_tyyppi_and_kommentti__for_new_kirjavinkki_and_submits_information(String kirjoittaja, String otsikko,
                                                                                                                  String tyyppi, String kommentti) throws Throwable {
        Thread.sleep(500);
        addKirjavinkkiWithInformation(kirjoittaja, otsikko, tyyppi, kommentti);
        Thread.sleep(500);
    }

    @When("^user clicks on Poista-nappula on a previously saved book$")
    public void user_clicks_on_poista_nappula_on_previously_saved_book() throws Throwable {
//        WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[5]/form/input"));
        WebElement element = driver.findElement(By.xpath("//input[@value='Poista']"));
        element.click();
    }

    //
    @Then("^new kirjavinkki with \"([^\"]*)\" and \"([^\"]*)\" is shown$")
    public void is_shown(String otsikko, String kirjoittaja) throws Throwable {
        assertTrue(driver.findElement(By.tagName("body"))
                .getText().contains(kirjoittaja));

        assertTrue(driver.findElement(By.tagName("body"))
                .getText().contains(otsikko));
    }

    @Then("^previously saved book with author \"([^\"]*)\" and comment \"([^\"]*)\" is deleted and not available on vinkki page")
    public void previously_saved_book_with_author_and_comment_is_deleted_and_not_availabe_on_vinkki_page(String kirjoittaja, String kommentti) throws Throwable {
        driver.navigate().refresh();
        assertFalse(driver.findElement(By.tagName("body")).getText().contains(kirjoittaja));
        assertFalse(driver.findElement(By.tagName("body")).getText().contains(kommentti));
    }

    private void clickLinkWithText(String text) {
        int trials = 0;
        while (trials++ < 5) {
            try {
                WebElement element = driver.findElement(By.linkText(text));
                element.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

    private void addKirjavinkkiWithInformation(String kirjoittaja, String otsikko, String tyyppi, String kommentti) {

        WebElement element = driver.findElement(By.name("kirjoittaja"));
        element.sendKeys(kirjoittaja);

        element = driver.findElement(By.name("otsikko"));
        element.sendKeys(otsikko);

        element = driver.findElement(By.name("tyyppi"));
        element.sendKeys(tyyppi);

        element = driver.findElement(By.name("kommentti"));
        element.sendKeys(kommentti);

        element.submit();
    }

}
