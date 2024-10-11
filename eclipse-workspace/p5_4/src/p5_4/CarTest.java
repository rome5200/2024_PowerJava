package p5_4;

class Car {
	private String model;
	private String make;
	static int numberOfCars;
	Car() {
		this("pony","hyundai");
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
		return "total # of cars : "+getNumberOfCars();
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1);
		Car c2 = new Car("X5","BMW");
		System.out.println(c2);
	}

}
