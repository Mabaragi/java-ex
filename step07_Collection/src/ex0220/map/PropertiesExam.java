package ex0220.map;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
	Properties properties = new Properties();

	public PropertiesExam() {
//		properties.setProperty("1", "fdsafasd");
//		properties.setProperty("2", "zzxcv");
		
		for (String key : properties.stringPropertyNames()) {
			System.out.println(properties.get(key));
		}
	}
	
	/** 
	 * 외부의 ~.properties 파일을 로딩하는 방법 2가지
	 * 1) IO를 이용하는 방법
	 * 2) ResourceBundle 이용하는 방법
	 */
	public void test01() {
		properties.clear(); // properties 지우기
		try {
			// 소스코드 기준이기 때문에 배포할때 경로 기준으로는 경로 실패함
//			properties.load(new FileInputStream("src/ex0220/map/info.properties"));		
		    //2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
//		    InputStream inputStream =
		    // PropertiesExam.class 클래스가 있는 위치가 기준이 됨
//		     PropertiesExam.class.getResourceAsStream("info.properties");
//		     properties.load(inputStream);
		
			 //3.클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
			// classes 폴더기준
//			 InputStream inputStream = 
//			 this.getClass().getResourceAsStream("info.properties"); 
//			 properties.load(inputStream);
			  
		
			 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을때 사용.
			 InputStream inputStream = 
			this.getClass().getClassLoader().getResourceAsStream("a.properties"); 
//			this.getClass().getClassLoader().getResourceAsStream("ex0220/map/info.properties"); 
			 properties.load(inputStream);
			 
			 //5. ClassLoader의 Class내에 파일존재하는 경우
			/*InputStream inpupStream =
		this.getClass().getClassLoader().getResourceAsStream("ex0726/list/b.properties"); // 경로에 '/' 붙지않음. ClassLoader의 모든 경로에서 파일 읽음.
			 pro.load(inpupStream);*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(properties);
		
	}
	
	public void test02() {
		System.out.println("----test02()----");
		properties.clear();
		ResourceBundle rb = ResourceBundle.getBundle("a");
		System.out.println(rb.getString("a"));
	}
	
	public static void main(String[] args) {
		PropertiesExam pe = new PropertiesExam();
//		pe.test01();
		pe.test02();
	}
}
