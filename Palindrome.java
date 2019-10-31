class Palindrome {
	
	public static void main(String[] args) {
		
		String str1 = "madam";
    		String str2 = "hello world";
	
		if(isPalindrome(str1)) {
			System.out.println(str1 + " is palindrome.");
		} else {
			System.out.println(str1 + " is not palindrome.");
		}
    
    if(isPalindrome(str2)) {
			System.out.println(str2 + " is palindrome.");
		} else {
			System.out.println(str2 + " is not palindrome.");
		}
  
	}
	
	 public static boolean isPalindrome(String str) 
    { 
  
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
	
}
