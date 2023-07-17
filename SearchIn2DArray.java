// Linear search in a 2D array

class SearchIn2DArray {
    // Method for linear search
    static int[] linearSearch(int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target)
                    return new int[] { i, j }; // Return the indices if the target is found
            }
        }
        return new int[] { -1, -1 }; // Return [-1, -1] if the target is not found
    }
    
    public static void main(String[] args) {
        int[][] nums = {
            { 32, 45, 76, 23 },
            { 11, 22, 44, 55, 33 },
            { 31, 77 }
        };
        int target = 55;
        int[] result = linearSearch(nums, target);
        
        // Print the result
        if (result[0] != -1)
            System.out.println("Element found at row " + result[0] + " column " + result[1]);
        else
            System.out.println("Element not found");
    }
}
