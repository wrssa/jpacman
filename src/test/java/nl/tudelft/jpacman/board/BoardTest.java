package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    @BeforeEach
    public void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    @Test
    public void boardTest(){
        assertNotNull(board);
    }

    @Test
    public void boardSizeTest(){
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    @Test
    void invariantTest(){
        assertTrue(board.invariant());
    }

    @Test
    public void squareAtTest(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isNull();
    }

}
