import java.util.Arrays;
public class Tester {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];
    int[] c = new int[0];
    int[] d = {0};
    int[] e = {9, 5, 0, -29};
    int[] f = {-1000, 23, -272, -135, -11, 34, -64};
    int[][] allArrays = {a, b, c, d, e, f};

    //do sum() static method on all arrays
    for (int i = 0; i < allArrays.length; i++) {
      System.out.println(ArrayOps.sum(allArrays[i]));
    }
    System.out.println();

    for (int i = 0; i < allArrays.length; i++) {
      //because array c (index 2) is array of length 0
      if (allArrays[i].length != 0) System.out.println(ArrayOps.largest(allArrays[i]));
    }
    System.out.println();

    //System.out.println(ArrayOps.sumRows(allArrays));
    System.out.println(Arrays.toString(ArrayOps.sumRows(allArrays)));
  }
}
