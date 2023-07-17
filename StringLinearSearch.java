// Linear search in a String

class StringLinearSearch {
    // Method for linear search
    static int linearSearch(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == target)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String str = "Hello";
        char target = 'H';
        int result = linearSearch(str, target);

        // Print the result
        if (result != -1)
            System.out.println("Element found at position " + result);
        else
            System.out.println("Element not found");
    }
}
