package Customer2;

// 부모 클래스 Customer
public class Customer {


	//필드
	protected int id;			
	protected String name;		
	protected String grade;		//객체생성 시 id, name 입력받아야 메소드를 통해 필드값 정해짐
	
	int bonusPoint;				
	double bonusRatio;			
	
	
	
	// 생성자 (매개변수와 필드의 변수명이 같으면 this 사용)
	
//	public Customer() {
//		initCustomer();
//	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		initCustomer();
	}
	
	
	
	// 메소드
	// 필드값 지정 (등급과 보너스비율)
	private void initCustomer() {
		this.grade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	// price 리턴값을 받기 때문에 void 말고 int 사용
	public int calcPrice(int price) {
		this.bonusPoint += (price * bonusRatio);
		return price;
	}
	
	//
	public String showCustomerInfo() {
		return name + "님의 등급: " + grade + "보너스 포인트: " + bonusPoint + "점";
	}
	
	
	
	
	
	// get, set 메소드
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
	
	
}
