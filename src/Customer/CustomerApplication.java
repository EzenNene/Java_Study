package Customer;

import java.util.ArrayList;

public class CustomerApplication {
	// Customer 객체(고객)를 저장할 ArrayList 생성
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		// 일반고객 (실버)
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		
		// 골드 고객
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "정약용");
				
		// VIP 고객
		Customer customerKIM = new VIPCustomer(10050, "이율곡", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKIM);
		
		showAllCustomer();
		
		// id로 고객찾기
		Customer customer = findCustomer(10050); // customer 객체를 받는다.
		
		// id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if (customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			// 고객의 실제 지불금액 보너스 포인트
			showPriceBonus(customer,10000);
		}
		
		
	}

	// 모든 고객정보 출력
	public static void showAllCustomer() {
		System.out.println("========모든 고객 정보 출력==========");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	// id로 고객객체를 찾아주는 메소드
	// Customer 객체를 리턴
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		
		for (Customer customer : customerList) {
			// 해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교한다
			if(customer.getCustomerID() == customerID) {
				resultCustomer = customer;
				break;
			}			
		}
		
		return resultCustomer; // 해당 객체를 찾지 못하면 null을 리턴한다
	}
	
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("=====해당 고객의 할인율과 보너스 포인트 계산=====");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName() + "님의 지불금액:" + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트:" + customer.bonusPoint + "점");
		
	}
	
}
