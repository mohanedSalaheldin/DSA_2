
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
        int first =0;
        int mid =0;
        int last  = nums.length-1;
        while (mid<= last) {
            if (nums[mid] == 0) {
                int temp = nums[first];
                nums[first] = nums[mid];
                nums[mid] = temp;
                mid++;
                first++;
            }else if (nums[mid] == 2) {
                int temp = nums[last];
                nums[last] = nums[mid];
                nums[mid] = temp;
                last--;
            }else{
                mid++;
            }
        }
        
     }

     public static int maxSubArray(int[] nums) {
        int maxi = 0; 
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum>maxi) {
                maxi = sum;
            }
            if (sum<0) {
                sum =0;
            }
        }  
        return maxi;
     }

     public int maxProfit(int[] prices) {
        int prof = 0;
        int pay = prices[0];
        for(int i =1; i<prices.length; i++){
            if(prices[i]< pay) pay = prices[i];
            else if(prices[i] - pay > prof) prof = prices[i] - pay;
        }
        return prof;
    }
    public int maxSubArray(int[] nums) {
        // if(nums.length==1) return nums[0];
        int maxi = nums[0]; 
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi) maxi = sum;
            if(sum<0) sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] prices = {7,1,5,3,6,4};
        int sol = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int sum = prices[j] - prices[i];
                sol = Math.max(sol, sum);
            }
        }
        System.out.println(sol);
        
    }
}
