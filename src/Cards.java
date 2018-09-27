import java.util.Random;

public class Cards {

    public static void main(String[] strings) {

        Random random = new Random();

        // caster til int
        int cardNumber = random.ints(1, 53).limit(1).findFirst().getAsInt();

        System.out.print("The card you picked is ");
        getFace(cardNumber);

        getSuit(cardNumber);
    }

    private static void getSuit(int cardNumber) {
        if (cardNumber / 13 == 0) {
            System.out.println("Clubs");
        } else if (cardNumber / 13 == 1) {
            System.out.println("Diamonds");
        } else if (cardNumber / 13 == 2) {
            System.out.println("Hearts");
        } else {
            System.out.println("Spades");
        }
    }

    private static void getFace(int cardNumber) {
        if (cardNumber % 13 == 0) {
            System.out.print("Ace of ");
        } else if (cardNumber % 13 == 10) {
            System.out.print("Jack of ");
        } else if (cardNumber % 13 == 11) {
            System.out.print("Queen of ");
        } else if (cardNumber % 13 == 12) {
            System.out.print("King of ");
        } else {
            System.out.print(cardNumber % 13 + " of ");
        }
    }
}