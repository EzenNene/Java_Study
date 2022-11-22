package Customer2;

public class Gold extends Customer {

	// 필드
	
	// 아이디, 이름, 등급, 보너스포인트 필드는 
	// Customer 클래스로부터 상속받아서 쓰지 않아도 된다
	// 단, 할인율은 골드부터 적용되므로 (부모필드에 없으므로) 자식클래스 필드에 따로 작성
	double saleRatio;
	
	// 생성자
	//super 사용해서 부모클래스 멤버에 접근
	public Gold (int id, String name) {
		super(id, name);
		super.grade = "GOLD";
		super.bonusRatio = 0.02;
		
		// 부모에 saleRatio 필드는 없으므로 this
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
}
