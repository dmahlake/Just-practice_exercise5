import java.util.Scanner;

class exercise6{

    public static void main(String[] args) {

        String product1, product2, product3;
        double price1, price2, price3, custmoney;
        double total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of product 1");
        product1 = scan.next();
        System.out.println("Enter the price of product 1");
        price1 = scan.nextDouble();
        System.out.println("Enter the name of product 2");
        product2 = scan.next();
        System.out.println("Enter the price of product 2");
        price2 = scan.nextDouble();
        System.out.println("Enter the name of product 3");
        product3 = scan.next();
        System.out.println("Enter the price of product 3");
        price3 = scan.nextDouble();

        System.out.println("The total is " + (total = price1 + price2 + price3));

        System.out.println("Now enter the amount paid by the customer");
        custmoney = scan.nextDouble();

        System.out.println("Customer receipt");
        System.out.println("------------------");
        System.out.println("Product 1 " + product1 + " - " + price1);
        System.out.println("Product 2 " + product2 + " - " + price2);
        System.out.println("Product 3 " + product3 + " - " + price3);
        System.out.println("------------------");
        System.out.println("Total - R" + total);
        System.out.println("Paid - R" + custmoney);
        System.out.println("change - R" + (custmoney - total));
        System.out.println("Thank you for purchasing at our store");  
    }
}