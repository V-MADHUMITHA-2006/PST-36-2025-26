package PST;
import java.util.Scanner;
public class StrToCharex1 {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a String: ");
	        String str = sc.nextLine();
	        
	        char[] charArray = str.toCharArray();
	        
	        System.out.println("Character Array:");
	        for(char c : charArray) {
	            System.out.print(c + " ");
	        }
	        
	        sc.close();
	    }
	}

