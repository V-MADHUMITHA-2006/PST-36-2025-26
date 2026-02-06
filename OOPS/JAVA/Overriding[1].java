package PST;
	class ClassA {
	    void IT() {
	        System.out.println("Information Technology");
	    }
	}

	class ClassB extends ClassA {
	    void IT() {
	        System.out.println("Computer Science Engineering");
	    }
	}

	public class Overriding {
	    public static void main(String[] args) {
	        ClassB obj1 = new ClassB();
	        obj1.IT();  
	         
	    }
	}



