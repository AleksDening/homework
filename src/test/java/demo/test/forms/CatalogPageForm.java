package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

public class CatalogPageForm extends BaseForm
{
    private Label lblMenuPoint = new Label(By.xpath("//a[contains(@href,'by/tv')]"),"Catalog");

    public CatalogPageForm()
    {
        super(By.xpath("//input[@name='query']"), "Catalog page");
    }

    public void clickOnLabel()
    {
        lblMenuPoint.click();
        browser.waitForPageToLoad();
    }
}