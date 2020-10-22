public class ArrayOps {

  public static int sum(int[] arr) {
    int sums = 0;
    for (int i = 0; i < arr.length; i++) {
      sums += arr[i];
    }
    return sums;
  }

  public static int largest(int[] arr) {
    int maxNum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxNum) maxNum = arr[i];
    }
    return maxNum;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] lotsSum = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      lotsSum[i] = sum(matrix[i]);
    }
    return lotsSum;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] lotsLargest = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      lotsLargest[i] = largest(matrix[i]);
    }
    return lotsLargest;
  }

}
