package vector;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class EnumDemo
{
	public static void main(String[] args)
	{
		try {
		InputStream input1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\file.txt");
		InputStream input2 = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\file.txt");
		InputStream input3 = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\file.txt");
		
		Vector<InputStream> streams = new Vector<>();
		streams.add(input1);
		streams.add(input2);
		streams.add(input3);
		Enumeration enumeration=streams.elements();
		
		SequenceInputStream sequeceInputStream = new SequenceInputStream(enumeration);
				
		int data = sequeceInputStream.read();
		while(data != -1) {
			System.out.print((char)data);
			data = sequeceInputStream.read();
		}
		sequeceInputStream.close();
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
