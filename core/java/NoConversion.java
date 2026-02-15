package PST;
import java.util.Scanner;
public class NoConversion {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter an Integer: ");
	        int num = sc.nextInt();
	        
	        String binary = Integer.toBinaryString(num);
	        
	        String octal = Integer.toOctalString(num);
	        
	        String hexadecimal = Integer.toHexString(num);
	        
	        System.out.println("Binary Value: " + binary);
	        System.out.println("Octal Value: " + octal);
	        System.out.println("Hexadecimal Value: " + hexadecimal);
	        
	        sc.close();
	    }
	}	
