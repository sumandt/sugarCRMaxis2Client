

package com.sugarcrm.www.sugarcrm;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import org.apache.axis.AxisFault;

import com.sugarcrm.www.sugarcrm.Entry_value;
import com.sugarcrm.www.sugarcrm.Get_entry_result_version2;
import com.sugarcrm.www.sugarcrm.Link_name_to_fields_array;
import com.sugarcrm.www.sugarcrm.Name_value;
import com.sugarcrm.www.sugarcrm.New_set_entry_result;
import com.sugarcrm.www.sugarcrm.SugarsoapBindingStub;
import com.sugarcrm.www.sugarcrm.SugarsoapLocator;
import com.sugarcrm.www.sugarcrm.User_auth;


public class SugarCRMSoapClient {
	private static final String END_POINT_URL = "http://localhost/sugarcrm/service/v3/soap.php?wsdl";
	private static final String USER_NAME = "admin";
	private static final String USER_PASSWORD = "admin";
	private static final String APPLICATION_NAME = Class.class.getName();
	private static final Integer TIMEOUT = 6000;


	
	public static void main(String[] args) throws Exception {
		String sessionID = null;
		
		try {
			// Create a URL end point for the client
			URL wsdlUrl = null;
			if (END_POINT_URL.isEmpty()) {
				wsdlUrl = new URL(
						new SugarsoapLocator().getsugarsoapPortAddress()
								+ "?wsdl");
			} else {
				wsdlUrl = new URL(END_POINT_URL);
			}

			System.out.println("URL endpoint created successfully!");

			// Create Service for test configuration
			ServiceFactory serviceFactory = ServiceFactory.newInstance();
			Service service = serviceFactory.createService(wsdlUrl,
					new SugarsoapLocator().getServiceName());

			System.out.println("Service created successfully");
			System.out.println("Service Name:"
					+ service.getServiceName().toString());
			System.out.println("Service WSDL:"
					+ service.getWSDLDocumentLocation().toString());

			// Trying to create a stub
			SugarsoapBindingStub binding = new SugarsoapBindingStub(wsdlUrl,
					service);
			binding.setTimeout(TIMEOUT);
			System.out.println("Stub created successfully!");

			

			// 1. Prepare a MD5 hash password
			MessageDigest messageDiget = MessageDigest.getInstance("MD5");
			messageDiget.update(USER_PASSWORD.getBytes());

			// 2. Prepare a User Auth object
			User_auth userAuthInfo = new User_auth();
			userAuthInfo.setUser_name(USER_NAME);
			userAuthInfo.setPassword((new BigInteger(1, messageDiget.digest()))
					.toString(16));

			try {
				// 3. Execute login
				Entry_value loginResult = binding.login(userAuthInfo,
						APPLICATION_NAME, null);
				System.out.println("Login Successfully for " + USER_NAME);
				System.out.println("Your session Id: " + loginResult.getId());
				sessionID = loginResult.getId();
			} catch (RemoteException ex) {
				System.out.println("Login failed. Message: " + ex.getMessage());
				ex.printStackTrace();
			}

			
			
			
			
			
			HashMap<String, String> nameValueMap = new HashMap<String, String>();
			nameValueMap.put("first_name", "sujan");
			nameValueMap.put("last_name", "Chary");
			nameValueMap.put("title", "Software Developer");
			nameValueMap.put("description","Contatto creato dal Client SOAP Java");
			nameValueMap.put("email1", "sujan.krishna@gmail.com");
			nameValueMap.put("mobile", "9865789589");
			nameValueMap.put("department", "JAVA");
			

			// Creating a new Name_value array and adding each map entry as 'name' and 'value'
			Name_value nameValueListSetEntry[] = new Name_value[nameValueMap.size()];
			int i = 0;
			for (Entry<String, String> entry : nameValueMap.entrySet()) {
				Name_value nameValue = new Name_value();
				nameValue.setName(entry.getKey());
				nameValue.setValue(entry.getValue());
				nameValueListSetEntry[i] = nameValue;
				i++;
			}
			
			// Trying to set a new entry
			New_set_entry_result setEntryResponse = null;
			try {
				setEntryResponse = binding.set_entry(sessionID, "Contacts", nameValueListSetEntry);
			} catch (RemoteException e) {
				System.out.println("Set entry failed. Message: "
						+ e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Set entry was successful! Contacts Id: "
					+ setEntryResponse.getId());

			
			/**
			 * Getting an Contacts Entry (the one we just set)
			 */
			Link_name_to_fields_array[] link_name_to_fields_array = null;
			String[] select_fields = null;

			Get_entry_result_version2 getEntryResponse = null;
			
			// Trying to get entry
			try {
				getEntryResponse = binding.get_entry(sessionID,"Contacts", setEntryResponse.getId(), select_fields , link_name_to_fields_array);
			} catch (RemoteException e) {
				System.out.println("Get entry failed. Message: " + e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Get entry was successful! Response: ");

			// Getting the fields for entry we got.
			Entry_value[] entryList = getEntryResponse.getEntry_list();
			for (int k=0; k < entryList.length; k++){
				Entry_value entry = entryList[k];
				Name_value[] entryNameValueList = entry.getName_value_list();
				for (int j=0; j< entryNameValueList.length; j++){
					Name_value entryNameValue = entryNameValueList[j];
					//Outputting only non empty fields
					if (!entryNameValue.getValue().isEmpty()){
						System.out.println("Attribute Name: '" + entryNameValue.getName() + "' Attribute Value: '" + entryNameValue.getValue() + "'");
					}
				}
			}
			
			/**
			 * Logout
			 */
			try {
				binding.logout(sessionID);
				System.out.println("Logout Successfully for " + USER_NAME);
				sessionID = null;
			} catch (RemoteException ex) {
				System.out.println("Login failed. Message: " + ex.getMessage());
				ex.printStackTrace();
			}
			
		} catch (MalformedURLException ex) {
			System.out.println("URL endpoing creation failed. Message: "
					+ ex.getMessage());
			ex.printStackTrace();
		} catch (ServiceException ex) {
			System.out.println("Service creation failed. Message: "
					+ ex.getMessage());
			ex.printStackTrace();
		} catch (AxisFault ex) {
			System.out.println("AxisFault. Message: " + ex.getMessage());
			ex.printStackTrace();
		}
		}
	
}