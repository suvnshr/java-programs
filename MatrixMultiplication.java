class Multiply {
	
	public static void main(String[] args) {
		
		Matrix m1 = new Matrix(2, 2);
		Matrix m2 = new Matrix(2, 2);
		
		System.out.println(m1);
		System.out.println(m2);
		
		Matrix result = m1.multiplyWith(m2);
		
		System.out.println(result.toString());
	
		
	}
} 