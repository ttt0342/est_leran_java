package Java_240612;

public class Java_240612_Person {

//  //프라이빗은 같은 클래스에서만 사용핢 수 있다. 외부에서는 사용할 수 없음
//  private String name2;
//  String name;
//  int age;
//  //final String gender = "여"; //오류나는 이유: 초기화를 하지 않아서
//  //final String gender;
//
//  //final
//  final String test = "1231";  //혹은 생성자에서 작성
//  //파이널 필드는 인스턴스마다 적용되므로 상수가 아니다.
//  //런타임 중에는 값이 변화하지는 않으나 인스턴스 별로 값이 정해지므로 상수가 아니다.
//  //즉, 인스턴스마다 파이널 필드를 가지고 있다
//  // 상수를 만들기 위해 static을 붙여야 한다.
//
//  //스태틱 파이널 사용하기
//  static final String GENDER = "남"; //스태틱 파이널, 상수로 공용으로 사용됨
//  static final String EAT = "밥을 먹었습니다.";
//  static final int EYE = 2;
//  static final int NOSE = 1;
//  static final double PI = 3.14;
//
//  public Java_240612_Person(String name, int age )  {// String gender
//    this.name = name;
//    this.age = age;
//    //this.test = "123";
////    this.gender = "남";  //this.gender = gender;
//  }
//  private String getName2(){
//    return this.name2;
//    //같은 클래스라서 호출이 가능
//    //외부에서 접근이 불가능
//    //예) 은행이라면 인증절차를 외부에 노출시키면 안된다.
//    //
//  }
//
//  public void sayHello() {
//    System.out.println("Hello my name is " + this.name);
//  }
//
//  public void introduce() {
//    System.out.println("I am " + this.age + "years old.");
//  }
//
//  protected void testMethod(){
//    System.out.println("test");
//  }
//}

//public class Person {
//
//  private String name2;
//  String name;
//  int age;
//  final String test;
//  int gold = 999999999;
//  static final double PI = 3.14159;
//
//  public Person(String name, int age) {
//    this.name = name;
//    this.age = age;
//    this.test = "123";
//  }
//
//  private String checkAmount(int amount) { //공개하지 않을 로직, 정보
//    if (amount > this.gold) {
//      return "요청하신 금액이 너무 큽니다.";
//    }
//    return "정상처리되었습니다.";
//  }
//
//  public String deposit(int amount) { //요청하는 수단
//    return checkAmount(amount);
//
//  }
//
//  public static void say() {
//    System.out.println("good");
//  }
//
//  public void sayHello() {
//    System.out.println("Hello my name is " + this.name);
//  }
//
//  public void introduce() {
//    System.out.println("I am " + this.age + " years old.");
//  }
//
//  protected void testMethod() {
//    System.out.println("test");
//  }
}

//퍼블릭으로 로직을 작성했을 때 보안 상의 문제 발생 가능성 높음
//접근제안자 네가지의 특징 및 차이점 알고 있어야 한다.