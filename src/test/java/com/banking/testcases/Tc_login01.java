package com.banking.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobjects.*;

public class Tc_login01 extends BaseClass {
	@Test
	public void Logintest() {
		driver.get(baseURL);
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UserName);
		lp.setPassword(pwd);
		lp.clickSubmit();
		
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
	}

}
