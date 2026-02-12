package ex0212.elec;

public class Audio extends Elec implements ElecFunction{
	int volume;
	public Audio() {
	}
	public Audio(String code, int cost, int volume) {
		super(code, cost);
		this.volume = volume;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("Audio [volume=");
		builder.append(volume);
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
		System.out.println(this.code+"의 Audio를"+this.volume+" 으로 듣는다.");
	}
	
	
}
