package quiz_05_ReferenceType;

public class Quiz_10 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i<ballArr.length; i++) {				// 0~8
			int j = (int)(Math.random() * ballArr.length);	// 0~8
			int tmp = 0;
			
			tmp = ballArr[i];			
			ballArr[i] = ballArr[j];	
			ballArr[j] = tmp;			
			
		}
		
//		배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		
//		ball3[0] = ballArr[0];
//		ball3[1] = ballArr[1]; 
//		ball3[2] = ballArr[2];  
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
		for(var n : ballArr) System.out.print(n + " ");

		
		
		
	}

}
