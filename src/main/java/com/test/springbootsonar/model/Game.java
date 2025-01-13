package com.test.springbootsonar.model;

public class Game {
	private Board board;
	private String currentTurn;
	
	public Game() {
		board = new Board();
		currentTurn = "white";
	}
	
	public String getCurrentTurn() {
		return currentTurn;
	}
	
	public boolean move(int fromX, int fromY, int toX, int toY) {
		if(board.movePiece(fromX, fromY, toX, toY)) {
			currentTurn = currentTurn.equals("white") ? "black" : "white";
			return true;
		}
		return false;
	}
}
