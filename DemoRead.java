import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Property Demo
public class DemoRead
{
	public static void main(String[] args) throws IOException
	{

		String csvFile = System.getProperty("user.dir");
		csvFile = csvFile + "\\src\\abcd.properties";
		Properties p = new Properties();
		FileInputStream fs = new FileInputStream(csvFile);
		p.load(fs);
		String value = p.getProperty("user");
		System.out.println(value);
		
		p.setProperty("db.url", "localhsot");
		p.setProperty("db.user", "localhsot");
		p.setProperty("db.password", "localhsot");
		
		FileOutputStream fos = new FileOutputStream("abcd.txt");
		p.store(fos, "");
	}

}
