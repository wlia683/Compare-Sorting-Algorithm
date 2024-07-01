public class QuickSort {
  /**
   * quickSort sorts in ascending order with a O(nlogn). QuickSort works by finding a pivot index
   * and partitioning the array into two halves, one with values less than or equal to the value at
   * the pivot index and one with values greater than or equal to the value at the pivot index. It
   * then recursively calls quickSort on each half.
   *
   * @param array unsorted array
   * @param start index of first position in array
   * @param end index of last position in array
   * @return sorted array
   */
  static int[] quickSort(int[] array, int start, int end) {
    if (start >= end) {
      return array;
    }

    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);
    return array;
  }

  /**
   * partition finds the pivot index for the quickSort method
   *
   * @param array array to find pivot for
   * @param start index of first position in array
   * @param end index of last position in array
   * @return pivot index
   */
  static int partition(int[] array, int start, int end) {
    int pivotIndex = end;
    for (int i = end - 1; i >= start; i--) {
      if (array[pivotIndex] <= array[i]) {

        Swap.swap(array[i], array[pivotIndex - 1]);

        Swap.swap(array[pivotIndex], array[pivotIndex - 1]);
        pivotIndex--;
      }
    }
    return pivotIndex;
  }
}
