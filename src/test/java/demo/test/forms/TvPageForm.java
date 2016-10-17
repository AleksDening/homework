package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

public class TvPageForm extends BaseForm
{
    public TvPageForm()
    {
        super(By.xpath("//h3[contains(text(),'Описание')]"), "TV page");
    }

    public void searchCorrectInfo(int pos)
    {
        System.out.println("Номер нужного ТВ: " + pos);
        System.out.println(browser.getDriver().findElement(By.xpath("//div[@class='product-header']//h2")).getText());
        System.out.println("Диапазон цен: " + browser.getDriver().findElement(By.xpath("//div[@class='b-offers-desc__info-sub']/a[1]")).getText());
        System.out.println("Год выпуска: " + browser.getDriver().findElement(By.xpath("//td[contains(text(),'Дата выхода')]//following-sibling::td/span")).getText());
        System.out.println("Диагональ экрана: " + browser.getDriver().findElement(By.xpath("//td[contains(text(),'Диагональ экрана')]//following-sibling::td/span")).getText());
        System.out.println("____________________");
    }
}
