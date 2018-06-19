package jihelei;

import java.util.Enumeration;
import java.util.Properties;

public class Example22 {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("background-color", "red");
		p.setProperty("Front_size", "14px");
		p.setProperty("Language", "chinese");
		Enumeration names = p.propertyNames();
		while(names.hasMoreElements()) {
			String key = (String) names.nextElement();
			String value = p.getProperty(key);
			System.out.println(key+"="+value);
		}
	}

}
