/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck newDeck = new Deck(ranks, suits, pointValues);
		//orig methods
		System.out.println(newDeck.toString());
		System.out.println(newDeck.isEmpty());
		System.out.println(newDeck.size());
		//card dealing
		System.out.println(newDeck.deal());
		System.out.println(newDeck.toString());
		System.out.println(newDeck.isEmpty());
		System.out.println(newDeck.size());
		for(int i = 0; i<5; i++){
			System.out.println(newDeck.deal());
		}
		//after deck is dealt
		System.out.println(newDeck.toString());
		System.out.println(newDeck.isEmpty());
		System.out.println(newDeck.size());
		System.out.println(newDeck.deal());
	}
}