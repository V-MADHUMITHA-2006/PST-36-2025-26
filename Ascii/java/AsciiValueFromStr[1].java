package PST;
import java.util.Scanner;
public class AsciiValueFromStr {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        AsciiString obj = new AsciiString(); 
	        obj.printAscii(str); 
	    }
	}
class AsciiString {
    void printAscii(String str) {

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = ch;

            System.out.println(ch + " = " + ascii);
        }
    }
}

