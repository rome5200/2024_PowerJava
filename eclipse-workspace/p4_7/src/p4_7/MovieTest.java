package p4_7;

class Movie {
	String title;
	String author;
	int year;
	String actor;
	double rate;
	Movie(String t, String a, int y, String actor, double r) {
		title = t;
		author = a;
		year = y; 
		this.actor = actor;
		rate = r;
	}
}
public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie("tiffany","Edwards",1962,
				"Hepburn",8.43);
	}

}
