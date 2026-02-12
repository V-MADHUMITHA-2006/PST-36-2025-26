package PST;
import java.util.Scanner;
public class StrToInt {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number in string:");
	        
	   String str = sc.nextLine();
	    int num = 0;
	        
	   for(int i = 0; i < str.length(); i++) {
	     num = num * 10 + (str.charAt(i) - 48);
	        }
	        
	      System.out.println("Integer value is: " + num);
	    }

	    }
  

