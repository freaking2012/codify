package code.november;

import java.util.Arrays;

public class RemoveDuplicates80 {
    static RemoveDuplicates80 removeDuplicates80 = new RemoveDuplicates80();

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates80.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int dupSize = 1;
        int lastNum = nums[0];
        for (int i = 1; i <  size; i++) {
            dupSize = lastNum == nums[i] ? dupSize + 1 : 1;
            if (dupSize > 2) {
                  size --;
                  i--;
                  for (int j = i; j < size; j++ ) {
                      nums[j] = nums[j+1];
                  }
            }
            lastNum = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return size;
    }
}
