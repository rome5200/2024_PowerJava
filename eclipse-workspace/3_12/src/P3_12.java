import java.util.Scanner;

public class P3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int sum= 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if((a[count] = sc.nextInt())==-1)
				break;
			sum = sum + a[count++];
		}
		System.out.println("sum = "+sum+" average = "+(double)sum/count);
	}
}





