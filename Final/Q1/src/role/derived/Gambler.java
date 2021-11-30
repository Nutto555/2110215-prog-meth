package role.derived;

import game.logic.GameAction;
import game.object.GameObject;
import game.object.Player;
import role.base.PreRoundActable;
import role.base.PreTurnActable;
import role.base.Role;

public class Gambler extends Role implements PreRoundActable, PreTurnActable {


    public void preRoundActs(GameAction action) {
        for (int i = 0; i < action.length; i++) {
            GameObject gameObject = action.getInfo(i);
            Player player = (Player) gameObject;
            player.setOrder(i);
        }
    }

    public void preTurnActs(GameAction action) {
        for (int i = 0; i < action.length; i++) {
            GameObject gameObject = action.getInfo(i);
            Player player = (Player) gameObject;
            player.setToBeSwapped(true);
        }
    }

    @Override
    public String toString() {
        return "Gambler";
    }
}
