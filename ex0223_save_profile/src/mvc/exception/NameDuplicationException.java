package mvc.exception;

public class NameDuplicationException extends Exception {
	public NameDuplicationException() {}
	public NameDuplicationException(String message) {
		super(message);
	}
}
