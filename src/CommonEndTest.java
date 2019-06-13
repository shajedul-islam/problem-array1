/**
 *
 *
 * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 *
 *
 * commonEnd([1, 2, 6]) → true
 * commonEnd([6, 1, 2, 3]) → true
 * commonEnd([13, 6, 1, 2, 3]) → false
 */

public class CommonEndTest {
    public static void main(String[] ar) {
        CommonEnd firstLast6 = new CommonEnd();
        int [] a = {1, 2, 3};
        int [] b = {7, 3};
        System.out.println(firstLast6.commonEnd(a, b));
    }
}

class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1] ? true : false;
    }
}