package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.*;

public class ResultPageForm extends BaseForm
{
    private CheckBox chbType = new CheckBox(By.xpath("//input[@value='samsung']/following-sibling::span"), "Type");
    private TextBox tbPrice = new TextBox(By.xpath("//input[@placeholder='до']"), "Price");
    private TextBox tbYear = new TextBox(By.xpath("//input[@placeholder='2010']"), "Year");
    private ComboBox sMinSize = new ComboBox(By.xpath("//select[contains(@data-bind,'from')]"), "Min_size");
    private ComboBox sMaxSize = new ComboBox(By.xpath("//select[contains(@data-bind,'to')]"), "Max_size");

    public ResultPageForm()
    {
        super(By.xpath("//div/h1[.='Телевизоры']"), "TV result");
    }

    public void setParam() throws InterruptedException
    {
        chbType.click();
        tbPrice.setText("1000");
        tbYear.setText("2013");
        sMinSize.setValue("39\"");
        sMaxSize.setValue("42\"");
        Thread.currentThread().sleep(10000) ;
    }

    public void analysisSearchResults() throws InterruptedException
    {
        int ALL=((browser.getDriver().findElements(By.xpath("//*[@id='schema-products']//span[contains(text(),'Samsung')]")))).size();
        int pos=0;
        for (int i=0; i<ALL;i++,pos++)
        {
            if (pos==2) {pos++;}
            Label lblCheck = new Label(By.xpath("//*[@id='schema-products']/div[" +(pos+1)+ "]//span[contains(text(),'Samsung')]"), "TV");
            lblCheck.click();
            browser.waitForPageToLoad();
            TvPageForm tpf=new TvPageForm();
            tpf.searchCorrectInfo(i+1);
            browser.getDriver().navigate().back();
            browser.waitForPageToLoad();
        }
    }
}
