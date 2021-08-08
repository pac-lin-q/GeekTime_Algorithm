import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
         new TwoSum().twoSum(new int[]{2,7,10,11},9);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
