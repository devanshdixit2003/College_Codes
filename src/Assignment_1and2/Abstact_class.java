package Assignment_1and2;
abstract class E1{
	abstract void show();
	abstract void dis();
	
}
 class F extends E1{
	public void show() {
		System.out.print("this  is class B ");
	}
	public void dis() {
		System.out.println("this is dis method of class B");
	}
}
public class Abstact_class {

	public static void main(String[] args) {
		F f = new F();
		f.show();
		f.dis();

	}

}
