package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class objreader {

	public static Properties readobj() {
		
		Properties prop= new Properties();
		
		
		try 
		{
		InputStream	fi= new FileInputStream("C:\\workspace2\\Hybrid_maven\\src\\main\\java\\obj.properties");
		prop.load(fi);
		}
		catch (Exception e) {
		
		}
		return prop;

	}

}
