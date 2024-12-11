package vibhaPlanitTest;

public class ElementLocators {

	// Test Case 1 and 2 Locators
	public String Contact = "nav-contact";
	public String Forename = "forename";
	public String email = "email";
	public String message = "message";
	public String Submit = "a[class='btn-contact btn btn-primary']";
	public String SucccessMessage = "div[class='alert alert-success']";
	public String ForenameErrorMessage = "forename-err";
	public String EmailErrorMessage = "email-err";
	public String MessageErrorMessage = "message-err";

//Test Case 3 Locators

	public String Shop = "nav-shop";
	public String FrogBuy = "li#product-2 > div > p > a.btn.btn-success";
	public String BunnyBuy = "li#product-4 > div > p > a.btn.btn-success";
	public String BearBuy = "li#product-7 > div > p > a.btn.btn-success";
	public String Cart = "nav-cart";
	public String FrogBuyQty = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/frog.jpg\"]) > td > input";
	public String BunnyBuyQty = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/bunny.jpg\"]) > td > input";
	public String BearBuyQty = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/valentine.jpg\"]) > td > input";
	public String FrogBuyPrice = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/frog.jpg\"]) >td:nth-child(2).ng-binding";
	public String BunnyBuyPrice = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/bunny.jpg\"]) >td:nth-child(2).ng-binding";
	public String BearBuyPrice = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/valentine.jpg\"]) >td:nth-child(2).ng-binding";
	public String FrogBuySubtotal = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/frog.jpg\"]) >td:nth-child(4).ng-binding";
	public String BunnyBuySubtotal = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/bunny.jpg\"]) >td:nth-child(4).ng-binding";
	public String BearBuySubtotal = "tr.cart-item:has(td > img[ng-src=\"images/src-embed/valentine.jpg\"]) >td:nth-child(4).ng-binding";
	public String Total = "tfoot > tr > td > strong.total";

}
