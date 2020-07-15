package com.nci.automation.local.utils;

import com.nci.automation.pages.ITrustLoginPage;
import com.nci.automation.steps.impl.ITrustLoginPageImpl;

public class PageCache {

	private static ThreadLocal<PageCache> pageCache = new ThreadLocal<PageCache>();

	private PageCache() {
		// Private Constructor
	}

	public synchronized static PageCache getInstance() {
		if (pageCache.get() == null) {
			pageCache.set(new PageCache());
		}
		return pageCache.get();
	}

	// private pages variables
	private ITrustLoginPageImpl loginPageImpl;


	// private Pages variable if any
	private ITrustLoginPage iTrustLoginPage;


	// add implementation class object bellow
	public ITrustLoginPageImpl getITrustLoginPageImpl() {
		if (loginPageImpl == null)
			loginPageImpl = new ITrustLoginPageImpl();
		return loginPageImpl;
	}



	// Pages Object below
	public ITrustLoginPage getITrustLoginPage() {
		if (iTrustLoginPage == null)
			iTrustLoginPage = new ITrustLoginPage();
		return iTrustLoginPage;
	}


	
	

	
	/**
	 * This method will destroy any object that was created.
	 */
	public void destroyInstances() {
		
		if (loginPageImpl != null)
			loginPageImpl = null;

		

		if (iTrustLoginPage != null)
			iTrustLoginPage = null;

	
	}
}
