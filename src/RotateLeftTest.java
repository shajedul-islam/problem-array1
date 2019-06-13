/**
 *
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 *
 *
 * rotateLeft([1, 2, 3]) → [2, 3, 1]
 * rotateLeft([5, 11, 9]) → [11, 9, 5]
 * rotateLeft([7, 0, 0]) → [0, 0, 7]
 */

public class RotateLeftTest {
    public static void main(String[] a) {
        RotateLeft rotateLeft = new RotateLeft();
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        nums = rotateLeft.rotateLeft(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

class RotateLeft {
    public int[] rotateLeft(int[] nums, int position) {
        for (int i = 0; i < position; i++) {
            int tmp = nums[0];
            for (int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j+1];
            }
            nums[nums.length - 1] = tmp;
        }
        return nums;
    }
}