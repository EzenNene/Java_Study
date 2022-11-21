package quiz_07_Inheritance;

public class Q8_SnowTireExample {

	public static void main(String[] args) {
		Q8_SnowTire snowTire = new Q8_SnowTire();
		Q8_Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}

}
