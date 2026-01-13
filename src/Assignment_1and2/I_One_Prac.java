package Assignment_1and2;

class E{
	
	void add(int x ,int y) {
		System.out.print("a+b="+x+y);
	}
}
class D extends E{
	
	void add(int c ,int d) {
		System.out.println("c+d ="+ (c+d));
	}
}
public class I_One_Prac {
     
	public static void main(String[] args) {
		E b = new E();
		b.add(5, 6);

	}

}
