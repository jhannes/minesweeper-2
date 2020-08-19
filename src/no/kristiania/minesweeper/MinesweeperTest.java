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

    @Test
    void itShouldDisplayCorrectNumberOfRows() {
        assertArrayEquals(
                new String[] { "0", "0", "0" },
                displayBoard(new String[] { ".", ".", "." })
        );
    }

    private String[] displayBoard(String[] input) {
        if (input[0].charAt(0) == '*') {
            return new String[] { "*" };
        }
        String[] board = new String[input.length];
        board[0] = "0";
        return board;
    }
}
