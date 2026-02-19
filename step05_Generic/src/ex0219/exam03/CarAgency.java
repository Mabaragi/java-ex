package ex0219.exam03;

public class CarAgency implements Rentable {
	Car car = new Car();
	
	@Override
	public Car rent() {
		return this.car;
	}
}
