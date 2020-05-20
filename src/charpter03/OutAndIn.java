package charpter03;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class OutAndIn {
	

	public static void main(String[] args) throws IOException {
		
		Scanner scannerT=new Scanner(Paths.get("/Users/sunny/Documents/workplace/gui_auto/resource.txt"));
		
		while(scannerT.hasNext()) {
			System.out.println(scannerT.nextLine());
		}
		
		String a="Test";
		System.out.println(a.equals("aaa"));
		
		
	}
	
	

}
