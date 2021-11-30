package role.derived;

import game.logic.GameAction;
import game.object.Card;
import game.object.GameObject;
import role.base.PreRoundActable;
import role.base.Role;

public class Master extends Role implements PreRoundActable {

    @Override
    public void preRoundActs(GameAction action) {
        for (int i = 0; i < action.length; i++) {
            GameObject gameObject = action.getInfo(i);
            Card card = (Card) gameObject;
            card.setSlot(i);
        }
    }

    @Override
    public String toString() {
        return "Master";
    }
}
