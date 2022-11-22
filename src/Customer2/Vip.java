package Customer2;

public class Vip extends Customer {

	// 필드
	

	double saleRatio;
	private int agentID;
	
	// 생성자
	
	public Vip (int id, String name, int agentID) {
		super(id, name);
		super.grade = "VIP";
		super.bonusRatio = 0.05;
		
		this.saleRatio = 0.1;
		this.agentID = agentID;
		
	}
	// 메소드
	
		@Override
		public int calcPrice(int price) {
			bonusPoint += (price * bonusRatio);
			return price - (int)(price * saleRatio);
		}
		
		@Override
		public String showCustomerInfo() {
			return super.showCustomerInfo() + ", 담당 상담원 아이디:" + agentID;
		}
	
//		public int getAgentID() {
//			return agentID;
//		}
	
}
