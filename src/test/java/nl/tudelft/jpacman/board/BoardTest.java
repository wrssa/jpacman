package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class contains a set of test methods for testing the functionality of Board class.
 * It uses JUnit testing framework to verify various aspects of the Board class, including
 * board setup, size, invariants, and square retrieval.
 */
public class BoardTest {
    private Board board;

    /**
     * Set up the test environment before each test case.
     * Initializes a 1x1 grid with a basic square and creates a Board instance.
     */
    @BeforeEach
    public void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    /**
     * Test to ensure that the board object is not null after setup.
     */
    @Test
    public void boardTest() {
        assertNotNull(board);
    }

    /**
     * Test to check the size of the board (height and width).
     * Verifies that the height and width of the board are both equal to 1.
     */
    @Test
    public void boardSizeTest() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    /**
     * Test to verify the invariant of the board.
     * Checks if the board satisfies its invariant, which is a property or condition
     * that must always be true for the board to be considered in a valid state.
     */
    @Test
    void invariantTest() {
        assertTrue(board.invariant());
    }

    /**
     * Test the squareAt method to ensure it returns the correct square.
     * Sets up a board with a null square at (0, 0) and checks if the squareAt method
     * returns null for that position.
     */
    @Test
    public void squareAtTest() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
