/**Developed by Joseph Maxwell
 * Sudoku is a common puzzle in newspapers across the US.  It is a 9x9 grid of numbers from 1-9.
 * The grid is broken further down into 9 sections of 3x3 block.  To solve the puzzle, the user
 * must enter a number into every grid position and not violate any of the three rules.
 * -There must be only one of every number in each 3x3 block.
 * -There must be only one of every number in each horizontal row
 * -There must be only one of every number in each vertical column
 * @author Joseph Maxwell
 **/
public class Source {

	public static void main(String[] args) {
		/* TODO Open a display for the program with a menu
		* The menu has a display for the current sudoku puzzle and three buttons to the side
		* Menu screen offers 3 options: "Enter New Puzzle", "Solve Existing puzzle", and Exit 
		* "Enter New Puzzle" replaces menu with a new screen that has a text box and two buttons
		* The text box allows the user to enter the address to a .csv used to store a puzzle
		* The two buttons are to confirm and cancel, confirm has the program read into memory the puzzle
		* */
		
		/* TODO Method to take in a String and read into memory a .csv file formatted to fit a sudoku board
		 * Needs filter for the String to check for a valid file
		 * Needs filter to check .csv file contains a valid sudoku problem
		 * */
		
		/* TODO Method to hold a 9x9 grid of cells that store it's current value, possible legal values, and number of legal values
		 * */
		
		/* TODO Method to loop through the 9x9 grid and
		 * */
		
		/* TODO Method to check vertical column for invalid numbers
		 * */
		
		/* TODO Method to check horizontal column for invalid numbers
		 * */
		
		/* TODO Method to check host block for invalid numbers
		 * */
		
		/* TODO Method to resolve logical leaps in puzzle.  
		 * An example case would be where there are no cells with 1 possibility to lock-in.
		 * Here the program should call this method to take one cell with 2 possibilities and attempt to solve one with the first value
		 * Returns true/false
		 * false has method repeat with other value.
		 * true inserts correct value in cell.
		 * */
	}

}
