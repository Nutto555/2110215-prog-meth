package card.base;

import player.Player;

//You CAN modify the first line
public abstract class ItemCard extends Card {
    // Fields
    protected int lpBonus;
    protected int attackBonus;
    protected int defenseBonus;

    // Constructor
    public ItemCard(String name, String description, int lpBonus, int attackBonus, int defenseBonus) {
        super(name, description);
        this.lpBonus = lpBonus;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    // Methods
    public abstract void equipItem(Player player);

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getName() + " \t [Item][HP : " + this.lpBonus
                + " ATK : " + this.attackBonus + " DEF : " + this.defenseBonus + "]";
    }

}