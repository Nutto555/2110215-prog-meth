package entity;

import entity.base.Entity;
import entity.base.Interactable;
import entity.base.Updatable;
import logic.GameController;
import logic.Sprites;

public class Switch extends Entity implements Interactable, Updatable {
    // Field
    private boolean isActive;

    // Constructor
    public Switch() {
        isActive = GameController.getGameSwitchStatus();
    }

    // Methods
    @Override
    public int getSymbol() {
        if (isActive) {
            return Sprites.SWITCH_ON;
        }
        return Sprites.SWITCH_OFF;
    }

    @Override
    public boolean interact(Entity e) {
        if (e instanceof Player) {
            GameController.setGameSwitchStatus(!GameController.getGameSwitchStatus());
        }
        return false;
    }

    @Override
    public void update() {
        isActive = GameController.getGameSwitchStatus();
    }

    @Override
    public void valueCorrection() {
    }

    // Getter & Setter
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
