// Finding the minimum number in an array using linear search

class FindMin {
    // Method for finding the minimum number
    static int findMin(int[] nums) {
        int result = nums[0]; // Assume the first element as the minimum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < result)
                result = nums[i]; // Update the minimum if a smaller number is found
        }
        return result; // Return the minimum number
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 1, 3, 5, 7, 0 };
        int result = findMin(nums);
        System.out.println("Minimum element is " + result); // Print the minimum element
    }
}
