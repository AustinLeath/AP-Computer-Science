public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

	public Card(String s, int f) {
		setSuit(s);
		setFace(f);
	}

	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int f) {
		face = f;
	}

	public String getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public String toString() {
		return (FACES[face] + " of " + suit);
	}

 }
