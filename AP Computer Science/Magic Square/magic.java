import java.util.Scanner;

/**
 * Checks to see if entered numbers are magic.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class magic {
	public void main() {
		boolean magicCall = false;
		System.out.print("\f");
		Scanner keyboard = new Scanner(System.in);
		int val = 0;
		System.out
				.println("Enter the dimensions of the square (ex. 3 = 3x3, 4 = 4x4).");
		int dim = keyboard.nextInt();
		int[][] square = new int[dim][dim];
		System.out.println("Please enter your numbers for the square.");
		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square[r].length; c++) {
				System.out.print((r + 1) + "," + (c + 1) + " = ");
				square[r][c] = keyboard.nextInt();
			}
		}
		magicCall = theMagic(square);
		if (magicCall == true)
			System.out
					.println("The square you entered is magic! WhoOoOoOoOoOoOoOoO...");
		if (magicCall == false)
			System.out
					.println("The square you entered is NOT magic! Booooooooo...");
	}

	public boolean theMagic(int[][] square) {
		boolean magic = true;
		int diag1 = 0;
		int diag2 = 0;
		int sum = 0;
		int colSum = 0;
		int rowSum = 0;
		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square[r].length; c++) {
				colSum += square[r][c];
				rowSum += square[c][r];
			}
		}
		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square[r].length; c++) {
				if (r == c)
					diag1 += square[r][c];
				if ((r + c) == square.length - 1)
					diag2 += square[r][c];
			}
		}
		if ((colSum == rowSum) && (colSum == (diag1 * (square.length)))
				&& (colSum == (diag2 * (square.length)))
				&& (rowSum == (diag1 * (square.length)))
				&& (rowSum == (diag2 * (square.length))) && (diag1 == diag2))
			magic = true;
		else
			magic = false;
		return magic;
	}
}
