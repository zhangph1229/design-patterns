package cn.edu.neu.zhangph.createpattern.singleton;

import java.io.IOException;
import java.util.Properties;

public class MyProperty {
	private MyProperty(){}
	private static final Properties props = new Properties();
	static{
		try {
			props.load(Object.class.getClassLoader().getResourceAsStream("singleton.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getProperty(String key){
		return props.getProperty(key);
	}
}
