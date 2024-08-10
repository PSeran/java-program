package map_Interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Map {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fils=new FileInputStream("C:\\Users\\giris\\eclipse-workspace\\Seran\\src\\map_Interface\\test.properties");
		p.load(fils);
		System.out.println(p);
		String ss=p.getProperty("dosai");
		System.out.println(ss);
		p.setProperty("dosai","15");
		FileOutputStream fil1=new FileOutputStream("C:\\Users\\giris\\eclipse-workspace\\Seran\\src\\map_Interface\\test.properties");
		p.store(fil1, "update price");
	}

}

