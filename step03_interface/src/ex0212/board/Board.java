package ex0212.board;


/**
 * 모든 게시판이 공통으로 갖는 속성을 관리하는 객체(DTO=VO=Domain)
 * :글번호, 제목, 작성자, 내용 
 */
public class Board {
	private int no;
	private String title;
	private String author;
	private String content;
	
	
	public Board() {
	}

	public Board(int no, String title, String author, String content) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=");
		builder.append(no);
		builder.append(", title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append(", content=");
		builder.append(content);
		builder.append(",");
		return builder.toString();
	}

	
}
