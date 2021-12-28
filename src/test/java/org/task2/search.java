package org.task2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search extends BaseClass{
	public search() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox ;
	
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbutton ;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> mobiles;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	private List<WebElement> price;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public List<WebElement> getMobiles() {
		return mobiles;
	}

	public List<WebElement> getPrice() {
		return price;
	}

	


}
