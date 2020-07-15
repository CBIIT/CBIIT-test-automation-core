package com.nci.automation.local.utils;

import com.nci.automation.pages.ITrustLoginPage;
import com.nci.automation.steps.impl.ITrustLoginPageImpl;

/**
 * This an initializer class which will initialize all pages classes.
 * Once pages class created, create an object it here inside the constructor
 */
public class PageInitializer { 

	// declare protected static variables of types of all the pages
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;

	
	
	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		 loginImpl=new ITrustLoginPageImpl();
	
	}
	
	
	
}
