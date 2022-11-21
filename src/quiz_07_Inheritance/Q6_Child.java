package quiz_07_Inheritance;

public class Q6_Child extends Q6_Parent {
	public int studentNo;
	
	public Q6_Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}
