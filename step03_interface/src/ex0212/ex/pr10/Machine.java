package ex0212.ex.pr10;

public abstract class Machine {
    public void powerOn() {}

    public void powerOff() {}

    public abstract void work();

}


class computer extends Machine {
    @Override
    public void work() {
        // 추상 메서드 work를 구현해야 합니다.
    }
}
