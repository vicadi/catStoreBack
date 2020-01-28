package com.catstore.servicestore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsTemp {
	
	public static final void printObject(Object object, String title) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("--------------OBJECT " + title + "-----------------");
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
