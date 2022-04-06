package utilities;

import utilitiesReader.PropertiesReader;

public class ConfiUnit {
	public static String browser;
	public static String Web_URL;
	
	public static void loadTestConfigurations()
	{
		PropertiesReader reader = new PropertiesReader("config.properties");
		browser= reader.getPropertyUsingKey("browser");
		Web_URL= reader.getPropertyUsingKey("Web_URL");
		
	}

}
