import com.google.common.primitives.Ints;

import java.util.*;

/**
 * @author zoewoc
 * @version 1.0.0
 * @ClassName TwoSum.java
 * @Description TODO
 * @createTime 2020年11月05日 16:11:00
 */
public class TwoSum {
    public int[] twoSum_1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];

    }

    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No twoSum solution!!");
    }

    public static int[] twoSum_3(int[] nums, int target) {

//        ArrayList list=Arrays.asList(nums);
        List<Integer> list = Ints.asList(nums);
        for (int i = 0; i < nums.length; i++) {
            if (list.indexOf(target - nums[i]) != -1) {
                return new int[]{i, list.indexOf(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("No twoSum solution!!");
    }

    public static void main(String[] args) {
        int nums[]={2, 7, 11, 15};
        int tar[]=twoSum_3(nums,9);
        for(int i=0;i<tar.length;i++){
            System.out.println(tar[i]);
        }
    }
}
