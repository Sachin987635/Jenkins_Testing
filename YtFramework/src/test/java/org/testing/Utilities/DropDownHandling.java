package org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	public void SelectDropDownwithIndex(WebElement element,int indexnumber) {
		Select selectval=new Select(element);
		selectval.selectByIndex(indexnumber);
	}
	public void SelectDropDownwithVisibleText(WebElement element,String VisibleText) {
		Select selectval=new Select(element);
		selectval.selectByVisibleText(VisibleText);
	}
	public void SelectDropDownwithValue(WebElement element,String Value) {
		Select selectval=new Select(element);
		selectval.selectByValue(Value);
	}
}
