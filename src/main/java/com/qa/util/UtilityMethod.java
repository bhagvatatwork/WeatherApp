package com.qa.util;

import com.qa.base.BaseTest;

public class UtilityMethod extends BaseTest {
	
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrame(String frameName){
		driver.switchTo().frame(frameName);
	}
}
