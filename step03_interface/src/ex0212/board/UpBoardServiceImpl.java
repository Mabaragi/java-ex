package ex0212.board;

public class UpBoardServiceImpl implements BoardService {

	@Override
	public insertResponse insert(Board board) {
		System.out.println("free = " + board);
		System.out.println(getClass().getSimpleName() + "insert call");
		return null;
	}

	@Override
	public boolean update(Board board) {
		System.out.println(getClass().getSimpleName() + "update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		 System.out.println(getClass().getSimpleName() + "insert call");
		return null;
	}

}
