package quiz_11_12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		int value1 = obj3;
		int value2 = obj4;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		System.out.println(value1 == value2);
	}

}

// -128 ~ 128 범위의 Integer 값은 == 연산자에서 '값'을 비교
// 위의 범위를 벗어난 수는 == 연산자에서 객체의 '주소값'을 비교
