package com.test.springbootsonar.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChessServiceTest {

    private ChessServiceImpl chessServiceImpl;	

    @BeforeEach
    void setUp() {
    	chessServiceImpl = new ChessServiceImpl();
    }
    
    @Test
    void testStartGame() {
        String result = chessServiceImpl.startGame();
        assertNotNull(result);
        assertTrue(result.contains("Game started! Its white turn."));
    }

    @Test
    void testMovePiece_ValidMove() {
        chessServiceImpl.startGame();
    	String result = chessServiceImpl.movePiece(1, 0, 2, 0);   
        assertNotNull("Piece moved! Its now black turn", result);
    }
    
    @Test 
    void testMovePiece_InvalidMove() {
    	chessServiceImpl.startGame();
    	String result = chessServiceImpl.movePiece(1, 0, 3, 0);
    	assertEquals("Invalid Move!", result);
    }
    
//    @Test
//    void testCurrentStatus() {
//    	chessServiceImpl.startGame();
//    	chessServiceImpl.getClass().getCurrentStatus();
//    	assertNotNull(status);
//    }
}
