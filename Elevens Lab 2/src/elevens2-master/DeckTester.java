/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"King", "Jack", "Queen"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] values1 = {5, 9, 8};
		Deck deck1 = new Deck(rank1, suit1, values1);
		String[] rank2 = {"4", "A", "7"};
		String[] suit2 = {"Clubs", "Hearts", "Spades"};
		int[] values2 = {2, 11, 8};
		Deck deck2 = new Deck(rank2, suit2, values2);
		String[] rank3 = {"5", "2", "3"};
		String[] suit3 = {"Diamonds", "Clubs", "Spades"};
		int[] values3 = {4, 1, 6};
		Deck deck3 = new Deck(rank3, suit3, values3);
		System.out.println("Deck 1 has " + deck1.size() + " cards.");
		System.out.println("Deck 2 has " + deck2.size() + " cards");
		System.out.println("Deck 3 dealt card " + deck2.deal());
}
	}
