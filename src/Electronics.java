public class Electronics extends Product{
    private String brand;

    public Electronics(String name, double price, int stock, String brand) {
        super("냉장고", 1000000, 5);
        this.brand = brand;
    }


//    @Override
//    public double calculatePrice() {
//        if(brand == Apple){
//            return getPrice() * 1.2;
//        }else {
//            return getPrice();
//        }
//    }
}
