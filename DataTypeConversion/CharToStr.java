package PST;
import java.util.Scanner;
public class CharToStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch = sc.next().charAt(0);	
		String str=ch+"";
		System.out.println("String value is:"+str);
	}

}
