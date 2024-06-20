package Java_WeeklyQuiz_240620;

public class Food extends Product {

  private int expirationDate;

  public Food(String name, double price, int stock, int expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
    System.out.println(
        "상품명 : " + name + " 가격 : " + price + "원" + " 재고 : " + stock + " 유통기한 : " + expirationDate);
  }

  @Override
  public double calculatePrice() {
    if (expirationDate <= 7) {
      double i = getPrice() * 0.8;
      return i;
    } else {
      return getPrice();
    }
  }
}
