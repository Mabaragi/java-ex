package ex0212.board;

/**
 * 모든 게시판이유형이 공통으로 사용할 메소드를 정의 (규격서 역할) 
 */
public interface BoardService {
	
	/**
	 * 등록
	 * @param: 
	 * @return: SUCCESS, ALLEADY_EXISTS, OUT_OF_RANGE
	 */
	insertResponse insert(Board board); // QA or Upload or Free

	/**
	 * 수정
	 * @param board
	 * @return boolean
	 */
	boolean update(Board board);
	
	Board selectByNo(int no);
	
	default int delete(int no) {
		System.out.println("삭제기능입니다.");
		return 3;
	}
}

enum insertResponse {
	SUCCESS, ALLEADY_EXISTS, OUT_OF_RANGE
}