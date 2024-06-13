//package car;
//
//public class Car {
//      protected String company = "weniv";
//
//  private int speed;
//
//  public int getGeer() {
//    return geer;
//  }
//
//  public String getWheel() {
//    return wheel;
//  }
//
//  public int getCc() {
//    return cc;
//  }
//
//  public String getLogo() {
//    return logo;
//  }
//
//  public String getEngine() {
//    return engine;
//  }
//
//  //알트 인서트 - 세터, 게터 한번에 만들 수 있다. - 생산성이 높아진다.
//  private int geer; // 변수
//  private String wheel;
//  private int cc;
//  private String logo;
//  private String engine;
//
//  public double getSpeed(){
//    return this.speed * 1.6;  //겟 메서드를 사용하여 만들기
//
//  public void setGeer(int geer) {
//    this.geer = geer;
//  }
//
//  public void setWheel(String wheel) {
//    this.wheel = wheel;
//  }
//
//  public void setCc(int cc) {
//    this.cc = cc;
//  }
//
//  public void setLogo(String logo) {
//    this.logo = logo;
//  }
//
//  public void setEngine(String engine) {
//    this.engine = engine;
//  }
//
//
//
//
//  public Car(int speed, int geer){
//    this.speed = speed;
//    this.geer = geer;
//  }
////  public void setSpeed(int speed) { // 세터메서드
////    if (speed < 0) {
////      this.speed = 0;
////    } else {
////      this.speed = speed;
////    } // 무결성이 깨지는 것을 방지할 수 있다. 즉, 바로 변수에 접근하지 않는 것이 중요하다.
//
//
//    //삼항 연산자
//    //this.speed = speed < 0 ? 0 : speed;
//
//    //기어 문제 다시 풀어보기, 이해 필요
//  public void setSpeed(int speed, int geer) {
//    if (speed < 0) {
//      this.speed = 0;
//      return;
//    }
//    this.speed = speed;
//
//    if (speed <= 30) {
//      this.gear = 1;
//    } else if (speed <= 70) {
//      this.gear = 2;
//    } else {
//      this.gear = 3;
//    }
//  }
//
//  }
//
//
//  public void checkSpeed() {  //함수명은 의미가 있는 것 사용 권장
//    System.out.println(this.speed);
//  }
//}
