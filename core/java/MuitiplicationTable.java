package PST;
import java.util.Scanner;
public class MuitiplicationTable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num =sc.nextInt();
	for (int i = 1; i <= 10; i++) {
		 int mul = num* i;
		 System.out.println(i+ " x " + num+ " = " + mul);
		 
		 
	}
	sc.close();
	
}
}