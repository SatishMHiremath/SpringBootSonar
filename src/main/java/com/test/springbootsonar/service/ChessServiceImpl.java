package com.test.springbootsonar.service;

import org.springframework.stereotype.Service;

import com.test.springbootsonar.model.Game;

@Service
public class ChessServiceImpl implements ChessService {

	private Game game; 
	
	public ChessServiceImpl() { 
		this.game = new Game(); 
	}
	
	@Override
	public String startGame() {
		game = new Game();
		return "Game started! Its "+game.getCurrentTurn()+ " turn.";
	}

	@Override
	public String movePiece(int fromX, int fromY, int toX, int toY) {
		if(game.move(fromX, fromY, toX, toY)) {
			return "Piece Moved! Its now "+game.getCurrentTurn()+"turn";
		}else {
			return "Invalid Move!";
		}
	}
	
}
