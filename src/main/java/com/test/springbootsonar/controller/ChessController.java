package com.test.springbootsonar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.springbootsonar.model.Game;
import com.test.springbootsonar.service.ChessService;

@RestController
@RequestMapping("api/chess")
public class ChessController {

	private Game game = null;
	private ChessService chessService= null;
	
	public ChessController() {
		this.chessService = chessService;
	}
	
	@PostMapping("/start")
	public String startGame() {
		return chessService.startGame();
	}

	@PostMapping("/move")
	public ResponseEntity<String> moviePiece(@RequestParam int fromX, @RequestParam int fromY, @RequestParam int toX, @RequestParam int toY) {
		String result = chessService.movePiece(fromX, fromY, toX, toY);
		if(!result.equals("Invalid Move!")) {
			return ResponseEntity.ok(result);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Move!");
		}
	}
}
