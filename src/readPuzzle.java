import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readPuzzle {
	private int counter = 0;
	private char nextChar;
	protected boolean readPuzzle(String fileName){
		try{
			File inputFile = new File(fileName);
			Scanner fileReader = new Scanner(inputFile);
			while(fileReader.hasNext())
			switch (fileReader.next().charAt(0)){
			case ','://move to next cell
				break;
			case '\n'://reset counter to 0 and continue to next line
				break;
			case '1'://sets given position as number and set as "fixed"
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				break;
			case '5':
				break;
			case '6':
				break;
			case '7':
				break;
			case '8':
				break;
			case '9':
				break;
			default: return false;//there is an abnormality in the format of the csv file and is rejected
			}
			fileReader.close();
		}catch (FileNotFoundException  err){
			err.printStackTrace();
		}
		return false;//this return statement should only occur if there is a critical failure
	}
}
