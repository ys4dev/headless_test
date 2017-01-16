package sample;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 *
 */
public class Sample {
    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "/opt/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
//        Configuration.browser = WebDriverRunner.CHROME;

        Configuration.reportsFolder = "test-result/reports";
        Configuration.chromeSwitches = "--no-sandbox --disable-gpu";
    }

    @Test
    public void selenideTest() throws Exception {
        open("http://www.yahoo.co.jp/");
        $("#srchtxt").val("selenide");
        $("#srchbtn").click();

        $("body").shouldHave(text("Selenide: concise UI tests in Java"));
        screenshot("test.png");
    }
}
