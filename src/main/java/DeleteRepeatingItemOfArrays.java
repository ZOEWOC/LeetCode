import java.util.HashMap;
import java.util.Map;

public class DeleteRepeatingItemOfArrays {

    public int removeDuplicates(int[] nums) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        int i = 0;
        while (i < nums.length) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], null);
                nums[map.size() - 1] = nums[i];
            }
            i++;
        }
        return map.size();
    }

    public int removeDuplicates_2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicates_3(int[] nums){
        int n = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1]!=(nums[i])) {
                n++;
                nums[n]=nums[i];
            }
        }
        return n + 1;
    }
}
