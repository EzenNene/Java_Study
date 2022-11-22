package CharacterMaking;

public class Character implements Character_Interface {
	
	//필드
	protected String chaName;
	protected String chaClass;	
	int classConstant;			// 직업상수

	
	//생성자
	Character (String chaName, String chaClass) {
		this.chaName = chaName;
		this.chaClass = chaClass;
	}
	
	//메소드
	
	public void attack() {
		
	}
	
}
