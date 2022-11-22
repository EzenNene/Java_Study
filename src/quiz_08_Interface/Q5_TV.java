package quiz_08_Interface;

public class Q5_TV implements Q5_Remocon {
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		Q5_Remocon r = new Q5_TV();
		r.powerOn();

		
	}

}
