package edu.hm.cs.swe2.chess;

public class Main {

	public static void main(String[] args) {

		int lenght = 6;

		boolean[][] board = new boolean[lenght][lenght];
		QueenBoard.printBoard(board);
		board[1][1] = true;
		QueenBoard.printBoard(board);
		System.out.println(QueenBoard.isVertical(0, board));
		System.out.println(QueenBoard.isVertical(1, board));
		System.out.println(QueenBoard.isVertical(2, board));
		System.out.println("Diagonaltest: " + QueenBoard.validateDiagonal(1, 2, board) );
		System.out.println("Diagonaltest: " + QueenBoard.validateDiagonal(3, 3, board) );
		System.out.println("Diagonaltest: " + QueenBoard.validateDiagonal(2, 2, board) );

	}

}
