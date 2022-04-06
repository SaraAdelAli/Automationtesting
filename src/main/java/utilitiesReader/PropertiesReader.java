package utilitiesReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
	String confiFile;
	Properties properties;

	public PropertiesReader(String confiFile) 
	{
		this.confiFile = confiFile;
		properties = new Properties();
	}
	public String getPropertyUsingKey(String key) 
	{
		InputStream stream = getClass().getClassLoader().getResourceAsStream(confiFile);
		try {
			properties.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key).trim();
		
	}
}

