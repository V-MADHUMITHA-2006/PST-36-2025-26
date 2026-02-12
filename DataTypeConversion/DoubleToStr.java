package PST;
import java.util.Scanner;
public class DoubleToStr{
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a double number: ");
	        double num = sc.nextDouble();
            int val = (int) num;   
	        String str = "";

	        if (val == 0) {
	            str = "0";
	        }

	        while (val > 0) {
	            int digit = val % 10;

	            char ch = (char) (digit + 48);

	            str = ch + str;
	            val = val / 10;
	        }

	        System.out.println("String value: " + str);
	    }

}