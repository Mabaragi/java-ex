package ex0211.enum_test;

public enum InsertResult {
	/**
	 * 상품코드 중복되었을때
	 */
	ISERT_DUPLICATE,
	
	/**
	 * 배열 경계 초과
	 */
	INSERT_OUT_OF_INDEX,
	
	/**
	 * 등록 성공
	 */
	INSERT_SUCCESS;
}
