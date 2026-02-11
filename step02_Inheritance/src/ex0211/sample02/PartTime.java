package ex0211.sample02;

public class PartTime extends Employee{
    private int timePay;
   
    public PartTime() {}
    
	public PartTime(int empNo, String eName, String job, int mgr, String hireDate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hireDate, deptName);
		this.timePay = timePay;
	}
	    
	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	public void message() {
		System.out.println(this.geteName()+"사원은 비정규직입니다.");
	}
	
	public String toString() {
		return String.format("%s | %d ", super.toString(), this.getTimePay());
	}
	
    
}
