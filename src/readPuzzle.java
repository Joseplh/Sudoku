import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readPuzzle {
	private int col;
	private int row;
	private sudokuCell[][] cellGrid;
	protected readPuzzle() {//initialize the variables used
		col = 0;
		row = 0;
		cellGrid = new sudokuCell[9][9];
	}
	protected sudokuCell[][] read(String fileName){
		try{
			File inputFile = new File(fileName);
			Scanner fileReader = new Scanner(inputFile);
			while(fileReader.hasNext())
			switch (fileReader.next().charAt(0)){
			case ','://move to next cell
				col++;
				break;
			case '\n'://reset column to 0 and continue to next line
				col = 0;
				row++;
				break;
			case '1'://sets given position as number and set as "fixed"
				cellGrid[row][col] = new sudokuCell(1);
				break;
			case '2':
				cellGrid[row][col] = new sudokuCell(2);
				break;
			case '3':
				cellGrid[row][col] = new sudokuCell(3);
				break;
			case '4':
				cellGrid[row][col] = new sudokuCell(4);
				break;
			case '5':
				cellGrid[row][col] = new sudokuCell(5);
				break;
			case '6':
				cellGrid[row][col] = new sudokuCell(6);
				break;
			case '7':
				cellGrid[row][col] = new sudokuCell(7);
				break;
			case '8':
				cellGrid[row][col] = new sudokuCell(8);
				break;
			case '9':
				cellGrid[row][col] = new sudokuCell(9);
				break;
			default: return null;//there is an abnormality in the format of the csv file and is rejected
			}
			fileReader.close();
		}catch (FileNotFoundException  err){
			err.printStackTrace();
		}
		return cellGrid;//completed and correct
	}
}
