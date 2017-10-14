package com.crawljax.browser.app;

import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration;

public class MyAppCrawlJax {
	static{
		System.setProperty("webdriver.gecko.driver", "/Users/bowang/tools/geckodriver");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrawljaxRunner crawljax =
		        new CrawljaxRunner(CrawljaxConfiguration.builderFor("http://www.github.com/")
		                .build());
		crawljax.call();
	}

}
