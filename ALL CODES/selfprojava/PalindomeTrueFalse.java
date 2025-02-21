class PalindomeTrueFalse {
    static boolean checkPalindrome(int n) {
        int reverse = 0;
      
        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = n;
		
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
      
        // If reverse is equal to the original number, the
        // number is palindrome
        return (reverse == n);
    }

  public static void main(String[] args) {
	  
        int n = 12321;
        if (checkPalindrome(n)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}