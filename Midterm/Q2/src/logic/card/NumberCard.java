package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

public class NumberCard extends BaseCard {
    public NumberCard(CardColor color, CardSymbol symbol) {
        super(color);
        setSymbol(symbol);
    }

    @Override
    public void play() {
        GameLogic.getInstance().setTopCard(this);
    }

    public boolean ruleCheck() {
        return GameLogic.getInstance().getTopCard().getColor() == getColor() || GameLogic.getInstance().getTopCard().getSymbol() == getSymbol();
    }
}
