package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {

    @Test
    void itShowsEmptyMineFields(){
    assertArrayEquals(new String[] { "000", "000" }, displayMinefield(new String[] {"...", "..."}));
    }

    @Test
    void itShowsCorrectNumberOfRows() {
        assertArrayEquals(new String[] {"000" , "000" , "000"} ,
                displayMinefield(new String[] {"..." , "..." , "..."}));
    }

    @Test
    void itShowsCorrectNumberOfColumns() {
        assertArrayEquals(
                new String[] { "0000" },
                displayMinefield(new String[] {"...."})
        );
    }

    private String[] displayMinefield(String[] input) {
        String[] result = new String [input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = "000";
            
        }
        return result;
    }

}