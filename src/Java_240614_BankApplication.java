public class Java_240614_BankApplication {
    public static void main(String[] args){
        JAva_240614_BankAccount account = new JAva_240614_BankAccount();

        try{
            account.withdraw(10000);
        }catch (Java_240614_InsufficientBalanceException e){
      System.out.println(e.getMessage());
        }
    }
}
