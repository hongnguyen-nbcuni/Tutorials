package com.sample.test.demo.dataproviders;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import com.sample.test.demo.pageobject.PersonInfo;

public class DataProviderOrderForm extends BaseDataProvider{

	private static final String directory = "./src/test/resources/data/";
	private static final String file = "pizzaOrderFormFields.json";
	private static final String TITLE = "pizzaOrderFormTitle";
	private static final String ORDER_INFO = "orderInfo";
	private static final String PICKUP_INFO = "pickupInfo";
	private static final String PAYMENT_INFO = "paymentInfo";
	private static final String PLACE_ORDER_BUTTON = "PlaceOrderButton";
	private static final String RESET_BUTTON = "ResetButton";
	private static final String QUALITY_VALUES = "Quantities";
	private static final String NAME_VALUES = "Names";
	private static final String EMAIL_VALUES = "Emails";
	private static final String PHONE_VALUES = "Phones";
	private static final String PLACE_ORDER_VALUES = "PlaceOrder_values";

	@DataProvider(name="getExpectedTextLabels")
	public String[] getExpectedLabelsData(Method m) throws IOException, ParseException {

		JSONArray expectedlabelsArray = null;
		String filePath = directory + file;
		String getString = "label";
		
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

		if (m.getName().equals("validatePizzaOrderFormTitleTest"))  
			expectedlabelsArray = (JSONArray) jsonobj.get(TITLE);
		//expectedlabelsArray  = (JSONArray) jsonobj.get(ORDER_INFO);
		if (m.getName().equals("validateOrderInfoLabelsTest"))
			expectedlabelsArray  = (JSONArray) jsonobj.get(ORDER_INFO);
		if (m.getName().equals("validatePickupInfoLabelsTest"))
			expectedlabelsArray = (JSONArray) jsonobj.get(PICKUP_INFO);
		if (m.getName().equals("validatePaymentInfoLabelTest"))
			expectedlabelsArray = (JSONArray) jsonobj.get(PAYMENT_INFO);
		if (m.getName().equals("validatePlaceOrderButtonLabelTest"))
			expectedlabelsArray = (JSONArray) jsonobj.get(PLACE_ORDER_BUTTON);
		if (m.getName().equals("validateResetButtonLabelTest"))
			expectedlabelsArray = (JSONArray) jsonobj.get(RESET_BUTTON);
	
		
		String arr[] = new String[expectedlabelsArray.size()];
		//String label;
		
		for (int i=0; i<expectedlabelsArray.size(); i++) {

			JSONObject line=(JSONObject) expectedlabelsArray.get(i);

			arr[i] = (String) line.get(getString);

		}

		//System.out.println("End of getRecentTitlesData()");

		return arr;

	}
	
	
	@DataProvider(name="getInputsData")
	public String[] getInputsData(Method m) throws IOException, ParseException {

		JSONArray expectedlabelsArray = null;
		String filePath = directory + file;
		String getValue = "value";
		
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

		if (m.getName().equals("totalCostTestField")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(QUALITY_VALUES);
		}
		else if (m.getName().equals("quantityInputValueTest")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(QUALITY_VALUES);
		}
		else if (m.getName().equals("nameTest")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(NAME_VALUES);
		}
		else if (m.getName().equals("emailTest")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(EMAIL_VALUES);
		}
		else if (m.getName().equals("phoneTest")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(PHONE_VALUES);
		}
		
		
		String arr[] = new String[expectedlabelsArray.size()];
		//String label;

		for (int i=0; i<expectedlabelsArray.size(); i++) {

			JSONObject line=(JSONObject) expectedlabelsArray.get(i);

			arr[i] = (String) line.get(getValue);

		}

		//System.out.println("End of getRecentTitlesData()");

		return arr;

	}
	
	@DataProvider(name="getPlaceOrderInputsData")
	public PersonInfo[] getPlaceOrderData(Method m) throws IOException, ParseException {

		JSONArray expectedlabelsArray = null;
		String filePath = directory + file;
		//String getValue = "value";
		
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

		if (m.getName().equals("placeOrderTotalCostModalTest")) {
			expectedlabelsArray = (JSONArray) jsonobj.get(PLACE_ORDER_VALUES);
		}
			
		//String arr[] = new String[expectedlabelsArray.size()];
		//String label;

		//PersonInfo person = new PersonInfo();
		
		PersonInfo arr[] = new PersonInfo[expectedlabelsArray.size()];
		
		// System.out.println("size: " + expectedlabelsArray.size());
			
		for (int i=0; i<expectedlabelsArray.size(); i++) {

			JSONObject line=(JSONObject) expectedlabelsArray.get(i);

			//arr[i] = (String) line.get(getValue);
		
			PersonInfo person = new PersonInfo();
			
			person.setName((String) line.get("Name"));
			person.setEmail((String) line.get("Email"));
			person.setPhone((String) line.get("Phone"));
			person.setPizza((String) line.get("Pizza"));
			person.setQuantity(Integer.parseInt((String) line.get("Quantity")));
			person.setPayment((String) line.get("Payment"));
			
			arr[i] = person;
			

		}
		
		//for (int i=0; i<arr.length; i++) {
			//System.out.println("data : " + arr[i].getName());
		//}

		//System.out.println("End of getRecentTitlesData()");

		return arr;
		
		

	}

}

