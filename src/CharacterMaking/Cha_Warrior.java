package CharacterMaking;

import java.util.Random;

public class Cha_Warrior extends Character {
	
	public Cha_Warrior (String chaName, int chaClass) {
		
		super(chaName, chaClass);
		super.hp = 200;
		super.classConstant = 100;
		
	}
	
	@Override
	public int classDamage() {
		Random rand = new Random();
		return level * classConstant + rand.nextInt(50) + 50;
	}

}
