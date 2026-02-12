package PST;
import java.util.Scanner;
public class IntToStr {
	public static void main(String [] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the number:");
		        int num = sc.nextInt();
		        String s = "";
		        while (num > 0) {
		            s = (char)(num % 10 + 48) + s;
		            num /= 10;
		        }
		        System.out.println("the string is:"+s);
		    }
		}
	
