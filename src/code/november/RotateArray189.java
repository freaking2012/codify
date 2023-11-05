package code.november;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        RotateArray189 rotateArray189 = new RotateArray189();
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotateArray189.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotateInPlace(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int lastNum;
        while(k-- > 0) {
            lastNum = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = lastNum;
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int[] rotatedNums = new int[nums.length];
        int index;
        for (int i=0;i<nums.length;i++) {
            index = k + i < nums.length ? k + i : (k +  i)%(nums.length);
            rotatedNums[index] = nums[i];
        }
        System.arraycopy(rotatedNums, 0, nums, 0, nums.length);
    }
}
