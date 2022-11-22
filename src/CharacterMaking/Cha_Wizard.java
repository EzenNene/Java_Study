package CharacterMaking;

import java.util.Random;

public class Cha_Wizard extends Character {
	
	public Cha_Wizard (String chaName, String chaClass) {
		
		super(chaName, chaClass);
		super.classConstant = 150; 
		
	}
	
	@Override
	public int getDamage() {
		Random rand = new Random();
		return level * classConstant + rand.nextInt(50) + 100;
	}
	
}
