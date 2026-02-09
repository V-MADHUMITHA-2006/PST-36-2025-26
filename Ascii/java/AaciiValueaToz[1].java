package PST;
public class AaciiValueaToz {
	public static void main(String[] args) {
		  Asciiaz obj = new Asciiaz();
	      obj.printAscii(); 	
	}
	}
class Asciiaz {

    void printAscii() {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int ascii = ch;
            System.out.println(ch + " = " + ascii);
        }
    }
}




