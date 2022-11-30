package quiz_11_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// now 변수에 현재시간 객체 대입
		Date now = new Date();
		// strNow1 변수에 toString 함수 사용해서 현재시간 now를 문자열로 출력
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// "yyyy년 MM월 dd일 hh시 mm분" 를 생성자 매개변수 갖는 
		// 자바 라이브러리 객체 SimpleDateFormat 생성
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		// strNow2 변수에 현재시간을 매개변수로 받아서 
		// 생성자 형태로 시간을 출력하는 sdf객체를 대입
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
