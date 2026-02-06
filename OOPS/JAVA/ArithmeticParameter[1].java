package PST;
	 class Arithmetic {

		    public static int add(int g, int h) {
		        return g+ h;
		    }

		    public static int sub(int g, int h) {
		        return g - h;
		    }

		    public static int mul(int g, int h) {
		        return g * h;
		    }

		    public static int div(int g, int h) {
		        return g / h;   
		    }

		    public static int mod(int g, int h) {
		        return g % h;
		    }
		public class ArithmeticParameter {
		    public static void main(String[] args) {
		        int a = 10, b = 20;

		        System.out.println( add(a, b));
		        System.out.println( sub(a, b));
		        System.out.println( mul(a, b));
		        System.out.println(div(a, b));
		        System.out.println(mod(a, b));
		    }
		}
		}


