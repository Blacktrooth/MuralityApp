import apple.laf.JRSUIConstants;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of your project?");
        double length = scanner.nextDouble();
        System.out.println("The length of this project is " + length);
        System.out.println("What is the width of your project?");
        double width = scanner.nextDouble();
        System.out.println("The width is this project is " + width);
        System.out.println("What is your price per square foot.");
        double price = scanner.nextDouble();
       //* System.out.println("The cost of your project is " + price * (length * width)); *//

        Equations equations = new Equations();

        equations.proSize(length , width);
        equations.projCost(price,length,width);











    }
}
