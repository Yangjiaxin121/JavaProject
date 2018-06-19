package JavaAPI;

import java.util.*;

public class Example09 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Enumeration propertyNames = properties.propertyNames();
		while(propertyNames.hasMoreElements()) {
			String key = (String) propertyNames.nextElement();
			String values = System.getProperty(key);
			System.out.println(key+"--->"+values);
		}
	}

}
