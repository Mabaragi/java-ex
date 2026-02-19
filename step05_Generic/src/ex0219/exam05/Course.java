package ex0219.exam05;

public class Course {
	/**
	 * 모든 사람들 허용(등록)
	 */
	public void register01(Applicant<?> applicant) { // 와일드카드. 모든 타입 허용
		// 등록하는 기능
		System.out.println(applicant.getClass().getSimpleName() + "가 신청 완료 - register03");
	}
	
	/**
	 * 직장인만 허용 (등록)
	 */
	public void register02(Applicant<? super Worker> applicant) { // 하한 제한 와일드카드 Worker 본인 또는 Worker의 조상(부모) 타입만 허용
		System.out.println(applicant.getClass().getSimpleName() + "가 신청 완료~ - register02");
	}
	
	/**
	 * 학생들만 허용(등록)
	 */
	public void register03(Applicant<? extends Student> applicant) { // student를 상속받는 하위 클래스들
		System.out.println(applicant.getClass().getSimpleName() + "가 신청 완료~ - register03");		
	}
}
