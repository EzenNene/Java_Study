package CharacterMaking;

import java.util.Random;

public class Cha_Thief extends Character {

	Cha_Thief(String chaName, int chaClass) {
		
		super(chaName, chaClass);
		super.classConstant = 75; 
		
	}

	@Override
	public int getDamage() {
		Random rand = new Random();
		return level * classConstant + rand.nextInt(50) + 75;
	}

}
