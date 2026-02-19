package ex0219.exam03;

public class MainApp {
	public static void main(String[] args) {
		Rentable<Car> carAgency = new CarAgency();
		Car car = carAgency.rent();
		
	}
}
