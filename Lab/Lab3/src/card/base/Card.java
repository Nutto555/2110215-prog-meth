package card.base;

import java.util.Objects;

//You CAN modify the first line
public abstract class Card {
    // Fields
    private String name;
    private String description;

    // Constructor
    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Methods
    public abstract String toString();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(description, card.description);
    }

}