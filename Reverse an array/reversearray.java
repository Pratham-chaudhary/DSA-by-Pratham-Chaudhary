public class reverseArray {

    // Method to reverse the elements of an array
    static void reverse(int[] arr) {
        // Initialize two pointers i and j
        int i = 0, j = arr.length - 1;

        // Swap elements at i and j until i crosses j
        while (i < j) {
            // Swap arr[i] and arr[j] using a temporary variable t
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            // Move pointers towards each other
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] arr = {1, 2, 3, 4, 5};

        // Call the reverse method to reverse the array
        reverse(arr);

        // Print the reversed array elements in a single line
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
