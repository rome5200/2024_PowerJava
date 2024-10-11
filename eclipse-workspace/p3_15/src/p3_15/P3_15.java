package p3_15;

public class P3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int count = 0;
		int r, c;
		while(true) {
			r = (int)(Math.random()*3);
			c = (int)(Math.random()*5);
			if(a[r][c] == 0) {
				a[r][c] = 1;
				if(++count == 5)
					break;
			}
		}
		for(r = 0; r<3; r++) {
			for(c=0; c<5; c++)
				System.out.print(a[r][c]+"\t");
			System.out.println();
		}
	}

}
