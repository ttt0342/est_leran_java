package Java_240617;

public class Java_240617_SamsungPhone implements Java_240617_Phone, Java_240617_Good {
  //인터페이스 다중 상속 가능하다.

  @Override
  public String call() {
    return "삼성폰이 전화를 겁니다.";
  }

  @Override
  public String answerThePhone() {
    return "삼성폰이 전화를 받습니다.";
  }

  @Override
  public String okay() {
    return "okay";
  }
}
