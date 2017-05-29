package com.flipkartwebmobileapp.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlipkartcategorylistTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "flipkartcategoryList.link.category")
	private QAFWebElement flipkartcategoryListLinkCategory;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFlipkartcategoryListLinkCategory() {
		return flipkartcategoryListLinkCategory;
	}

}
