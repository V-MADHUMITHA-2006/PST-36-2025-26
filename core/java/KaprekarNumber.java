package PST;
import java.util.Scanner;
public class KaprekarNumber {
   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int square = num * num;
	        String str = Integer.toString(square);

	        int len = str.length();
	        boolean isKaprekar = false;

	        for (int i = 1; i < len; i++) {
	            int part1 = Integer.parseInt(str.substring(0, i));
	            int part2 = Integer.parseInt(str.substring(i));

	            if (part2 != 0 && part1 + part2 == num) {
	                isKaprekar = true;
	                break;
	            }
	        }

	        if (num == 1 || isKaprekar)
	            System.out.println(num + " is a Kaprekar Number");
	        else
	            System.out.println(num + " is NOT a Kaprekar Number");

	        sc.close();
	    }
	}


