package Java_240617;

public interface Java_240617_InterfaceA {
    void methodA();

    //인터페이스의 디폴트 메서드 (Default Methods)
    default void ShowA(){
    System.out.println("okay");
    }
}
