import java.util.Arrays;
public class Tester {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];
    int[] c = {0};
    int[] d = {9, 5, 0, -29};
    int[] e = {-1000, 23, -272, -135, -11, 34, -64};
    int[][] allArrays = {a, b, c, d, e};
    int[][] z = { {99, -72, 38}, {-102, -478, -2948, -1289}, {2, 3} };
    int[][] y = new int[5][2];
    int[][] A = { {1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9} };
    int[][][] all2DArrays = {allArrays, z, y, A};

    //do sum() static method on all arrays
    for (int i = 0; i < allArrays.length; i++) {
      System.out.println(ArrayOps.sum(allArrays[i]));
    }
    System.out.println();

    for (int i = 0; i < allArrays.length; i++) {
      System.out.println(ArrayOps.largest(allArrays[i]));
    }
    System.out.println();

    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(Arrays.toString(ArrayOps.sumRows(all2DArrays[i])));
    }
    System.out.println();

    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(Arrays.toString(ArrayOps.largestInRows(all2DArrays[i])));
    }
    System.out.println();

    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(ArrayOps.sum(all2DArrays[i]));
    }
    System.out.println();
  }
}
