package PST;

	class PL{

		public static void method1(){
			
			System.out.println("Java");
			method1a();
			method1b();
			method1c();
			 
		}
		public static void method1a(){
			
			System.out.println("Python");
			}
		public static void method1b(){
			System.out.println("C++");
			 
		}
		public static void method1c(){
			System.out.println("JavaScript");
			 
		}
		}
	public class Programminglnguage {
		public static void main(String[] args){
			PL obj=new PL();
			obj.method1();
			
			DB obj1=new DB();
			obj1.method2();
			
			
		}
    }
		
		class DB{
			public static void method2(){
				
				System.out.println("SQL");
				method2a();
				method2b();
				method2c();
				 
			}
			public static void method2a(){
				
				System.out.println("NOSQL");
				}
			public static void method2b(){
				System.out.println("MYSQL ");
				 
			}
			public static void method2c(){
				System.out.println("ORACLE");
				 
			}
			
	}

