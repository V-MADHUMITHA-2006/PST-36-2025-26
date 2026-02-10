package PST;
public class AsciiValueFromAToZ {
public static void main(String[] args) {
	  AsciiAZ obj = new AsciiAZ();
      obj.printAscii(); 	
}
}
class AsciiAZ {

    void printAscii() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            int ascii = ch;
            System.out.println(ch + " = " + ascii);
        }
    }
}
