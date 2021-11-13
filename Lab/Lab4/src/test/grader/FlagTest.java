package test.grader;

import entity.Box;
import entity.Flag;
import entity.Player;
import logic.GameController;
import logic.Sprites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.base.GameTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlagTest extends GameTest {

    Flag test;

    @BeforeEach
    protected void setUpBeforeEachTest() {
        super.setUpBeforeEachTest();
        test = new Flag();

    }

    @Test
    void testGetSymbol() {
        assertEquals(Sprites.FLAG, test.getSymbol());
    }

    @Test
    void testInteract_Player() {
        //Player can collect flag
        assertEquals(true, test.interact(new Player()));
        //The game is win
        assertEquals(true, GameController.isGameWin());
    }

    @Test
    void testInteract_Box() {
        //Box cannot collect flag
        assertEquals(false, test.interact(new Box()));
        //The game must not win
        assertEquals(false, GameController.isGameWin());
    }

}
