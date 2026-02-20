package mvc.exception;

/**
 * 할인율이 0이하 100이상일 경우 발생하는 예외
 * */
public class DiscountBoundsException extends Exception{

	public DiscountBoundsException() {}
	public DiscountBoundsException(String message) {
		super(message);
	}
}
