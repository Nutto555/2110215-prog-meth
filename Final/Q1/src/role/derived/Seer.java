package role.derived;

import game.logic.GameAction;
import game.logic.GameLogic;
import game.object.Card;
import game.object.GameObject;
import role.base.PreTurnActable;
import role.base.Role;

public class Seer extends Role implements PreTurnActable {

    @Override
    public void preTurnActs(GameAction action) {
        GameObject gameObject = action.getInfo(0);
        Card card1 = (Card) gameObject;
        GameObject gameObject1 = action.getInfo(1);
        Card card2 = (Card) gameObject1;
        GameLogic.getInstance().getCurrentRound().swapCards(card1, card2);
    }

    @Override
    public String toString() {
        return "Seer";
    }
}
