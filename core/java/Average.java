package PST;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int total = n1 + n2 + n3;
        float avg = total / 3.0f;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        sc.close();
    
    }
}

