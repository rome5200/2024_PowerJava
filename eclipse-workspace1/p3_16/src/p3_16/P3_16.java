package p3_16;

import java.util.Scanner;

public class P3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		for(int i='a'; i<=c; i++) {
			for(int j='a'; j<=i; j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
	}

}
