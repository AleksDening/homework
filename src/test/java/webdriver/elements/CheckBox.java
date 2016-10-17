package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Class, Describing element CheckBox
 */
public class CheckBox extends BaseElement
{
    /**
     *
     * @param locator
     * @param name
     */
    public CheckBox(final By locator, final String name)
    {
        super(locator, name);
    }

    public CheckBox(String string, String name)
    {
        super(string, name);
    }


    protected String getElementType()
    {
        return getLoc("loc.checkbox");
    }

    public boolean isEnabled()
    {
        return this.getElement().isEnabled();
    }

    public CheckBox(By locator)
    {
        super(locator);
    }

}
