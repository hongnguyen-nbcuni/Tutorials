package com.nbcuni.test.tl.practice.dataproviders;

public class BaseDataProvider {
	protected String rootPath = "./src/test/resources/data/";
	
	public BaseDataProvider(String directory) {
		rootPath = rootPath + directory + "/";
	}

}
