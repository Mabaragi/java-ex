package ex0212.ex.pr6;


// 6번 문제
public class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }

}


class child extends Parent {
    public int studentNo;

    child(String name, int studentNo) {
        // this.name = name;
        super(name); // 슈퍼 클래스에 기본 생성자가 없으면 서브 클래스에서 명시해야한다.
        this.studentNo = studentNo;
    }
}
