package com.sample.test.demo.dataproviders;

public class BaseDataProvider {
	protected String rootPath = "./src/test/resources/data/";
	
	public BaseDataProvider() {
		rootPath = rootPath + "/";
	}

}
