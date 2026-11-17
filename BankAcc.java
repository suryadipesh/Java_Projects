
import java.util.Scanner;

class Account{
    int accountNum;
    int pin ;
    String userName;
    int bal;

    public Account(int accountNum,int pin,String userName,int bal) {
        this.accountNum = accountNum;
        this.pin = pin;
        this.userName = userName;
        this.bal = bal;
    }

}

public class BankAcc {
    public static void main(String[] args) {
        Account acc1 = new Account(754108,2508,"Surya" , 10000);
        Account acc2 = new Account(147198,3462,"Dipesh" , 5000);
        System.out.println("Welcome To Our Bank.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Account Number: ");
        int user = sc.nextInt();
        System.out.print("Enter Your Pin: ");
        int accPin = sc.nextInt();
        boolean fun = true;
        while(fun == true){
            if(user == acc1.accountNum && accPin == acc1.pin){
                System.out.println();
                System.out.println("Welcome "+acc1.userName+" !!");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Bank Balance");
                System.out.println("4. Change Pin");
                System.out.println("5. Exit");
                System.out.print("What Would You Like To Do? ");
                int a = sc.nextInt();
                int balance = acc1.bal;
                if(a == 1){
                    System.out.print("How Much Money You Would Like To Deposite: ");
                    int dep = sc.nextInt();
                    balance = balance + dep;
                    acc1.bal = balance;
                    System.out.println("Your Updated Balance Is: "+balance);
                }else if(a == 2){
                    System.out.print("How Much Money You Would Like To Withdraw: ");
                    int wit = sc.nextInt();
                    if(wit < acc1.bal){
                        balance = balance - wit;
                        acc1.bal = balance;
                        System.out.println("Your Updated Balance Is: "+balance);
                    }else{
                        System.out.println("Insufficient Balance.");
                    }
                }else if(a == 3){
                    System.out.println("Your Current Balance: "+balance);

                }else if(a == 4){
                    System.out.println("Feature Not Available At This Moment.");
                }else if(a == 5){
                    System.out.println("Thankyou For Using Our Services..");
                    fun = false;
                }else{
                    System.out.println("Invalid Input.");
                }

            }else if(user == acc2.accountNum && accPin == acc2.pin){
                System.out.println();
                System.out.println("Welcome "+acc2.userName+" !!");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Bank Balance");
                System.out.println("4. Change Pin");
                System.out.println("5. Exit");
                System.out.print("What Would You Like To Do? ");
                int b = sc.nextInt();
                int balance = acc2.bal;
                if(b == 1){
                    System.out.print("How Much Money You Would Like To Deposite: ");
                    int dep = sc.nextInt();
                    balance = balance + dep;
                    acc2.bal = balance;
                    System.out.println("Your Updated Balance Is: "+balance);
                }else if(b == 2){
                    System.out.print("How Much Money You Would Like To Withdraw: ");
                    int wit = sc.nextInt();
                    if(wit < acc2.bal){
                        balance = balance - wit;
                        acc2.bal = balance;
                        System.out.println("Your Updated Balance Is: "+balance);
                    }else{
                        System.out.println("Insufficient Balance.");
                    }
                }else if(b == 3){
                System.out.println("Your Current Balance: "+balance);

                }else if(b == 4){
                    System.out.println("Feature Not Available At This Moment.");
                }else if(b == 5){
                    System.out.println("Thank you For Using Our Services..");
                    fun = false;
                }else{
                    System.out.println("Invalid Input.");
                }
            }else{
                System.out.println("Invalid User");
                fun = false;
            }
        }
    }
}
