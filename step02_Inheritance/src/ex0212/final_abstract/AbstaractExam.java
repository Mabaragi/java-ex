package ex0212.final_abstract;

import java.util.List;

public class AbstaractExam {
	public static void test(Animal animal) {
		animal.eat();
		animal.run();
		animal.sound();
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = List.of(new Dog(), new Cat(), new Pig());
		for (Animal animal : animalList) {
			test(animal);
		}					
	}
}


abstract class Animal{
	int legs;
	
	public abstract void sound();
	public abstract void run();
	
	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}

	@Override
	public void run() {
		System.out.println("강아지는 오래달리기를 할수 있는 몇 안되는 동물입니다.");
		
	}

}

class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
		System.out.println("고양이는 오래 달리지는 못하지만 순발력이 뛰어납니다.");		
		
	}
	
}

class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀.");
		
	}

	@Override
	public void run() {
		System.out.println("돼지는 잘 뛰지 못합니다.");
		
	}
	@Override
	public void eat() {
		System.out.println("잘먹습니다.");
	}
	
}