
/**
 * Write a description of class Sudoku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sudoku
{
   //does sodouku things
   public static void main(String[]args){
       //yo
       int scores[][] = {{5,3,4,6,7,8,9,1,2},{6,7,2,1,9,5,3,4,8},{1,9,8,3,4,2,5,6,7},{8,5,9,7,6,1,4,2,3},{4,2,6,8,5,3,7,9,1},{7,1,3,9,2,4,8,5,6},{9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},{3,4,5,2,8,6,1,7,9}};
       
       System.out.println(isVailidBoard(scores));
    }
   public static boolean isVailidBoard(int[][] a){

       // checks rows 
       int rowCounter = 0;
       int colCounter = 0;
       int gridCounter = 0;
       
       for(int i = 0;  i < a[0].length;i++){
          
         rowCounter += getValidRow(a[i]);
         colCounter += getValidCol(a, i);
           //System.out.println(colCounter);
          
         
         if (rowCounter % 9 != 0 || colCounter % 9 != 0   ){
            return false;
         }
        
       }
       for(int p = 0 ; p < 9 ; p+=3){
        gridCounter += getValidGrid(a, p);
        if( gridCounter % 9 != 0){
            return false;
        }
      
        
        }

        
     
       return true;
    }
    
    
    public static int getValidRow(int[] rowA){
        int counter = 0;
          for(int i = 0;  i < rowA.length;i++){
         
           counter += rowA[i];
       }
       return counter;
    }
    public static int getValidCol(int[][] colA, int col){
        int counter = 0;
          for(int i = 0;  i < colA.length;i++){
         
           counter += colA[col][i];
       }
       return counter;
    }
    public static int getValidGrid(int[][] gridA, int grid){
        int counter = 0;
        for (int i = grid; i < grid + 3; i++){
      
          
            counter += gridA[grid][i];
            counter += gridA[grid + 1][i];
            counter += gridA[grid + 2][i];
             counter += gridA[i][grid];
            counter += gridA[i][grid + 1];
            counter += gridA[i][grid + 2];
         
     
            //System.out.println(counter);
        }
        return counter;
    }
}
