package ArrayEXP;

public class MultiDimention2 {

	public static void main(String[] args) {
	
		int threeDArray[][][] = {{{1,2,3},{4,5,6}},
				{{7,8,9},{10,11,12}}
		};    //Jagged Array
		
		
	        System.out.println("Elements of the 3D array:");
	        for (int i = 0; i < threeDArray.length; i++) { // Iterates through "tables"
	           // System.out.println("Table " + i + ":");
	            for (int j = 0; j < threeDArray[i].length; j++) { // Iterates through rows
	               // System.out.print("  Row " + j + ": ");
	                for (int k = 0; k < threeDArray[i][j].length; k++) { // Iterates through columns
	                    System.out.print(threeDArray[i][j][k] + "  ");
	                }
	                System.out.println(); // New line after each row
	            }
	         // New line after each "table"
	        }
	}
}
