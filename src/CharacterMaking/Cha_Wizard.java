package CharacterMaking;

import java.util.Random;

public class Cha_Wizard extends Character {
	
	public Cha_Wizard (String chaName, int chaClass) {
		
		super(chaName, chaClass);
		super.hp = 150;
		super.classConstant = 150; 
		
	}
	
	@Override
	public int classDamage() {
		Random rand = new Random();
		return level * classConstant + rand.nextInt(50) + 100;
	}
	
}
