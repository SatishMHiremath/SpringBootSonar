package com.test.springbootsonar.service;

public interface ChessService {

	public String startGame();

	public String movePiece(int fromX, int fromY, int toX, int toY);

}
