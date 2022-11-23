package CharacterMaking;

import java.util.Random;

public class Cha_Thief extends Character {

	public Cha_Thief(String chaName, int chaClass) {
		
		super(chaName, chaClass);
		super.hp = 50;
		super.classConstant = 75; 
		
	}

	@Override
	public int classDamage() {
		Random rand = new Random();
		return level * classConstant + rand.nextInt(50) + 75;
	}

}
