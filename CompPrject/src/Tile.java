
public class Tile {
	//Element and attriubutes for a tile
	boolean isMined;
	boolean isMarked;
	boolean isHidden;
	int adjMines;
	int cordX;
	int cordY;
	
	Tile(){
		isMined = false;
		isMarked = false;
		isHidden = true;
		adjMines = 0;
			
	}

	public boolean isMined() {
		return isMined;
	}

	public void setMined(boolean isMined) {
		this.isMined = isMined;
	}

	public boolean isMarked() {
		return isMarked;
	}

	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public int getAdjMines() {
		return adjMines;
	}

	public void setAdjMines(int adjMines) {
		this.adjMines = adjMines;
	}

	public int getCordX() {
		return cordX;
	}

	public void setCordX(int cordX) {
		this.cordX = cordX;
	}

	public int getCordY() {
		return cordY;
	}

	public void setCordY(int cordY) {
		this.cordY = cordY;
	}

	public String toString(){
		String output = "O";
		
		/*if(this.isMarked == true){
			 // is marked is true
			output = "f";
		}*/
		
		
			if (this.isMined){
				output = "X";
			}
		
		
		return output;
	}
	
	
}
