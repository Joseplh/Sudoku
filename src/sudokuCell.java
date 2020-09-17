
public class sudokuCell {
	private int currentValue;
	private boolean[] possible = {true,true,true,true,true,true,true,true,true};//list of possible values, position+1 = value to check
	private int possibleCount;//this is the number of "true" values in the possible list. If value is set to -1, this cell is marked as complete
	public sudokuCell() {//Constructor that takes in no value and will later be changed
		currentValue = 0;//0 is used as a filler position
		possibleCount = 9;
	}
	public sudokuCell(int fixedValue) {//Constructor that take in a value and sets a completed cell that should never change
		currentValue = fixedValue;
		for(int x=0;x<9;x++) {
			if(x != (fixedValue-1))
				possible[x] = false;
		}
		possibleCount = -1;//-1 in possibleCount marks that this cell is completed
	}
	public int getPossibleCount() {
		//checks if this cell is complete
			countTrue();
		return possibleCount;
	}
	private void countTrue() {//checks if the cell is completed, if not, it will correct the possibleCount
		if(possibleCount != -1) {
			possibleCount = 0;
			for(int x=0;x<9;x++) {
				if(possible[x]) {
					possibleCount++;
				}
			}
		}
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void checkComplete() {//Checks if this cell is complete by checking if the 
		countTrue();
		if(possibleCount==1) {
			possibleCount = -1;
			for(int x=0;x<9;x++) {
				if(possible[x]) {
					currentValue = x+1;
				}
			}
		}
	}
}
