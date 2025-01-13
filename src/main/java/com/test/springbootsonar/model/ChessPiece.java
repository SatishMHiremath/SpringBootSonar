package com.test.springbootsonar.model;

public abstract class ChessPiece {
	protected String color;
	protected String type;
	
	public ChessPiece(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	public abstract boolean isValidMove(int fromX, int fromY, int toX, int toY);

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
