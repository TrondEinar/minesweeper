package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {

    @Test
    void itShowsEmptyMineFields(){
    assertArrayEquals(new String[] { "000", "000" }, displayMinefield(new String[] {"...", "..."}));
    }

    private String[] displayMinefield(String[] input) {
        return new String[0];
    }

}