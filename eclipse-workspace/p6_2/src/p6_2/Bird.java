package p6_2;

class Animal {
	void walk() {
		System.out.println("walk");
	}
}

public class Bird extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
