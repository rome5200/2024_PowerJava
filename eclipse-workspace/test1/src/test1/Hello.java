package test1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(int i=1; i<=100; i++)
//			sum = sum + i;
//		System.out.println(sum);
		
//		int sum = 1;
//		for(int i=1; i<=10; i++)
//			sum = sum * i;
//		System.out.println(sum);
//	}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++)
//				System.out.print(" ");
//			for(int j=1; j<=2*i-1; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//	}
		
//		for(int i=2; i<=100; i++) {
//			int j;
//			for(j=2; j<i; j++)
//				if(i%j == 0)
//					break;
//			if(j==i)
//				System.out.println(i);
//		}
		for(int a=1; a<=100; a++)
			for(int b=1; b<=100; b++)
				for(int c=1; c<=100; c++) {
					if(a*a+b*b==c*c)
						System.out.println(a+"\t"+b+"\t"+c);
					if(a*a+c*c==b*b)
						System.out.println(a+"\t"+b+"\t"+c);
					if(c*c+b*b==a*a)
						System.out.println(a+"\t"+b+"\t"+c);
				}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오렌지 갯수를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.println("필요한 상자수 : "+n/10+" 남은 오렌지 수 : "+n%10);
		
		
		
		
		
		
		
		
	}
}
