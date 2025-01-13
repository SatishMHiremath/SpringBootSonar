package com.test.springbootsonar.model;

public class Board {
	
	private ChessPiece[][] board;
	
	public Board() {
		board = new ChessPiece[8][8];
		initializeBoard();
	}

	private void initializeBoard() {
		
	}
	
	public boolean movePiece(int fromX, int fromY, int toX, int toY) {
		ChessPiece chessPiece = board[fromX][fromY];
		if(chessPiece != null && chessPiece.isValidMove(fromX, fromY, toX, toY)) {
			board[toX][toY] = chessPiece;
			board[fromX][fromY] = null;
			return true;
		}
		return false;	
	}
	
	public ChessPiece getPiece(int x, int y) {
		return board[x][y];
	}	
	
}
