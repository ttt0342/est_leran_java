package Java_240614;

public class Java_240614_Purchase {
  public static void main(String[] args) {
    Java_240614_DailyQuiz item = new Java_240614_DailyQuiz();

    try {
      item.buy(10000);
    } catch (Java_240614_InsufficientAmount e) {
      System.out.println(e.getMessage());
    }
  }
}
