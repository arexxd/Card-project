/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("10", "Clubs", 20);
		System.out.println("card");
		System.out.println(card.suit());
		System.out.println(card.rank());
		System.out.println(card.pointValue());
		System.out.println(card.toString());
		
		Card card2 = new Card ("4", "Clubs", 8);
		System.out.println("card2");
		System.out.println(card2.suit());
		System.out.println(card2.rank());
		System.out.println(card2.pointValue());
		System.out.println(card2.toString());

	}
}