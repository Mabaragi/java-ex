package ex0219.lambda;

@FunctionalInterface
public interface AInterface {
	void aa();
	default void bb() {}; // default는 있어도 됨
}
