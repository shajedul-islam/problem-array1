/**
 *
 *
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 *
 *
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */

public class CountEvensTest {
    public static void main(String[] a) {
        CountEvens countEvens = new CountEvens();
        int [] nums = {6, 1, 2, 3};
        System.out.println(countEvens.countEvens(nums));
    }
}

class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}