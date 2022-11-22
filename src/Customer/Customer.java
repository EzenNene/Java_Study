package Customer;

public class Customer {

	// 필드
	protected int customerID; // 고객아이디
	protected String customerName; // 고객이름
	protected String customerGrade; // 고객등급: 실버,골드,...
	int bonusPoint; // 보너스 포인트 적립
	double bonusRatio; // 보너스 포인트 적립 비율
	
	// 생성자
	// 생성자가 받는 매개변수에 따라 해당하는 생성자 실행
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// 메소드
	
	// 고객 등급 초기화
	// 매개변수와 필드의 변수명이 같으면 this
	private void initCustomer() {
		this.customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
		
	//보너스 포인트계산, 가격 리턴
	public int calcPrice(int price) { // price: 지불 금액
		bonusPoint += (price * bonusRatio); // 보너스 비율을 계산해서 bonuspoint를 적립
		return price; // 일반고객은 지불 금액 그대로 리턴
	}
	
	// 고객정보 보여주기
	public String showCustomerInfo() {
		return customerName + "님의 등급: " 
		+ customerGrade + ", 보너스 포인트: " 
		+ bonusPoint + "점";
	}
	
	// get, set 메소드
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
}
