package ex0219.exam03;

public class HomeAgency implements Rentable {
	Home home = new Home();
	
	@Override
	public Home rent() {
		return this.home;
	}
}
