package Java_WeeklyQuiz.Java_WeeklyQuiz_240620;

public class Electronics extends Product {
  private String brand;

  public Electronics(String name, double price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
    System.out.println(
        "상품명 : " + name + " 가격 : " + price + "원" + " 재고 : " + stock + " 브랜드명 : " + brand);
  }

  @Override
  public double calculatePrice() {
    if (brand == "Apple") {
      double i = getPrice() * 1.2;
      return i;
    } else {
      return getPrice();
    }
  }
}
