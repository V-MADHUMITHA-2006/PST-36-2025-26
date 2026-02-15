package PST;
import java.util.Scanner;
public class DeciamlToBinary {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a Decimal Number: ");
	        int num = sc.nextInt();
	        
	        String binary = Integer.toBinaryString(num);
	        
	        System.out.println("Binary Value: " + binary);
	        
	        sc.close();
	    }
	}
