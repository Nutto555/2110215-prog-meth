package entity;

import entity.base.Consumable;
import entity.base.Entity;
import entity.base.Interactable;
import logic.Sprites;

public class Door extends Entity implements Interactable, Consumable {

    // Methods
    @Override
    public int getSymbol() {
        return Sprites.DOOR;
    }

    @Override
    public boolean interact(Entity e) {
        return e instanceof Key;
    }

    @Override
    public boolean consume(Entity e) {
        if (e instanceof Key) {
            remove();
            return true;
        }
        return false;
    }
}
