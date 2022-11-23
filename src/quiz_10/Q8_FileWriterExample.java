package quiz_10;

import java.io.IOException;

public class Q8_FileWriterExample {

	public static void main(String[] args) {
		
		
		//바꿀내용
		
		//Q8_FileWriter fw = null;
		
		// Q8 객체를 생성하며,"file.txt" 를 매개로 받는 생성자 실행
		try(Q8_FileWriter fw = new Q8_FileWriter("file.txt")) {
			
			fw.write("Java");
//			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// finally { fw.close(); } catch
		//(IOException e)
		
		
		
	}

}
