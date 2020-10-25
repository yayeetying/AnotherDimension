public class ArrayOps {

  //returns sum of values in 1D array
  public static int sum(int[] arr) {
    int sums = 0;
    for (int i = 0; i < arr.length; i++) {
      sums += arr[i];
    }
    return sums;
  }

  //returns largest element of 1D array
  public static int largest(int[] arr) {
    int maxNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxNum) maxNum = arr[i];
    }
    return maxNum;
  }

  //returns 1D array w/ sums of rows of 2D array
  public static int[] sumRows(int[][] matrix) {
    int[] lotsSum = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      lotsSum[i] = sum(matrix[i]);
    }
    return lotsSum;
  }

  //returns 1D w/ int of largest elements of 2D array
  public static int[] largestInRows(int[][] matrix) {
    int[] lotsLargest = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      lotsLargest[i] = largest(matrix[i]);
    }
    return lotsLargest;
  }

  //returns sum of all elements in 2D array
  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }

  //returns 1D array w/ sum of columns of 2D array
  public static int[] sumCols(int[][] matrix) {
    int[] lotsSum = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      int sum = 0;
      for (int j = 0; j < matrix.length; j++) {
        sum += matrix[j][i];
      }
      lotsSum[i] = sum;
    }
    return lotsSum;
  }

  //helper fxn to help with isRow/Col Magic
  public static boolean helper(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] != arr[i+1]) return false;
    }
    return true;
  }

  //returns true if each row has same sum; false otherwise
  public static boolean isRowMagic(int[][] matrix) {
    return helper(sumRows(matrix));
  }

  //returns true if each column has the same sum; false otherwise
  public static boolean isColMagic(int[][] matrix) {
    return helper(sumCols(matrix));
  }

  //returns true when row & column specified have same sum
  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return sum(matrix[row]) == (sumCols(matrix))[col]; //return sumRow == sumCol
  }
}
