package ex0211.inheritance;
class CarCenter{
	public void engineer(Car cd){
		System.out.println("cd주소: "+ cd);
//		System.out.println(cd.efSonataVersion); // 부모 타입에서 자식 타입은 불가
		if (cd instanceof EfSonata ef) {
			System.out.println(ef.efSonataVersion);
		}
		
		
		System.out.println();
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
//		cc.engineer(c);//
		System.out.println("ef주소: "+ ef);
		System.out.println("ef.i: "+ ef.efSonataVersion);
		cc.engineer(ef);//
//		cc.engineer(ca);//
//		cc.engineer(ex);//
		
		
	
	}
}