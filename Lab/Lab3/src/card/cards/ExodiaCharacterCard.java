package card.cards;

import card.base.CharacterCard;
import card.base.ItemCard;
import player.Player;

//You CAN modify the first line
public class ExodiaCharacterCard extends CharacterCard {
    // Constructor
    public ExodiaCharacterCard() {
        super("Exodia the Forbidden One", "With 4 or more Exodia Part Card equiped, you win the game",
                800, 0, 25);
    }

    // Methods
    public boolean winConditionCheck(ItemCard[] inventory) {
        int count = 0;
        for (ItemCard i : inventory) {
            if (i instanceof ExodiaPartCard) {
                count++;
            }
        }
        return count >= 4;
    }

    @Override
    public int sacrifice(Player player) {
        int healLP = player.getMaxLifePoint() / 10;
        player.healPlayer(healLP);
        return healLP;
    }

}