/**
 * Runner
 */
public class Runner {
    public static void reverse() {
        int[] arr = {2,5,1,3, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("->" +arr[i]);
        }
        System.out.println();
        arr = swapElements(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("->" +arr[i]);
        }
       
    }

    private static int[] swapElements(int[] nums, int n) {
        int length = nums.length;
        if (n  == length/2) {
            return nums;
        }
        int h = n;
        int t = (nums.length-1) - n;
            nums[h] = nums[h] + nums[t];
            nums[t] = nums[h] - nums[t];
            nums[h] = nums[h] - nums[t];
        return swapElements(nums, n+1);
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(5);
        table.put(24, "Mohaned");
        table.put(4, "Salah");
        table.put(1, "Kalid");
        System.out.println(table.get(4)); 
    }
}