package Java_240611;

public class Java_240611_DailyQuiz {
  public static void main(String[] args) {
    Java_240611_Me java240611Me = new Java_240611_Me("김성연", 25, "의정부");
    java240611Me.sayHello();

    Java_240611_Food java240611Food = new Java_240611_Food();
    java240611Me.eating(java240611Food);
    java240611Me.cooking(java240611Food);
  }
}
