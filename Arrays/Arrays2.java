
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays2 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int times = mpp.getOrDefault(nums[i], 0);
           mpp.put(nums[i], times+1);
        }
        int maj = 0;
        for (Map.Entry<Integer, Integer> ent : mpp.entrySet()) {
            if (ent.getValue()> nums.length/2) {
                maj = ent.getKey();
                break ;
            }
        }
        return maj;
    }


    public static int mostFrequentEven(int[] nums) {
        if(nums.length==1 && nums[0]%2==0){
            return nums[0];
        }
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 ==0) {
            int times = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], times+1);
            }
        }
        if (mpp.size()==0) {
            return -1;
        }
        int majorityKey = 0;
        int majorityValue = 0;
        for (Map.Entry<Integer, Integer> ent : mpp.entrySet()) {

            if (ent.getValue() > majorityValue) {
                majorityKey = ent.getKey();
                majorityValue = ent.getValue();
            }else if (ent.getValue() == majorityValue) {
                majorityKey = Math.min(majorityKey, ent.getKey());
                majorityValue = mpp.get(majorityKey);
            }
        }
        return majorityKey;
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
      
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum =0;
        int maxLen =0;
        
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
            if (sum==K) {
                maxLen =  i+1;
            }
            int rem = sum - K;
            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!mpp.containsKey(rem)) {
                
                mpp.put(sum, i);
            }
            
        }
        return maxLen;
    }
    
    
    public static int searchInsert(int[] nums, int target) {
        int first =0;
        int last = nums.length-1;
        while (first<=last) {
        int mid = first + (last-first )/2;
        if (nums[mid]==target) {
                return mid;
            }else if (nums[mid]< target) {
                first = mid + 1;
            }else{
                last = mid -1;
            }    
        }
        return first;
       
    }
   
    public static int[] twoSum(int[] nums, int target) {
        int right = nums.length -1;
        int left = 0;
        while (left<right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            }else if (sum < target){
                left++;
            }
            else right--;
            
        }
        return null;
    }
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
     }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] sol =  (arr, 9);
        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }

        System.out.println();
        // System.out.println("Hello World");
    }
}
