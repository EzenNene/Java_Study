package CharacterMaking;

import java.util.Random;

public class WeaponStaff implements Weapon {

	@Override
	public int weaponDamage() {
		Random random = new Random();		
		int n = random.nextInt(10);
		
		if(n < 3) {
			return 400;			
		} else {
			return 50;
		}
		
	}
	
}
