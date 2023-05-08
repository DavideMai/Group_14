
public class Assegnare_punteggi {

	// create a 2D array to represent the board with 5 rows and 6 columns
	int[][] board = new int[5][6];

	// fill the board with cards of different colors
	// assume 0 represents no card, 1 represents blue, 2 represents green, etc.
	board[0] = new int[]{0, 1, 2, 3, 4, 5};
	board[1] = new int[]{0, 2, 3, 4, 5, 1};
	board[2] = new int[]{0, 3, 4, 5, 1, 2};
	board[3] = new int[]{0, 4, 5, 1, 2, 3};
	board[4] = new int[]{0, 5, 1, 2, 3, 4};

	// check each row for sets of 3 matching colors
	for (int row = 0; row < 5; row++) {
	    int[] colors = new int[6];
	    for (int col = 0; col < 6; col++) {
	        colors[board[row][col]]++;
	    }
	    for (int color = 1; color < 7; color++) {
	        if (colors[color] >= 3) {
	            System.out.println("Player gets 2 points for " + colors[color] + " " + color + " cards in row " + row);
	        }
	    }
	}

	// check each column for sets of 3 matching colors
	for (int col = 0; col < 6; col++) {
	    int[] colors = new int[6];
	    for (int row = 0; row < 5; row++) {
	        colors[board[row][col]]++;
	    }
	    for (int color = 1; color < 7; color++) {
	        if (colors[color] >= 3) {
	            System.out.println("Player gets 2 points for " + colors[color] + " " + color + " cards in column " + col);
	        }
	    }
	}

	// Set the point value
	int points = 0;

	// Loop to check every row and column in the board
	for (int i = 0; i < 6; i++) { // 6 Rows
	    for (int j = 0; j < 5; j++) { // 5 columns
	        // Verifies that the cards are in the same row or column and are adjacent
	        if (cards[i][j].getColor() == cards[i][j+1].getColor() && cards[i][j+1].getColor() == cards[i][j+2].getColor()) {
	            // Point value increased by 2
	            points += 2;
	        } else if (cards[i][j].getColor() == cards[i+1][j].getColor() && cards[i+1][j].getColor() == cards[i+2][j].getColor()) {
	            // Point value increased by 2
	            points += 2;
	        }
	    }
	}

	// Returns the points collected
	return points;

    }
