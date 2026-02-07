package PST;

public class MathOverloading {
	  public static void main(String[] args) {
		  MathOperation m = new MathOperation();

	        System.out.println(m.add(5, 3));
	        System.out.println(m.add(5, 3, 2));
	    }

}
class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
   