package Java_240611;

public class Java_240611_4 {
// Java_240611.Java_240611_3 참고하기

  private static int count = 0;

  //인스턴스를 사용하지 않고 호출하는 방법
  public static void call(int a, int b){
    System.out.println("call");
  }

  private int a = 1;

  public String b = "hello";

  public String good() {

    add();

    return "okay";    // => 이를 출력하며 add okay를 호출한다.
  }

  private void add(){
    System.out.println("add");
  }
  //함수를 선언할 때, 반환타입의 앞에 접근 제안자가 있음
  //이를 적지 않으면 디폴트 이다.
  //private = 본인 클래스 안에서만 사용이 가능함


  //private는 같은 java240611_4에서는 활용이 가능하나 다른 곳에서는 사용불가




}
