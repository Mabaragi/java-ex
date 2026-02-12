package ex0212.board;

public class MainApp {
	BoardService service;
	Board board;
	
	public MainApp() {
		service = new FreeBoardServiceImpl();
		board = new FreeBoard(10, "자유게시물", "자유저작자", "내용입니다.");
		test(service, board);
		
		service = new QaBoardImpl();
		board = new QaBoard(10, "자유게시물", "자유저작자", "내용입니다.", false);
		test(service, board);
		
		service = new UpBoardServiceImpl();
		board = new Upboard(10, "자유게시물", "자유저작자", "내용입니다.", "input.txt");
		test(service, board);
	}
	public static void main(String[] args) {
		MainApp main = new MainApp();
		
	}
	
	public void test(BoardService service, Board board) {
		service.insert(board);
		service.update(board);
		service.selectByNo(0);
		
		service.delete(5);
		
		System.out.println("============================");
	}
}
