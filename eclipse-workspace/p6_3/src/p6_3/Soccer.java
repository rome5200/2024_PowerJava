package p6_3;

class Sports {
	String getName() {
		return "not decided";
	}
	int getPlayers() {
		return 0;
	}
}

public class Soccer extends Sports {
	@Override
	String getName() {
		return "Football";
	}
	@Override
	int getPlayers() {
		return 11;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
