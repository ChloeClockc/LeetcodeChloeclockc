package com.Chloeclockc.solutions;

/**
 * 167. Two Sum II - Input array is sorted

 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

 Note:

 Your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Example:

 Input: numbers = [2,7,11,15], target = 9
 Output: [1,2]
 Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

 */


//class Solution_167 {
//    public int[] twoSum(int[] nums, int target) {
//        Map <Integer, Integer> map =new HashMap();
//        for(int i =0;i < nums.length; i++)
//            for(int j =nums.length-1;j>i;j--){
//                if(nums[i]+nums[j] == target)
//                    return new int []{i+1,j+1};
//            }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map <Integer, Integer> map =new HashMap();
//        for(int i =0;i < nums.length; i++)
//            for(int j =nums.length-1;j>i;j--){
//                if(nums[i]+nums[j] == target)
//                    return new int []{i+1,j+1};
//            }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//
//
//}

class TwoSumII_167 {
    public int[] twoSum(int[] nums, int target) {
//排序好的 从最前面和最后面开始 如果和小于 前面下标增加 如果大于 后面下标减小
        int i =0;
        int j =nums.length-1;
        while(i<j){
            int add = nums[i]+nums[j];
            if(add == target)
                return new int []{i+1,j+1};
            else if (add<target) i++;
            else j--;
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}