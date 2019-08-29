import java.util.Scanner;

class ArmStrong {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if(isArmStrong(num)) {
			System.out.println(num + " is an armstrong number.");
		} else {
			System.out.println(num + " is not an armstrong number.");
		}

	}
	
	public static boolean isArmStrong(int num) {
		
		int sum = 0;
		
		String numStr = Integer.toString(num);	
		
		int length = numStr.length();
		
		for(int i = 0; i < length; i++) {
			
			String currentChar = String.valueOf(
				numStr.charAt(i)
			);
			
			sum += Math.pow(
				Integer.parseInt(currentChar),
				length
			);
		}
		
		return sum == num;
	}
	
}