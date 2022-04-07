import java.util.Arrays;

public class TestDeck {
    
    public static void main(String[] arg) {

        Integer [] cardNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] cardColor = {"red", "black"};
        String[] cardSuit = {"hearts", "Spade", "dimond", "club"};


        Card newCard = new Card();

            newCard.createDeck(cardNumber, cardColor, cardSuit);

        
    }
}
