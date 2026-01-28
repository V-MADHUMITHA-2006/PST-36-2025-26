package PST;
import java.util.Scanner;

public class Charcount {

	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");

	        String str = sc.nextLine();

	        System.out.println("Total characters: " + str.length());

	        sc.close();
	    }
	}

