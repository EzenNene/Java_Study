package quiz_08_Interface;

public class Q7_MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB 에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB 에 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB 를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB 에서 삭제");
		
	}

}
