package ex0212.elec;

public class Tv extends Elec implements ElecFunction{
	int channel;
	
	public Tv() {
	}

	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("Tv [channel=");
		builder.append(channel);
		builder.append("]]");
		return builder.toString();
	}
	
	@Override
	public void start() {
		this.display();
		
	}

	@Override
	public void stop() {
		System.out.println("종료");
		
	}

	@Override
	public void display() {
		System.out.println(this.code+"제품 TV를 "+this.channel+"을 본다.");
		
	}
}
