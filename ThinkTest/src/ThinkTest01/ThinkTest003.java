package ThinkTest01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThinkTest003 {
	public static void main(String[] args) {
		FileInputStream fils = null;
		try {
			fils = new FileInputStream("test");
			byte[] bytes = new byte[4];
			int i = 0;
			while((i=fils.read(bytes)) != -1){
				String test = new String(bytes,0,i);
				System.out.print(test);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fils != null){
				try {
					fils.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
