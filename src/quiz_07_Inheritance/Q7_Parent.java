package quiz_07_Inheritance;

public class Q7_Parent {
	public String nation;
	
	public Q7_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Q7_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
	
}
