import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};

        int k = removeDuplicates(nums);

        int[] result = Arrays.copyOfRange(nums, 0, k);

        System.out.println(Arrays.toString(result));
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}