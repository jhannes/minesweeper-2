package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinesweeperTest {
    @Test
    void itShouldEmptyMinefield() {
        assertArrayEquals(
                new String[] { "0" },
                displayBoard(new String[] { "." })
        );
    }

    @Test
    void itShouldDisplaySingleMine() {
        assertArrayEquals(
                new String[] { "*" },
                displayBoard(new String[] { "*" })
        );
    }

    private String[] displayBoard(String[] input) {
        return new String[] { "0" };
    }
}
