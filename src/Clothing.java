public class Clothing extends Product{
    public Clothing(String name, double price, int stock) {
        super("바지", 15000, 3);
    }

    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

//        @Override
//    public double calculatePrice() {
//        if(size >= L){
//            return getPrice() * 1.1;
//        }else {
//            return getPrice();
//        }
//    }
}
