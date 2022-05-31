package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties init_prop() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/org/config/Config.Properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
