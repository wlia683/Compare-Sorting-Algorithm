
public class MergeSort {
 /**
   * mergeSort sorts in ascending order with a O(nlogn). MergeSort works by splitting the array in
   * half and recursively calling mergeSort on each half. It then combines the two halves into one
   * sorted array.
   *
   * @param array unsorted array
   * @param start index of starting position in array
   * @param end index of last position in array
   * @return sorted array
   */
  static int[] mergeSort(int[] array, int start, int end) {
    // base case
    if (start == end) {
      return array;
    }
    int middle = start + (end - start) / 2;

    //recursive call on mergeSort on the two halves of the array
    mergeSort(array, start, middle);
    mergeSort(array, middle + 1, end);
    combineArray(array, start, middle, end);
    return array;
  }

  /**
   * combineArray combines two arrays into one sorted array.
   *
   * @param array the arrays from mergeSort that require combining
   * @param start index of starting position in array
   * @param middle index of middle position in array
   * @param end index of last position in array
   * @return the combined sorted array
   */
  private static int[] combineArray(int[] array, int start, int middle, int end) {

    int[] combArray = new int[end - start + 1];

    int pointInArray1 = start;
    int pointInArray2 = middle + 1;

    for (int i = 0; i < (end - start + 1); i++) {

      if (pointInArray1 > middle) {
        combArray[i] = array[pointInArray2++];
       
      } else if (pointInArray2 > end) {
        combArray[i] = array[pointInArray1++];
       
      } else if (array[pointInArray1] < array[pointInArray2]) {
        combArray[i] = array[pointInArray1++];

      } else {
        combArray[i] = array[pointInArray2++];
      }
    }

    System.arraycopy(combArray, 0, array, start, end - start + 1);
    return array;
  }
}
