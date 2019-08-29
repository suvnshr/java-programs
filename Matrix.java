import java.util.Scanner;

class Matrix {
	
	public int rows;
	public int columns;
	public int [][]data;
	
	Matrix(int rows, int columns, boolean manualIntitialize) {
		
		this.rows = rows;
		this.columns = columns;
		this.data = new int[rows][columns];
		
	}
	
	Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		this.data = new int[rows][columns];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < this.rows; i++) {
			for(int j=0; j < this.columns; j++) {
					
				System.out.print("Enter " + i + ", " + j + " element: ");
				data[i][j] = input.nextInt();
				
			}
		}
		
	}
	
	
	public boolean isMultiplicable(Matrix other) {
		
		return this.columns == other.rows; 
		
	}
	
	Matrix multiplyWith(Matrix other) {
		
		Matrix result = new Matrix(this.columns, other.rows, true);
		
	
		
		if(this.isMultiplicable(other)) {
		
			for(int i=0; i < this.rows; i++) {
				for(int j=0; j < other.columns; j++) {
					for(int k=0; k < other.rows; k++) {
				
						result.data[i][j] += this.data[i][k] * other.data[k][j]; 
					}	
				}
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		
		String representation = "";
		
		representation += "[\n";
		
		for(int i=0; i < this.rows; i++) { 
		
			representation += "\n\t[";
		
			for(int j=0; j < this.columns; j++) {
					
				representation += "\t" + this.data[i][j] + ", ";
		
			}
			representation += "\t]\n";
		}
		
		representation += "]\n";
		
		return representation;
		
	}
	
}