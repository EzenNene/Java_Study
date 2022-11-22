package Customer2;

// 자바 유틸에서 ArrayList 라이브러리 블러오기
import java.util.ArrayList;

public class CustomerApp {
	// Customer 객체를 저장할 ArrayList 생성
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
//	private static ArrayList<Customer> customerList = null
//	customerList = new ArrayList<Customer>();
	
	// 메인함수 먼저 실행
	public static void main(String[] args) {

		// Customer 클래스 타입의 객체들 생성
		Customer customerLee = new Customer (1,"이순신");
		Customer customerSin = new Customer (2,"신사임당");
		
		Customer customerHong = new Gold (3,"홍길동");
		Customer customerJung = new Gold (4,"정약용");
		
		Customer customerYul = new Vip (5,"이율곡",12345);

		// customerList 이름의 ArrayList에 객체(고객)들 추가
		customerList.add(customerLee);
		customerList.add(customerSin);
		customerList.add(customerHong);
		customerList.add(customerJung);
		customerList.add(customerYul);
		
		showAllCustomer();
		
		// id 로 고객찾기
		Customer customer = findCustomer(5);
		
		// id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if (customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			//고객의 실제 지불금액 보너스 포인트
			showPriceBonus(customer,10000);
		}
		
		
	}

	// 매개변수로 받는값이 없으니 (위에 함수 실행코드가 있기때문) 리턴값 없으므로 void함수
	public static void showAllCustomer() {
		System.out.println("\n" + "=== 모든 고객 정보 출력 ===" + "\n");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	// Customer 타입의 값을 리턴하는 findCustomer 함수
	public static Customer findCustomer(int id) {
		
		Customer resultCustomer = null;
		
		for(Customer customer : customerList) {
			// 해당 객체의 id와 매개변수로 받아온 id가 같은지 비교한다
			if(customer.getId() == id) {
				resultCustomer = customer;
				break;
			}
		}
		
		return resultCustomer;
		
	}
	

	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("\n" + "=== 해당 고객의 할인률과 보너스 포인트 계산 ===" + "\n");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getName() + "님의 지불금액" + cost + "원");
		System.out.println(customer.getName() + "님의 현재 보너스 포인트" + customer.bonusPoint + "점");
	}
	
	
	
	
	
	
	
	
}
