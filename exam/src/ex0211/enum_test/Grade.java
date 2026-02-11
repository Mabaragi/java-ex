package ex0211.enum_test;

public enum Grade {
	BASIC(0,"일반"), SILVER(1,"우수"), GOLD(2,"최우수");
	
	private final int code;
	private final String name;
	
	Grade(int code, String name){ // private 밖에 불가능 내부에서만 생성
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
