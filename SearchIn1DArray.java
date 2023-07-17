// Linear search in a one-dimensional array

class SearchIn1DArray {
    // Method for linear search
    static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 8, 9, 6, 7 };
        int target = 7;
        int result = linearSearch(nums, target);

        // Print the result
        if (result != -1)
            System.out.println("Element found at position " + result);
        else
            System.out.println("Element not found");
    }
}
