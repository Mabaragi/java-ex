package ex0212.board;

public class Upboard  extends Board{
	private String fileName;
	
	public Upboard() {}
	
	public Upboard(int no, String title, String author, String content, String fileName) {
		super(no, title, author, content);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("Upboard [fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
