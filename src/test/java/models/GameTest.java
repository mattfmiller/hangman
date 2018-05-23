package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void constructor_returnsInstantiatedGameClass_true() {
        Game testGame = new Game();
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void newGame_getsAnswerWord_string() {
        Game testGame = new Game();
        assertEquals(true, testGame.getAnswerWord() instanceof String);
    }

    @Test
    public void newGame_getsGuessArray_arrayList() {
        Game testGame = new Game();
        List<Character> testList = new ArrayList<Character>();
        assertEquals(testList, testGame.getGuessArray());
    }
}