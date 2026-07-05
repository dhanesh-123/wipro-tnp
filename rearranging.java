public class rearranging {
    public static void evenOdd(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i == nums.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}); 
        evenOdd(new int[]{3, 3, 2});             
        evenOdd(new int[]{2, 2, 2});             
    }
}