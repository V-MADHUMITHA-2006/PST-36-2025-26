package PST;
import java.util.Scanner;
public class BinaryToDecimal {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a Binary Number: ");
	        String binary = sc.nextLine();
	        
	        int decimal = Integer.parseInt(binary, 2);
	        
	        System.out.println("Decimal Value: " + decimal);
	        
	        sc.close();
	    }
	}
