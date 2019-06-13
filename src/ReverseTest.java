/**
 *
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 *
 *
 * reverse3([1, 2, 3]) → [3, 2, 1]
 * reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class ReverseTest {
    public static void main(String[] a) {
        Reverse reverse = new Reverse();
        int [] nums = {5, 4, 3, 2, 1};

        nums = reverse.reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

class Reverse {
    public int[] reverse(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - (i + 1)];
            nums[nums.length - (i + 1)] = tmp;
        }
        return nums;
    }
}