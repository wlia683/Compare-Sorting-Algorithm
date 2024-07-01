import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int in = 0;

    // generate random array for testing
    int[] array = RandomArrayGenerator.generateRandomArray(1, 100000);

    /*
     * Series of sorting algorithms to demonstrate the differences in the amount of time taken to execute.
     */
    
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("What algorithm would you like to sort using?");
      while (true) {

        System.out.println(
            "Press '1' for SelectionSort, '2' for InsertionSort, '3' for MergeSort, '4' for"
                + " QuickSort and '5' for HeapSort.");
        System.out.println("Enter 'E' to exit.");
        String input = scan.next();
        if (input.equalsIgnoreCase("E")) {
          System.out.println("Exiting...");
          return;
        }
        try {
          in = Integer.parseInt(input);
          if (in < 1 || in > 5) {
            throw new IllegalArgumentException();
          }
        } catch (IllegalArgumentException e) {
          System.out.println("Invalid input!");
        }
        long startTime = System.nanoTime();
        switch (in) {
          case 1:
            System.out.println("SelectionSort!!");
            printArray(SelectionSort.selectionSort(array));
            System.out.println("Time taken = " + (System.nanoTime() - startTime) / 1000);
            return;
          case 2:
            System.out.println("InsertionSort!");
            printArray(InsertionSort.insertionSort(array));
            System.out.println("Time taken = " + (System.nanoTime() - startTime) / 1000);
            return;
          case 3:
            System.out.println("MergeSort!!");
            printArray(MergeSort.mergeSort(array, 0, array.length - 1));
            System.out.println("Time taken = " + (System.nanoTime() - startTime) / 1000);
            return;
          case 4:
            System.out.println("QuickSort!");
            printArray(QuickSort.quickSort(array, 0, array.length - 1));
            System.out.println("Time taken = " + (System.nanoTime() - startTime) / 1000);
            return;
          case 5:
            System.out.println("HeapSort!");
            printArray(HeapSort.heapSort(array));
            System.out.println("Time taken = " + (System.nanoTime() - startTime) / 1000);
            return;
        }
      }
    }
  }

  /**
   * Helper method that aids in efficient printing of the array after being sorted.
   * @param array the array to printed.
   */
    private static void printArray(int[] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) {
        sb.append(", ");
      }
    }
    String result = sb.toString();
    System.out.println(result);
  }
}
