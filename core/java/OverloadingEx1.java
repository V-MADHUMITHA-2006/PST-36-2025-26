package PST;

import java.util.Scanner;

public class OverloadingEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Do you want to add third number? (yes=1 / no=0): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter third number: ");
            int d = sc.nextInt();
            System.out.println("Sum = " + c.add(a, b, d));
        } else {
            System.out.println("Sum = " + c.add(a, b));
        }

        sc.close();
    }
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
