package com.library.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JDBCProperties {
	public static String getValue(String key){
		String value = null;
		//针对配置文件，java提供的类
		Properties p = new Properties();	
		//获取项目的根路径
		String path = JDBCProperties.class.getResource("/").getPath();
		try {
			p.load(new FileInputStream(new File(path,"db.properties")));
			//p表示配置文件根据key取value
			value = p.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
