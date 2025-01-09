package searchandsort;

public class HeapSort {
    // Method to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Method to heapify a subtree rooted with node i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // Check if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // Check if right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // Swap and continue heapifying if largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6, 7};
        heapSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " "); // Output: 5 6 7 11 12 13
        }
    }
}
