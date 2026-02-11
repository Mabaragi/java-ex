package ex0211.overring;

class ObjectExam{
	String str = "집에 가고 싶다.";
	public ObjectExam(){   }
	public ObjectExam(String str) {
		this.str=str;
	}
	public String toString() {
		String addr = super.toString();
		return "주소: " + addr + "\n내용: " + this.str;	
	}
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			ObjectExam oe1=new ObjectExam("진짜 갈려고?");
			ObjectExam oe2=new ObjectExam("안녕");
			System.out.println(c);//
			System.out.println(s01);//
			System.out.println(s02);//
			System.out.println(s03);//
			System.out.println(oe1.toString());//
			System.out.println(oe2);//
			
	}
}