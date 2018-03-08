/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("four", "hearts", 6);
		Card card2 = new Card("six", "spades", 3);
		Card card3 = new Card("queen", "diamonds", 9);
		System.out.println("Card 1 suit is " + card1.suit());
		System.out.println("Card 2 rank is " + card2.rank());
		System.out.println("Card 3 point value is " + card3.pointValue());
		if (card1.matches(card1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		card1.toString();
	}
}
