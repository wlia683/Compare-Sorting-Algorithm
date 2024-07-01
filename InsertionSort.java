public class InsertionSort {
  /**
   * insertionSort sorts in ascending order with a O(n^2). InsertionSort works by iterating through
   * the array and comparing the current value to the value before it. If the value before it is
   * greater than the current value, then it swaps the two values. It then repeats this process for
   * the rest of the array.
   *
   * @param array unsorted array
   * @return array sorted array
   */
  static int[] insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int insertAfter = i - 1;

      while (insertAfter >= 0 && (array[insertAfter] > current)) {
        array[insertAfter + 1] = array[insertAfter];
        insertAfter--;
      }
      array[insertAfter + 1] = current;
    }
    return array;
  }
}
