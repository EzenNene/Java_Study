package CharacterMaking;

public class WeaponKnife implements Weapon {

	int count = 0;
	
	@Override
	public int weaponDamage() {
		
		count++;
		
		if(count%3 == 0) {
			return 300;
		} else {
			return 100;
		}
		
	}
	
}
