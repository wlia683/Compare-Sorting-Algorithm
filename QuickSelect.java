public class QuickSelect {

    public static void main (String[] args){
        int[] array = {53, 22, 45, 74, 51, 87, 39, 60, 98, 16};
        System.out.println(quickSelect(array, 3));
    }

    /**
     * Quickselect is a selection algorithm to find the kth smallest element in an unordered list. It
     * works by partitioning the list into two halves, one with values less than or equal to the
     * pivot and one with values greater than or equal to the pivot. It then recursively calls
     * quickselect on the half that contains the kth smallest element.
     * @param array unsorted array
     * @param k the kth smallest element to find
     * @return the kth smallest element
     */
  public static int quickSelect(int[] array, int k) {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      int q = QuickSort.partition(array, left, right);
      if (q == k - 1) {
        return array[q];
      } else if (k - 1 < q) {
        right = q - 1;
      } else {
        left = q + 1;
      }
    }
    return array[left];
  }
}
