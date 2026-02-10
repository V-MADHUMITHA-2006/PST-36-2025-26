package PST;
import java.util.Scanner;
public class AsciiCharUorL {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter a character:");
    char ch = sc.next().charAt(0);

    UpperorLower obj = new UpperorLower();
    obj.Checkcase(ch);
    sc.close();
}
}
	
 class UpperorLower {
	void Checkcase (char ch) {
		int ascii = (int) ch;
		if (ascii >= 65 && ascii <= 90) {
            System.out.println("Uppercase letter");
        } 
        else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lowercase letter");
        } 
        else {
            System.out.println("Not an alphabet");
        }
	}
	}
	