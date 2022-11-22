package CharacterMaking;

import java.util.Random;

abstract class Character implements Character_Interface {
	
	//필드
	int level = 1;
	public String chaName;
	public String chaClass;	
	int classConstant;			// 직업상수

	
	//생성자
	Character (String chaName, String chaClass) {
		this.chaName = chaName;
		this.chaClass = chaClass;
	}
	
	//메소드
	
	abstract public int getDamage();

	
}