package PST;

public class hierarchicalInheritance {

    public static void main(String[] args) {

        classC a = new classC();
        a.method1();
        a.method3();

        classB b = new classB();
        b.method1();
        b.method2();
    }
}

class classA {
    void method1() {
        System.out.println("Class A has 25 students");
    }
}

class classB extends classA {
    void method2() {
        System.out.println("Class B has 13 students");
    }
}

class classC extends classA {
    void method3() {
        System.out.println("Class C has 50 students");
    }
}
