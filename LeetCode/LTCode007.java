class LTCode007 {
    public static int[] plusOne(int[] digits) {
            int n = digits.length;
            
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;  
                    return digits;  
                }
                digits[i] = 0;  
            }
            
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;  
            
            return newDigits;
        }
    
        public static void main(String[] args) {
            // Example input: [1, 2, 3]
            int[] digits = {1, 2, 3};
            
            // Call the plusOne method
            int[] result = LTCode007.plusOne(digits);
        
        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
