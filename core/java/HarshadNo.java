package PST;
import java.util.Scanner;
public class HarshadNo {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number: ");
	int num=sc.nextInt();

    int originalNum = num;
    int sum = 0;
   
    while (num > 0) {
        int digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }
   
    if (originalNum % sum == 0) {
        System.out.println(originalNum + " is a Harshad Number");
    } else {
        System.out.println(originalNum + " is NOT a Harshad Number");
    }
    
    sc.close();
}
}
	

