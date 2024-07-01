public class SelectionSort {
  /**
   * selectionSort sorts in ascending order, with a O(n^2). SelectionSort works by iterating through
   * the array and finding the minimum value in the array, then swapping the minimum value with the
   * value at the current index. It then repeats this process for the rest of the array.
   *
   * @param array unsorted array
   * @return sorted array
   */
  static int[] selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      Swap.swap(array[minIndex], array[i]);
    }
    return array;
  }
}
