package p4_3;

class Song {
	private String title;
	private String artist;
	int length;
	Song(String t, String a, int length) {
		title = t;
		artist = a;
		this.length = length;
	}
	Song() {
		Song("Flower","Jisoo",200);
	}
}
public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song("Outward Bound", "nana", 180);
		Song s4 = new Song();
	}

}
