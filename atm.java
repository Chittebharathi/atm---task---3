import java.util.Scanner;
public class atm {
    public static void main(String[] args) {

        int pin = 1015;
        int balance = 10000;
        int withdraw=0;
        int deposit=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("pin: ");
        pin =sc.nextInt();
        if(pin == 1015 ){
            while(true) {
                System.out.println("A.T.M");
                System.out.println("Choose 1 for withdraw");
                System.out.println("Choose 2 for deposit");
                System.out.println("Choose 3 for Check balance");
                System.out.println("Choose 4 for receipt");
                System.out.println("Choose 5 for exit()");
                System.out.println("Choose the operation what you need");
                int n =sc.nextInt();
                switch (n) {
                case 1 :
                    System.out.println("Enter money to withdraw");
                    withdraw=sc.nextInt();
                    if(balance >= withdraw) {
                        balance=balance-withdraw;
                        System.out.println("Please collect your money \n");
                        System.out.println("Available balance is "+balance);
                        break;
                    } else {
                        System.out.println("Insufficient money ");
                    }
                    
    
                case 2 :
                    System.out.println("Enter money to be deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money succefully deposited ");
                    System.out.println(" ");
                    break;
    
                case 3 :
                    System.out.println("Balance : "+balance);
                    System.out.println(" ");
                    break;
    
                case 4 :
                    System.out.println("Welcome to ATM ");
                    System.out.println("deposited amount"+deposit);
                    System.out.println("withdrwan amount"+withdraw);
                    System.out.println("Available balance"+balance);
                    System.out.println("Thanks for Coming...");
                    System.out.println("Visit again");
                    break;
                case 5:
                    System.out.println("Thanks for coming...");
                    System.exit(0);
                    
                }
            }

        }
        else {
                System.out.println("Enter the correct pin");
        }

        
    }
}