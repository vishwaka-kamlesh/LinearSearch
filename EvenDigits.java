// In an integer array find how many of them contains even number of digits
class EvenDigits {
    
    // Method to calculate the number of digits in a given number
    static int digits(int num) {
        return (int)(Math.log10(num)+1);
    }
    
    // Method to check if the number of digits is even
    static boolean isEven(int num) {
        int digits = digits(num);
        return digits % 2 == 0;
    }
    
    public static void main(String[] args) {
        int[] nums = { 234, 654, 77, 1234, 988, 8765, 9000 };
        int count = 0;
        
        // Iterate over the array and count the numbers with even digits
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i]))
                count++;
        }
        
        // Print the count of numbers with even digits
        System.out.println(count);
    }
}
