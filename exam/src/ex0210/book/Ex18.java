package ex0210.book;

public class Ex18 {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }
}

class ShopService{
    private static ShopService instance = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return instance;
    }

}