package net.jisr.overview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class jisrPagelogin implements ILoging{
	
	@FindBy (name = NameUser_name)
	private WebElement User_name;
	@FindBy (name = NamePassword)
	private WebElement Password;
	
}
