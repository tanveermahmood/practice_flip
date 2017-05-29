package com.flipkartwebmobileapp.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlipkartsubcategorylistTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "flipcatrsubcategory.link.subcategory")
	private QAFWebElement flipcatrsubcategoryLinkSubcategory;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFlipcatrsubcategoryLinkSubcategory() {
		return flipcatrsubcategoryLinkSubcategory;
	}

}
