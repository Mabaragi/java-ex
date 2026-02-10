package ex0210.book;

public class Ex13 {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        
    }    
}

// Ex13~Ex14
class Member{
    String name;
    String id;
    String password;
    int age;

    public Member(String name, String id){
        this.name = name;
        this.id = id;
    }
}

class MemberService{
    public boolean login(String id, String password){
        if (id == "hong" && password == "12345") {
            return true;
        }
        return false;
    }
    public void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
