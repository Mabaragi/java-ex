package ex0212.superkeyword;

public class SuperFieldMethodExam {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // cat.test();

        System.out.println("외부에서 객체 생성해서 접근");

        System.out.println(cat.age);
        System.out.println(cat.bodyColor);
        System.out.println(cat.weight);

        cat.sound();
        cat.eat();
        cat.run();

        Animal animal = new Cat();

        if (animal instanceof Cat catAnimal) {
            catAnimal.run();

        }
        animal.eat();
        animal.sound();



    }
}


class Animal {
    int age = 5;
    String bodyColor = "white";

    public void sound() {
        System.out.println("Animall Sounds.");
    }

    public void eat() {
        System.out.println("Animal Eat.");
    }


}


class Cat extends Animal {
    int age = 10;
    // String bodyColor = "black";
    int weight = 20;

    public void sound() {
        System.out.println("Cat Sounds.");
    }


    public void run() {
        System.out.println("Cat Run.");
    }



    public void test() {
        System.out.println("** age **");
        System.out.println(this.age);
        System.out.println(super.age);
        System.out.println("** bodyColor **");
        System.out.println(this.bodyColor);
        System.out.println(super.bodyColor);
        System.out.println("** weight **");
        System.out.println(this.weight);
        // System.out.println(super.weight); // 부모에 없는 필드는 안됨

        System.out.println("** sound **");
        this.sound();
        super.sound();
        System.out.println("** eat **");
        this.eat();
        super.eat();
        System.out.println("** run **");
        this.run();

    }
}

