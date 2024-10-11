package hello;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello, world!");
		
//		int sum = 0;
//		for(int i=1; i<=100; i++)
//			sum = sum + i;
//		System.out.println(sum);
		
//		int sum = 1;
//		for(int i=1; i<=10; i++)
//			sum = sum * i;
//		System.out.println(sum);
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++)
//				System.out.print(" ");
//			for(int j=1; j<=2*i-1; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++)
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			System.out.println();
//		}
		
//		for(int c='A'; c<='Z'; c++)
//			System.out.println((char)c);
		
		for(int i=2; i<=100; i++) {
			int j;
			for(j=2; j<i; j++)
				if(i%j==0)
					break;
			if(i==j)
				System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
