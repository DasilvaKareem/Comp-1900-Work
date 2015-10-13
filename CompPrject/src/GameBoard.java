import java.math.*;

public class GameBoard {

	int rows;
	int columns;
	int amountOfMines;
	Double maxBombCount;
	int bombCount;
	boolean gameOver;
	Tile[][] board;

	GameBoard() {
	}

	GameBoard(int inRow, int inColumn, int nBombs) {
		gameOver = false;
		this.rows = inRow;
		this.amountOfMines = nBombs;
		this.columns = inColumn;
		System.out.println(this.rows);
		System.out.println(this.columns);

		 board = new Tile[inRow][inColumn];

	

		for (int x = 1; x < inRow; x++) {

			for (int y = 1; y < inColumn; y++) {

				Tile inTile = new Tile();
				inTile.setCordX(x);
				inTile.setCordY(y);
				board[x][y] = inTile;

				
				//System.out.println(inTile.toString());

			}
		}
		createMines();
		printBoard(board);

	}
	
	public void checkTile(int tileX, int tileY){
		Tile outputTile = board[tileX][tileY];
		if (outputTile.isHidden == true){
			outputTile.setHidden(false);
			showTiles(outputTile);
			lostGame(outputTile);  
		} else {
			System.out.println("You cannot pick a  checked T fucker");
		}
		
		
	}
	public boolean lostGame(Tile checkTile){
		if (checkTile.isMined){
			this.gameOver = true;
		}
		
		return this.gameOver;
	}
	public void marked(Tile inputTile) {
		if (inputTile.isMarked) {
			inputTile.setMarked(false);
		} else {
			inputTile.setMarked(true);
		}
	}
	
	public void showTiles(Tile outputTile){
		int X = outputTile.cordX;
		int Y = outputTile.cordY;
		Tile currentTile = board[X][Y];
		for(int i = 1; i < 8; i++){
			switch (i){
			case 1:
			X++;
			if (currentTile != null){
				if (currentTile.isMined){
					currentTile.isHidden = true;
					}
				}
			break;
			
			case 2:
				X++;
				Y++;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 3:
				Y++;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 4:
				X--;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 5:
				X--;
				Y--;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 6:
				Y--;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 7:
				X++;
				Y--;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			case 8:
				X--;
				Y--;
				if (currentTile != null){
					if (currentTile.isMined){
						currentTile.isHidden = true;
						}
					}
				break;
			
			
			}
		}
	}
	public void createMines() {
		this.maxBombCount = (this.rows * this.columns) * 0.25;
		if (this.amountOfMines > this.maxBombCount.intValue()){
			//picks a bigger amount of mines
			System.out.println("you entered the maxium amount we defautled your bombs to 25% mines: " + this.maxBombCount.intValue());
			this.amountOfMines = this.maxBombCount.intValue();
			
		}
		while(bombCount != this.amountOfMines){
			
		
			System.out.println(maxBombCount.intValue());
			int randomBombRows = (int) Math.ceil(Math.random() * this.rows - 1);
			int randomBombCols = (int) Math.ceil(Math.random() * this.columns - 1);
			
		
				bombCount++;
				board[randomBombRows][randomBombCols].setMined(true);
		}
	
	}
	
	public void printBoard(Tile[][] inputBoard){
		Tile theTile;
		int index = 1;
		int count = this.rows;
		for(int i = 1; i < this.rows; i++){
			
			for(int j = 1; j<this.columns ; j++){
				theTile = inputBoard[i][j];
				System.out.print(index);
				if(index != count){
			
				System.out.print(theTile + "\t");
				index++;
				} else {
					System.out.print(theTile + "\n");
					index = 1;
				}
				
			}
			
		}
		
	}

}
