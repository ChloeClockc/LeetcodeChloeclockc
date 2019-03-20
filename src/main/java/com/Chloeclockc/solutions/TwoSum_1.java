package com.Chloeclockc.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
//时间复杂度O（n） O（n）
class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map =new HashMap();
        for(int i =0;i < nums.length; i++){
//            构造一个HashMap，把数组的值作为key，数组下标作为v，key与target减去另一个数组值相比，可以得到第二个数组下标；
            int x = nums[i];

            if(map.containsKey(target-x)) {
                int[] result = new int[2];
                result[0] = map.get(target -x);
                result[1] = i;
                return result;
            }
            map.put(x,i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
    public static void main(String[] args){
        TwoSum_1 solution1 = new TwoSum_1();
        int[] nums = new int[]{2,7,11,5};
        int target = 9;
        int[] re=solution1.twoSum(nums,target);
        String fire= Arrays.toString(re);
        System.out.println(fire);

    }
}
//  双重循环解法，时间复杂度O（n²） 空间O（1）
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++)
//             for(int j=i+1;j<nums.length;j++){
//                 int result=nums[i]+nums[j];
//                 if (result==target){
//                 int[]out ={i,j};
//                return out;
//                 }

//             }
//          return null;
//     }

// }

//public class Solution {
//    private int findIndexHead(int[] nums, int n) {
//        for (int i = 0; i < nums.length; ++i) {
//            if (nums[i] == n) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    private int findIndexTail(int[] nums, int n) {
//        for (int i = nums.length - 1; i > -1; --i) {
//            if (nums[i] == n) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    public int[] twoSum(int[] nums, int target) {
//        // 拷贝数组
//        int[] cNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(cNums);
//        // 从前面和后面分别开始遍历
//        for (int start = 0, end = cNums.length - 1; start < end;) {
//            if (cNums[start] + cNums[end] == target) {
//                return new int[]{findIndexHead(nums, cNums[start]),
//                        findIndexTail(nums, cNums[end])};
//            }
//            else if (cNums[start] + cNums[end] < target) {
//                start++;
//            }
//            else {
//                end--;
//            }
//        }
//        return null;
//    }
//}
