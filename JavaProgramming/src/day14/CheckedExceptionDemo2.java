package day14;

import java.io.FileReader;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		FileReader fr= new FileReader("C:\\Users\\DELL\\Documents\\test.txt");
		BufferReader bf=new BufferReader(fr);
		System.out.println(bf.readLine());
		
		
		
	}

}
