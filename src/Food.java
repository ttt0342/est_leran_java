public class Food extends Product{
    public Food(String name, double price, int stock) {
        super("삼겹살", 20000, 8);
    }

    private int expirationDate;

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice() {
        if(expirationDate <= 7){
            return getPrice() * 0.8;
        }else {
            return getPrice();
        }
    }
}
