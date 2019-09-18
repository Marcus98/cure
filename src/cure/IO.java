package cure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IO {
	
	public static void main(String[] args) {
		
		File fromFile = new File("D:\\T.txt");
		
		Reader reader = null;
		try {
			reader = new FileReader(fromFile);
			int content = reader.read();
			
			while(content != -1) {
				System.out.println((char)content);
				content = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
