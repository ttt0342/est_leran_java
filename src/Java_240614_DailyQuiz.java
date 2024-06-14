public class Java_240614_DailyQuiz {
  private int money;

  public void buy(int price) throws Java_240614_InsufficientAmount {
    if (money < price) {
      throw new Java_240614_InsufficientAmount("구매할 수 없습니다.");
    }
    money -= price;
  }
}
