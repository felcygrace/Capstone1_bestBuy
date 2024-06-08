package configuration;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reader {

	public static Properties pro;

	public Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\FELCY\\eclipse-workspace\\mavenproject\\src\\test\\java\\configuration\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
	}

	public String get_Browser() {
		String browser = pro.getProperty("browser");
		return browser;
	}

	public String get_Url() {
		String url = pro.getProperty("url");
		return url;

	}

	public String enter_FirstName() {
		String url = pro.getProperty("firstName");
		return url;

	}

}