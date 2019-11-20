import java.util.Scanner;

class excercise5{

public static void main(String[] args) {

    double num = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your first number");
    int  num1 = scan.nextInt();
    System.out.println("Please enter your second number");
    int num2 = scan.nextInt();

    System.out.println("The sum is " + (num1 + num2));
    System.out.println("The difference is " + (num = num1 - num2));
    System.out.println("The product is " + num1 * num2);
    System.out.println("The quotient is " + (num = num1 / num2));
    System.out.println("The remainder is "+ num1 % num2);
    System.out.println("The avarage is " + (num1 + num2) / 2);
        
    }
}