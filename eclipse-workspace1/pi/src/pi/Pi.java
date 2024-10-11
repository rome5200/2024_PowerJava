package pi;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double sign = 1;
		for(int i=1; i<=1000000; i++) {
			sum = sum + sign/(2*i-1);
			sign = -sign;
		}
		System.out.println(4*sum);
	}

}
