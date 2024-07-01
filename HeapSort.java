public class HeapSort {
  /**
   * heapSort sorts in ascending order with a O(nlogn). HeapSort works by creating a max heap from
   * the array, then swapping the first and last values in the array and removing the last value
   * from the heap. It then repeats this process for the rest of the array.
   *
   * @param array unsorted array
   * @return sorted array
   */
  static int[] heapSort(int[] array) {

    // create max heap
    for (int i = array.length / 2 - 1; i >= 0; i--) {
      heapify(array, array.length, i);
    }

    // swap first and last values in array and remove last value from heap
    for (int i = array.length - 1; i > 0; i--) {
      Swap.swap(array[0], array[1]);
      heapify(array, i, 0);
    }

    return array;
  }

  /**
   * Creates a max heap from an array
   *
   * @param array the array to create a max heap from
   * @param n the size of the array
   * @param i the index of the root of the heap
   */
  private static void heapify(int[] array, int n, int i) {

    int largest = i;

    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && array[left] > array[largest]) {
      largest = left;
    }

    if (right < n && array[right] > array[largest]) {
      largest = right;
    }

    if (largest != i) {
      Swap.swap(array[i], array[largest]);
      heapify(array, n, largest);
    }
  }
}
