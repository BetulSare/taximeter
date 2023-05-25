package taximeter;

import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number of kilometers to go: ");
        double km = scan.nextDouble();
        double price = 10 + 2.20 * km;
        if (price < 20.0) {
            price = 20;
            System.out.println("your price is: " + price);
        } else {
            System.out.println("your price is: " + price);
        }

    }

}
