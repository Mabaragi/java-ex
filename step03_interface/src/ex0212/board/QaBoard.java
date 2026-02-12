package ex0212.board;

public class QaBoard extends Board{
	private boolean replyState;
	
	public QaBoard() {}
	public QaBoard(int no, String title, String author, String content, boolean replyState) {
		super(no, title, author, content);
		this.replyState = replyState;
	}
	
	public boolean isReplyState() {
		return replyState;
	}
	public void setReplyState(boolean replyState) {
		this.replyState = replyState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("QaBoard [replyState=");
		builder.append(replyState);
		builder.append("]");
		return builder.toString();
	}
	
	
}
