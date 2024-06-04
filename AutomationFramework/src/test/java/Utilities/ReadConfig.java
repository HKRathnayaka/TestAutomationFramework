package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}

	}

	public String getChromePath() {
		String ch = pro.getProperty("chromePath");
		return ch;
	}

	public String getFirefoxPath() {
		String ff = pro.getProperty("firefoxPath");
		return ff;
	}
	
	public String getUrl() {
		String url = pro.getProperty("Url");
		return url;
	}

	public String getEmail() {
		String email = pro.getProperty("email");
		return email;
	}

	public String getPassword() {
		String un = pro.getProperty("password");
		return un;
	}
	
	public String getExcelName() {
		String excel = pro.getProperty("excelName");
		return excel;
	}
	
	public String getSheetName() {
		String sheet = pro.getProperty("sheetName");
		return sheet;
	}

}