import java.util.Arrays;

/**
 * 旋转数组
 */
public class RotateArray {
    public static void main(String[] args) {
        new RotateArray().rotate(new int[]{1,2,3,4,5,6,7},3);
    }

    public void rotate(int[] nums, int k) {
        int le= nums.length;
        int[] n = new int[le];
        for (int i=0;i<le ;i++) {
            n[(i+k) % le] = nums[i];
        }
        System.arraycopy(n, 0, nums, 0, le);

        System.out.println(Arrays.toString(n));
    }

}
