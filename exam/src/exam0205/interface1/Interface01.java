package exam0205.interface1;

public interface Interface01 extends Interface02, Interface03 {
	void method01();
	void method02();
}

interface Interface02{
	void privateMethod01();
	default void defaultMethod01() {
		System.out.println("method from Interface02");
	}
}

interface Interface03{
	void privateMethod01();
	// 같은 default 메서드 중복 불가
//	default void defaultMethod01() {
//		System.out.println("method from Interface3");
//	}
}