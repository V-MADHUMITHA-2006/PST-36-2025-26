package PST;
import java.util.Scanner;
public class StrToChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		char ch=str.charAt(0);
		System.out.println("Character is:"+ch);
	}

}
