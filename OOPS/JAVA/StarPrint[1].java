package PST;
import java.util.Scanner;
public class StarPrint {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of stars: ");
	        int n = sc.nextInt();

	        Vertical v = new Vertical();
	        v.method1(n);
	        Horizontal h = new Horizontal();
	        h.method2(n);

	        sc.close();
	    }
}

class Vertical {
    void method1(int n) {
        System.out.println("Vertical Stars:");
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}

class Horizontal {
    void method2(int n) {
        System.out.println("Horizontal Stars:");
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}
