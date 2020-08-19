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

    @Test
    void itShouldDisplayCorrectNumberOfColumns() {
        assertArrayEquals(
                new String[] {"000"},
                displayBoard(new String[] {"..."})
        );
    }

    @Test
    void itDisplaysSeveralMines() {
        assertArrayEquals(
                new String[] {"***", "***"},
                displayBoard(new String[] {"***", "***"})
        );
    }



    private String[] displayBoard(String[] input) {
        if (input[0].charAt(0) == '*') {
            return new String[] { "*" };
        }
        String[] board = new String[input.length];
        for (int row = 0; row < board.length; row++) {
            String rowString = "";
            for (int column = 0; column < input[row].length(); column++) {
                rowString += "0";
            }
            board[row] = rowString;
        }
        return board;
    }
}
