package com.nbcuni.test.tl.practice.dataproviders;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class DataProviderHome extends BaseDataProvider{

	private static final String directory = "home";
	private static final String file = "home-content.json";
	private static final String RECENT_TV_ASSETS = "RECENT TV ASSETS";
	private static final String RECENT_FEATURE_ASSETS = "RECENT FEATURE ASSETS";
	private static final String RECENT_MOST_POPULAR = "RECENT FEATURE ASSETS";
	
	public DataProviderHome() {
		super(directory);		
	}


	@DataProvider(name="getRecentTitlesData")
	public String[] getRecentTitlesData(Method m) throws IOException, ParseException {

		JSONArray titlesArray = null;
		String filePath = rootPath + file;
		//System.out.println("getRecentTitlesData(): " + filePath);

		// create object of JSONParser class
		JSONParser jsonParser = new JSONParser();
		// load this file use FileReader class
		FileReader reader = new FileReader(filePath);
		// read and put data to java object
		Object obj = jsonParser.parse(reader);
		// convert java obj to json object
		JSONObject jsonobj = (JSONObject) obj;
		// extract json array from json object
		
		if (m.getName().equals("validateRecentTVTitles"))  
			titlesArray = (JSONArray) jsonobj.get(RECENT_TV_ASSETS);
		if (m.getName().equals("validateRecentFeatureTitles"))
			titlesArray = (JSONArray) jsonobj.get(RECENT_FEATURE_ASSETS);
		if (m.getName().equals("validateMostPopularTitles"))
			titlesArray = (JSONArray) jsonobj.get(RECENT_MOST_POPULAR);
	
		String arr[] = new String[titlesArray.size()];

		for (int i=0; i<titlesArray.size(); i++) {

			JSONObject line=(JSONObject) titlesArray.get(i);
			String title = (String) line.get("title");
			arr[i] = title;
			//System.out.println(arr[i]);
		}

		//System.out.println("End of getRecentTitlesData()");

		return arr;

	}

}

