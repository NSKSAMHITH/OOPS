package bank;

public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Samhith";
        account1.email = "xyz@gmail.com";

        //account1.password = "1234";#this will throw an error as password field in the Account class is private

        account1.setPassword("123456");

        System.out.println(account1.getPassword());
    }
}
