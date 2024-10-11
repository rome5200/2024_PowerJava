package power;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 2;
//		int y = 5;
//		int sum = 1;
//		for(int i=1; i<=y; i++)
//			sum = sum * x;
//		System.out.println(sum);
		
		System.out.println(power(2,5));
	}
	static int power(int x, int y) {
		if(y==1)
			return x;
		return x*power(x,y-1);
	}

}
