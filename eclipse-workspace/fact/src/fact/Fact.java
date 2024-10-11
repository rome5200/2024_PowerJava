package fact;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(10));
	}
	
//	static int fact(int n) {
//		if(n==1)
//			return 1;
//		return n*fact(n-1);
//	}
	
	static int fibo(int n) {
		if(n==1 || n==2)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
	
	
	
	
	
	
	
	
	

}
