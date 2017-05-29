package com.flipkartwebmobileapp.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlipkartproductlistTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "flipkartproductlist.list.parent")
	private QAFWebElement flipkartproductlistListParent;
	@FindBy(locator = "flipkartproduct.text.productname")
	private QAFWebElement flipkartproductTextProductname;
	@FindBy(locator = "flipkartproduct.text.productprice")
	private QAFWebElement flipkartproductTextProductprice;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFlipkartproductlistListParent() {
		return flipkartproductlistListParent;
	}

	public QAFWebElement getFlipkartproductTextProductname() {
		return flipkartproductTextProductname;
	}

	public QAFWebElement getFlipkartproductTextProductprice() {
		return flipkartproductTextProductprice;
	}

}
