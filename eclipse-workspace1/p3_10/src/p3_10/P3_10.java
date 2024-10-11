package p3_10;

public class P3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d = {1., 2., 3., 4.};
		double max = d[0];
		for(int i=1; i<d.length; i++)
			if(max<d[i])
				max = d[i];
		System.out.println("max = "+max);
	}

}
