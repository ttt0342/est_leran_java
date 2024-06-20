package Java_WeeklyQuiz;

public class Clothing extends Product {
  private String size;

  public Clothing(String name, double price, int stock, String size) {
    super(name, price, stock);
    this.size = size;
    System.out.println(
        "상품명 : " + name + " 가격 : " + price + "원" + " 재고 : " + stock + " 사이즈 : " + size);
  }

  @Override
  public double calculatePrice() {
    if (size == "L" || size == "XL") {
      double i = getPrice() * 1.1;
      return i;
    } else {
      return getPrice();
    }
  }
}
