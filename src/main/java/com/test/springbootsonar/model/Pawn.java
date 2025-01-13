package com.test.springbootsonar.model;

public class Pawn extends ChessPiece {

	public Pawn(String color, String type) {
		super(color, type);
	}

	public Pawn(String color) {
		super(color, "Pawn");
	}
	
	@Override
	public boolean isValidMove(int fromX, int fromY, int toX, int toY) {
		return true;
	}

}
