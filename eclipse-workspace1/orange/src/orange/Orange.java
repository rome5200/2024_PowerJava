package orange;

import java.util.Scanner;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("갯수를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.println("total box = "+n/10+" remainder = "+n%10);
	}

}
