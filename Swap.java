public class Swap {

  /***
   * A swap class for swapping the positions of two objects in an array.
   * @param object1 first object
   * @param object2 second object
   */
  public static void swap(Object object1, Object object2) {
    Object temp = object1;
    object1 = object2;
    object2 = temp;
  }
}
