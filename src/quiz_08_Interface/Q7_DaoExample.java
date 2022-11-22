package quiz_08_Interface;

public class Q7_DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}
	
	public static void main(String[] args) {
		dbWork(new Q7_OracleDao());
		dbWork(new Q7_MySqlDao());
		
	}

	
}
