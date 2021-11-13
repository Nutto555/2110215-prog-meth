package test.base;

import logic.GameController;
import org.junit.jupiter.api.BeforeEach;

public class GameTest {


    @BeforeEach
    protected void setUpBeforeEachTest() {
        String[][] testMap =
                {{"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
        GameController.IntializeMap(testMap, 1, 1); //Reset the Board
    }

}
