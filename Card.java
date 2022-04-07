
public class Card {

        private Integer number;
        private String color;
        private String suit;
    
    public Card(){
        this.suit = suit;
        this.color = color;
        this.suit = suit;

    }
    // setters and getters
    public Integer getnumber(){
        System.out.println("get this number " + this.number);
        return this.number;
    }

    public void setnumber(Integer number ) {
        this.number = number;
    }


    public String getcolor(){
        System.out.println("get this color  " + this.color);
        return this.color;
    }

    public void setcolor(String color ) {
        this.color = color;
    }

    public String getsuit(){
        System.out.println("get this suit  " + this.suit);
        return this.suit;
    }

    public void setsuit(String suit) {
        this.suit = suit;
    }

    // Methods

    public ArrayList<object> createdDeck(Integer[] cardNumber, String[] cardColor, String[] cardSuit){
        System.out.print("test");
    }
}