import java.util.Random;
    public class Card
    {
    private static Random generator = new Random();
    public final static int spades = 0,hearts = 1, diamonds = 2, clubs = 3;
    public final static int ace = 1, jack= 11, queen = 12, king= 13;
    private int suit;
    private int value;
    
    public Card ()
    {
    value = generator.nextInt(13) + 1;
    suit = generator.nextInt(4) + 1;
    }
    
    public Card (int theValue, int theSuit)
    {
    value = theValue;
    suit = theSuit;
    }
    public String getSuit()
    {
    if (suit==1)
    return "spades";
    else if (suit==2)
    return "hearts";
    else if (suit==3)
    return "diamonds";
    else if (suit==4)
    return "clubs";
    return "error" + suit;
    }
    public String getValue()
    {
    if (value==1)
    return "ace";
    if (value==2)
    return "2";
    if (value==3)
    return "3";
    if (value==4)
    return "4";
    if (value==5)
    return "5";
    if (value==6)
    return "6";
    if (value==7)
    return "7";
    if (value==8)
    return "8";
    if (value==9)
    return "9";
    if (value==10)
    return "10";
    else if (value==11)
    return "jack";
    else if (value==12)
    return "queen";
    else if (value==13)
    return "king";
    return "error" + value ;
    }
    public String toString()
    {
    return getSuit() + " " + getValue();
    }
    
    public static void main(String s[])
    {
        for (int i=1; i< 6; i++)
           {
            Card c= new Card();
            System.out.println("card " + c);
           }
    }
    }