package ex0212.ex.pr11;

public class Activity {
    public void onCreate() {
        System.out.println("기본적인 실행 내용");
    }

    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
        /*
         * 기본적인 실행 내용 추가적인 실행 내용
         */
    }
}


class MainActivity extends Activity {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
}
