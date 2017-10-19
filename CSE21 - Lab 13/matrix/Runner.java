package matrix;

import java.util.ArrayList;

public class Runner {

	
	public static void main(String[] args) {
		
		testMatrix();
		
	}
	


	// enter filenames such as "data/matrix1.txt"
	public static void testMatrix() {
		int[][] mat1 = readMatrix();
		printMatrix(mat1);
		int[][] mat2 = readMatrix();
		printMatrix(mat2);
		int[][] mult = multiply(mat1, mat2);
		writeMatrix(mult, "data/RESULT.txt");
		System.out.println("wrote results to data/RESULT.data");
		printMatrix(mult);
		
	}



	private static void writeMatrix(int[][] mult, String string) {
		// TODO Auto-generated method stub
		
	}



	private static int[][] multiply(int[][] mat1, int[][] mat2) {
		// TODO Auto-generated method stub
		return null;
	}



	private static void printMatrix(int[][] mat1) {
		// TODO Auto-generated method stub
		
	}



	private static int[][] readMatrix() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
