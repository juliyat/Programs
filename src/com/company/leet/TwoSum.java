package com.company.leet;

import java.util.Map;
import java.util.HashMap;
public class TwoSum {
    public int[] sumIteration(int[] nums, int target) {
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1;j < nums.length ; j++ ) {
                if((nums[i] + nums[j] == target)) {
                    return new int [] {i,j};
                }
            }
        }
        return new int []{};
    }
    public int[] sumhash(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int expectedVal = target - nums[i];
            if(map.containsKey(expectedVal) && map.get(expectedVal) != i){
                return new int[]{i,map.get(expectedVal)};
            }

        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] nums = {2,5,5,11};
        int target = 10;
        TwoSum twoSum = new TwoSum();
       int[] res = twoSum.sumhash(nums, target);
       for(int i= 0; i < res.length; i ++){
           System.out.println(res[i]);
       }
    }
}
