public class Tester {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];
    int[] c = new int[0];
    int[] d = {0};
    int[] e = {-10, 5, 9, 0, -29};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.sum(b));
    System.out.println(ArrayOps.sum(c));
    System.out.println(ArrayOps.sum(d));
    System.out.println(ArrayOps.sum(e));
  }
}
