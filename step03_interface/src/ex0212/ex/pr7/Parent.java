package ex0212.ex.pr7;


// 7번 문제
public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parrent() Call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parrent(String nation) Call");
    }

    public static void main(String[] args) {
        new Child();
        /*
         * Parrent(String nation) Call Parrent() Call Child(String name) Call Child() Call
         */
    }

}


class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() Call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) Call");
    }
}
