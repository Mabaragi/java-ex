package ex0212.board;

/**
 * QA 게시판 비즈니스 로직 담당 클래스 
 */
public class QaBoardImpl implements BoardService {

	@Override
	public insertResponse insert(Board board) {
		System.out.println("QA = " + board);
		System.out.println("QA impl insert Call");
		return null;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QA impl update Call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("QA impl select Call");
		return null;
	}

}
