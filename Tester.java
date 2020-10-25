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
    int[][] A = { {1, 0, 12, -1}, {7, 2, -2, 1}, {-5, -2, 2, -9} };
    int[][][] all2DArrays = {allArrays, z, y, A};
    int[][] L = { {2, 6, 9}, {-3, -6, 11}, {11, 11, 11} };
    int[][] K = { {1}, {2}, {3}, {4}, {5} };
    int[][] J = { {1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2} };
    int[][] H = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3} };
    int[][] G = { {2, 2, 2}, {2, 2, 2} };
    int[][][] rect2DArrays = {y, A, L, K, J, H, G};

    //do sum() static method on all 1D arrays
    for (int i = 0; i < allArrays.length; i++) {
      System.out.println(ArrayOps.sum(allArrays[i]));
    }
    System.out.println();

    //do largest() static method on all 1D arrays
    for (int i = 0; i < allArrays.length; i++) {
      System.out.println(ArrayOps.largest(allArrays[i]));
    }
    System.out.println();

    //do sumRows() static method on all 2D arrays
    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(Arrays.toString(ArrayOps.sumRows(all2DArrays[i])));
    }
    System.out.println();

    //do largestInRows() static method on all 2D arrays
    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(Arrays.toString(ArrayOps.largestInRows(all2DArrays[i])));
    }
    System.out.println();

    //do sum() static method on all 2D arrays
    for (int i = 0; i < all2DArrays.length; i++) {
      System.out.println(ArrayOps.sum(all2DArrays[i]));
    }
    System.out.println();

    //do sumCols() on rectangular 2D arrays
    for (int i = 0; i < rect2DArrays.length; i++) {
      System.out.println(Arrays.toString(ArrayOps.sumCols(rect2DArrays[i])));
    }
    System.out.println();

    //do isRowMagic() on rectangular 2D arrays
    for (int i = 0; i < rect2DArrays.length; i++) {
      System.out.println(ArrayOps.isRowMagic(rect2DArrays[i]));
    }
    System.out.println();

    //do isColMagic() on rectangular 2D arrays
    for (int i = 0; i < rect2DArrays.length; i++) {
      System.out.println(ArrayOps.isColMagic(rect2DArrays[i]));
    }
    System.out.println();

    //do isLocationMagic() on specified array
    int[][] E = { {2, 4, 2}, {2, 2, 2} };
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
    System.out.println(ArrayOps.isLocationMagic(A, 0, 2));
    System.out.println(ArrayOps.isLocationMagic(A, 0, 3));
  }
}
