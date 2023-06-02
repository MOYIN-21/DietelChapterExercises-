  import java.util.Scanner;

  public class AccountTest {
     public static void main(String[] args) {
        Account account1 = new Account("Mercy Grace", 50.00);
        Account account2 = new Account("Makayla Pink", -10.50);
        
   System.out.printf("%s balance: #%.4f%n", account1.getName(), account1.getBalance());
   System.out.printf("%s balance: #%.4f%n%n", account2.getName(), account2.getBalance());
    
    Scanner input = new Scanner(System.in);
   
   System.out.print("Enter deposit amount for account1: ");
    double depositAmount = input.nextDouble();
    System.out.printf("%nadding %.4f to account1 balance%n%n", depositAmount);
    account1.deposit(depositAmount);
    
   System.out.printf("%s balance: # %.4f%n", account1.getName(), account1.getBalance());
   System.out.printf("%s balance: # %.4f%n%n", account2.getName(), account2.getBalance());
   
    System.out.print("Enter deposit amount for account2: ");
    depositAmount = input.nextDouble();
    System.out.printf("%nadding %.4f to account balance%n%n", depositAmount);
    account2.deposit(depositAmount);
    
    System.out.printf("%s balance: #%.4f%n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $ %.4f%n", account2.getName(), account2.getBalance());
  }
}