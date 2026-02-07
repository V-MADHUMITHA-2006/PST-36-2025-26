package PST;

public class InhertanceEx1 {
	public static void main(String[] args) {
	cherry a=new cherry();
	a.colors();
	a.color();

}
	}
class fruit{
	void colors() {
		System.out.println("Most of the fruits color is Green");
	}
}
class cherry extends fruit{
	void color() {
		System.out.println("Cherry color is red");
	}
}
