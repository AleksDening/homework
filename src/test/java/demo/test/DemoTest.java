package demo.test;

import demo.test.forms.*;
import webdriver.BaseTest;

public class DemoTest extends BaseTest
{
	public void runTest() throws InterruptedException
	{
		logger.step(1);
		MainPageForm mpf = new MainPageForm();
		mpf.clickOnLabel();

		logger.step(2);
		CatalogPageForm cpf = new CatalogPageForm();
		cpf.clickOnLabel();

		logger.step(3);
		ResultPageForm rpf=new ResultPageForm();
		rpf.setParam();

		logger.step(4);
		rpf.analysisSearchResults();
	}
}
