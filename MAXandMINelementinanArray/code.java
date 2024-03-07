public class Main {
    public static void main(String[] args) {
        // Array of integers
        int arr[] = {2, 6, 3, 8, 1, 56, 10, 46, 52, 5};
        // Call the minmax function and pass the array
        minmax(arr);
    }

    // Function to find the minimum and maximum elements in the array
    static void minmax(int[] arr) {
        // Check if the array is null or empty, if so, return without doing anything
        if (arr == null || arr.length == 0) return;

        // Initialize variables to store the minimum and maximum elements, assuming the first element as both min and max initially
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is less than the current minimum, update the minimum
            if (arr[i] < min) {
                min = arr[i];
            }
            // If the current element is greater than the current maximum, update the maximum
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the maximum and minimum elements found in the array
        System.out.println(max + " maximum");
        System.out.println(min + " minimum");
    }
}
