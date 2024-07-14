package Arrays;

import java.util.*;

public class ArrHard {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> maj = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i < n ; i++){
            int pre = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], pre+1);
        }
        // System.out.println(mpp);
        // System.out.println(nums.length/3);
        for (Map.Entry<Integer, Integer> ent : mpp.entrySet()) {
           
            if (ent.getValue() >= n/3) {
                maj.add(ent.getKey()) ;
                
            }
        }
        // System.out.println(maj);
        return maj;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,3};
        majorityElement(arr);

    }
}
