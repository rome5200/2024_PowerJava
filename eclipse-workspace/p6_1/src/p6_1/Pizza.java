package p6_1;

class Circle {
	protected int radius;
	public Circle(int r) {
		radius = r; 
	}
}

public class Pizza extends Circle {
	String name;
	Pizza(String name, int size) {
		super(size);
		this.name = name;
	}
	void print() {
		System.out.println("피자의 종류:"+name+"피자의크기:"+radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("pepperoni",20);
		obj.print();
	}

}
