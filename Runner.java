import java.util.HashMap;
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

    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length()-1;
        while (head<tail) {
            char l = s.charAt(head), r = s.charAt(tail);
            if (!Character.isLetterOrDigit(l)) {
                head++;
            }else if (!Character.isLetterOrDigit(r)) {
                tail--;
            }else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }else{
                head++;
                tail--;
            }
        }
        return true;
    }


    public static int fib(int n) {
        if (n == 0 ) {
            return 0;
        }else{
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
            return  arr[n];
        }
    }

public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frqs = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (frqs.containsKey(nums[i])) {
                frqs.put(nums[i], (frqs.get(nums[i])+1));
            }else{
                frqs.put( nums[i] , 1);
            }
        }
        
        System.out.println(frqs);
         return 0;
    }
    public static void main(String[] args) {
        int[] lis= {1,2,2,3,1,4};
      System.out.println(maxFrequencyElements(lis));
    }


}