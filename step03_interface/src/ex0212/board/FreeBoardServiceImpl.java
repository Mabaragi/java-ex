package ex0212.board;

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public insertResponse insert(Board board) {
		System.out.println("Free = " + board);
		return null;
	}

	@Override
	public boolean update(Board board) {
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		return new Upboard(10, "제목", "유저", "내용", "1.txt");
	}

}
