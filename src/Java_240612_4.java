//import car.Car;
//
//public class Java_240612_4 {
//
//  public static void main(String[] args) {
////    Java_240612_Person2 person = new Java_240612_Person2();
////    System.out.println(person.name);
////    // 바로 접근하는 것은 객체지향에서 지양함
////    person.name = "max";
//    // 객체의 데이터를 마음대로 수정할 수 있으므로 객체의 무결성이 꺠질 수 있다.
//    // 바로 객체에 접근하지 않는 것을 지향한다.
//
//    // 예를 들어 차의 속도의 객체를 외부에서 수정하여 마이너스값으로 하여도 오류가 발생하지 않음
//    // 크리티컬한 오류 발생가능성 높음
//
//    // => 바로 변수에 값을 대입하는 것이 아닌 메서드를 통해서 데이터에 접근하는 것을 지향한다.
//    // => 데이터를 프라이빗, 메서드는 퍼블릭으로
//    // 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있기 때문
//
////
//    Car car = new Car();
//        car.speed();
//        car.geer();//프라이빗이라서 외부 호출 불가능
//
//    // 호출이 가능한 것 = setSpeed
//    car.setSpeed(100);
//    car.checkSpeed();
//  }
//}
