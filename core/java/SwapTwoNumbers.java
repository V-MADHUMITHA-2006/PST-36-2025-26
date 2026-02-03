package PST;
import java.util.Scanner;
public class SwapTwoNumbers {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a = sc.nextInt();
	System.out.println("Enter the value of b:");
	int b = sc.nextInt();
	 a = a+b;
	  b=a-b;
	  a=a-b;
System.out.print("After swapping  the value of a: "+a);
sc.close();
}
}
