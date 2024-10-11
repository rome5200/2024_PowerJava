package p5_4;

class Car {
	private String model;
	private String make;
	static int numberOfCars;
	Car() {
		this("G80","Hyundai");
	}
	Car(String m, String make) {
		model = m;
		this.make = make;
	}
	static int getNumberOfCars() {
		return ++numberOfCars;
	}
	@Override
	public String toString() {
		return "total amount = "+getNumberOfCars();
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1);
		Car c2 = new Car("X5","BMW");
		System.out.println(c2);
		Car c3 = new Car("K8","Kia");
		System.out.println(c3);
	}

}
