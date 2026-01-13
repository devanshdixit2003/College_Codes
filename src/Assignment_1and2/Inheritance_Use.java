package Assignment_1and2;

class A{
	int x;
	A(int x){
		this.x=x;
	}
}

class B extends A{
	int y;
	int x;
       B(int x,int z){
    	   super (78);
    	   this.y =x;
    	   this.x = z;
       }
}



public class Inheritance_Use {
      
	public static void main(String[] args) {
		B b =  new B(2,5);
	 System.out.println(b.y+"   "+b.x);
	    System.out.println(b.x);
	}

}
