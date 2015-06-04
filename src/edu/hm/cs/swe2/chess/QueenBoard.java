package edu.hm.cs.swe2.chess;

public class QueenBoard {

	boolean[][] board;
	int[] queens;

	public QueenBoard(int size) {
		board = new boolean[size][size];
		queens = new int[size];
		initBoard(board);
		initQueens(queens);

	}

	public static void initBoard(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = false;
			}

		}

	}

	public static void initQueens(int[] queens) {
		for (int i = 0; i < queens.length; i++) {
			queens[i] = 0;
		}

	}

	public static boolean isVertical(int x, boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][x]) {
				return false;
			}

		}

		return true;

	}

	public static boolean validateDiagonal(int x, int y, boolean[][] board) {

		for (int ver = 0; ver < y; ver++) {
			for (int hor = 0; hor < board.length; hor++) {
				if ((Math.abs(x - hor) == Math.abs(y - ver)) && board[ver][hor]) {
					return false;
				}

			}

		}

		return true;
	}

	public static void printBoard(boolean[][] board) {
		String output = "";

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				output += board[i][j] + "\t";

			}

			output += "\n";
		}
		System.out.println(output);

	}

	public static boolean validatePosition(int x, int y, boolean[][] board) {
		if (validateDiagonal(x, y, board) && isVertical(x, board)) {
			return true;
		} else {
			return false;
		}
	}
}
