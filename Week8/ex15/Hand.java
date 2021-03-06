package Week8.ex15;

import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> myHand;              // 15.2

    public Hand() {
        this.myHand = new ArrayList<Card>();
    }

    public void add(Card card) {            // 15.2
        this.myHand.add(card);
    }

    public void print() {                   // 15.2

        for (Card card : this.myHand) {
            System.out.println(card);
        }
    }

    public void sort() {                    // 15.3
        Collections.sort(this.myHand);
    }

    public List<Card> returnHand() {        // 15.4 add-on
        return this.myHand;
    }

    @Override
    public int compareTo(Hand hand) {       // 15.4
        int comparison = 0;
        int theirHand = 0;

        for (Card card : this.myHand) {                                     // get values of our hand
            comparison = comparison + card.getValue();
        }

        for (Card theirCard : hand.returnHand()) {                          // get values of hand to be compared to
            theirHand = theirHand + theirCard.getValue();
        }

        return comparison - theirHand;
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();

        Collections.sort(this.myHand, sorter);

        this.print();
    }
}

