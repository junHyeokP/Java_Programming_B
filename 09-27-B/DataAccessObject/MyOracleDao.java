package kr.ac.kopo.interfaces;

public class MyOracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
