package Java_240617;

public class Java_240617_Util {
  public static <T> Java_240617_Box<T> boxing(T t) {
    Java_240617_Box<T> tJava240617Box = new Java_240617_Box<>();
    tJava240617Box.set(t);
    return tJava240617Box;

    // 외부에서 박싱메소드 호출하면 tBox 반환
  }
}
