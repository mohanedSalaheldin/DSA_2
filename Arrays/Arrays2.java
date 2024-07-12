
package Arrays;

import java.util.*;


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

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Define array for storing the ans separately.
        int[] ans = new int[n];

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (nums[i] < 0) {
                if (negIndex < n) {
                    ans[negIndex] = nums[i];
                    negIndex += 2;
                }
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                if (posIndex < n) {
                    ans[posIndex] = nums[i];
                    posIndex += 2;
                }
            }
        }

        // return ans;

        
        display(ans);
        return new int[] {};
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;

        for (int i = n-2; i >= 0; i--) {
            if (nums[i]<nums[i+1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        for (int i = n-1; i >= 0; i--) {
            if (nums[i]> nums[breakPoint]) {
                int temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        reverse(nums, breakPoint+1, n-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    private static void swap(int i, int j, int[] nums) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
    }
    private static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
           if (!ans.contains(ds)) {
            ans.add(new ArrayList<>(ds));
           }
            return ;
        }
        for (int i = index; i < nums.length; i++) {
            swap(index, i, nums);
            recurPermute(index+1, nums, ans);
            swap(index, i, nums);
        }
        
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recurPermute(0, nums, res);
        return res;
    }

    public static int findLongestConseqSubseq(int arr[], int N){
        if (N==0) {
            return 0;
        }
	    int maxSubArray =0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        for (Integer cur : set) {
            if (!set.contains(cur-1)) {
                int min = cur;
                int count = 1;
                while (set.contains(min+1)) {
                    min++;
                    count++;
                }
                maxSubArray = Math.max(count, maxSubArray);

            }
        }
        return maxSubArray;
	}
    public static boolean linearSearch(int []a, int num) {
        int n = a.length; //size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        // int[] prices = {7,1,5,3,6,4};
        // int sol = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i; j < prices.length; j++) {
        //         int sum = prices[j] - prices[i];
        //         sol = Math.max(sol, sum);
        //     }
        // }
        findLongestConseqSubseq(arr, arr.length);
        
    }



    
    private static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }


}
