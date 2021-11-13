package deck;


import java.util.Arrays;

import card.base.Card;


public class Deck {
    // TODO: constructor
    // Fields
    private String name;
    private int deckSize;
    private Card[] deckList;

    // Constructor
    public Deck(String name, Card[] deckList) {
        this.name = name;
        this.deckList = deckList;
        this.deckSize = deckList.length;
    }

    // Methods
    public int insertCard(Card card) throws InsertCardFailedException {
        int count = 0;
        for (Card i : deckList) {
            if (card.equals(i)) {
                count++;
            }
        }
        if (count >= 4)
            throw new InsertCardFailedException("You can only put 4 of the same cards into the deck");
        deckSize = deckList.length;
        deckList = Arrays.copyOf(deckList, deckSize + 1);
        deckList[deckSize] = card;
        deckSize++;
        return deckSize;
    }

    //You CAN modify the first line
    public Card removeCard(int slotNumber) throws RemoveCardFailedException {
        if (this.deckList.length <= slotNumber) {
            throw new RemoveCardFailedException("Number you insert exceed deck size");
        }
        if (this.deckList[slotNumber] == null) {
            throw new RemoveCardFailedException("There is no card in that slot");
        }
        deckSize = deckList.length;
        Card[] new_deckList = Arrays.copyOf(deckList, deckSize - 1);
        Card card = deckList[slotNumber];
        System.arraycopy(deckList, 0, new_deckList, 0, slotNumber);
        if (deckSize - (slotNumber + 1) >= 0)
            System.arraycopy(deckList, slotNumber + 1, new_deckList, slotNumber + 1 - 1,
                    deckSize - (slotNumber + 1));
        deckList = new_deckList;
        setDeckSize(deckSize - 1);
        return card;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{").append(this.getName()).append("}")
                .append("(").append(this.getDeckSize()).append(" deck size)")
                .toString();
    }

    /* GETTERS & SETTERS */

    public String getName() {
        return name;
    }

    public Card[] getDeckList() {
        return deckList;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    public int getDeckSize() {
        return deckSize;
    }

}