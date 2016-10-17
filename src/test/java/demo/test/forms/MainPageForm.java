package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

public class MainPageForm extends BaseForm
{
    private Label lblMenuPoint = new Label(By.xpath("//a[contains(@href,'catalog')]"),"Catalog");

    public MainPageForm()
    {
        super(By.xpath("//input[@name='query']"), "Onliner.by");
    }

    public void clickOnLabel()
    {
        lblMenuPoint.click();
        browser.waitForPageToLoad();
    }
}
