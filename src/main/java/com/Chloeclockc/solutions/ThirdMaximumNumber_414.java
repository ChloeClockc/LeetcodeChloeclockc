package com.Chloeclockc.solutions;

import java.util.Arrays;

/**
 * 414. Third Maximum Number
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).

 Example 1:
 Input: [3, 2, 1]

 Output: 1

 Explanation: The third maximum is 1.
 Example 2:
 Input: [1, 2]

 Output: 2

 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 Example 3:
 Input: [2, 2, 3, 1]

 Output: 1

 Explanation: Note that the third maximum here means the third maximum distinct number.
 Both numbers with value 2 are both considered as second maximum.
 */
/*public class ThirdMaximumNumber_414 {

    public int thirdMax(int[] nums) {
        int[] key = new int[nums.length];
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
//        int[] key = new int[ nums.length];  不能在此处定义key数组
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }


        }
*//*        for (int j = 0; j < nums.length; j++)
            System.out.println(nums[j] + "");*//*
            *//* if (l<3) return nums[0];


            for(int j = i1+1;j< nums.length-2;j++) {
                if (nums[j] > nums[j + 1] && i <= nums.length - 1) {
                    key[j] = 2;
                    key[j + 1] = 3;
                   // int re = i; //System.out.println(re);
                    return nums[j + 1];

                }
//                else if (i <= nums.length - 2) {
//                    key[i] = 2;
//                    key[i + 1] = 2;
//                    i++;
//                }
            }

//        }*//*
        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] > nums[i + 1] && i < nums.length - 2) {
                key[i] = 1;
                key[i + 1] = 2;
                int i1 = i;
                return nums[i];
            }



        for (int j = i + 1; j < nums.length - 2; j++) {

            if (nums[j] > nums[j + 1] && j < nums.length - 2) {
                key[j] = 2;
                key[j + 1] = 3;
                return nums[j + 1];
            }

        }
    }
        return nums[i + 1];}

    *//*int[] key = new int[1000 ];
    public int dMax (int[]nums){

        for(int i = 0;i< nums.length-2;i++){

            if (nums[i]>nums[i+1]&& i< nums.length-2){
                key[i] = 1;key[i+1] = 2; int i1=i;
                return i;
            }
        }
       return 10;
    }
    public int dSecon (int[]nums){
        int max=dMax(nums);

        for(int j = max+1;j< nums.length-2;j++){

            if (nums[j]>nums[j+1]&& j< nums.length-2){
                key[j] = 2;key[j+1] = 3;
                return j+1;
            }
        }
        return 20;
    }*//*
    public static void main(String[] args){
        ThirdMaximumNumber_414 solution1 = new ThirdMaximumNumber_414();
        int[] nums1 = new int[]{2,7,11,5}; //5
//        int[] nums1 = new int[]{1,2}; //Output: 2
//        int[] nums1 = new int[]{1,2,3}; //Output: 1

//        int[] nums1 = new int[]{2,2,3,1};
//        int[] nums1 = new int[]{2,3,3,1};
//        int[] key = new int[ nums.length];
       // String fire= Arrays.toString(re);
        int re = solution1.thirdMax(nums1);
        System.out.println(re);

    }
}*/
/*
public class ThirdMaximumNumber_414 {

    public int thirdMax(int[] nums) {
        public static void main (String[]args){
            ThirdMaximumNumber_414 solution1 = new ThirdMaximumNumber_414();
            int[] nums1 = new int[]{2, 7, 11, 5}; //5
//        int[] nums1 = new int[]{1,2}; //Output: 2
//        int[] nums1 = new int[]{1,2,3}; //Output: 1

//        int[] nums1 = new int[]{2,2,3,1};
//        int[] nums1 = new int[]{2,3,3,1};
//        int[] key = new int[ nums.length];
            // String fire= Arrays.toString(re);
            int re = solution1.thirdMax(nums1);
            System.out.println(re);

        }
    }
}*/


class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
     /*   先定义三个变量代表第一大到第三 然后遍历全部，找出最大的
            遍历第二次 排除第一大找出第二大（注意第一大和第二大不一定唯一 并且第二大不一定存在 第三大也不一定）
            然后再排除第二大 遍历找第三大
            判断第三大变量是否还是初始值 如果是输出  如果不是 输出第一大*/
        // long firstM = Long.MIN_VALUE;         //用long最小值初始化
        // long secondM = Long.MIN_VALUE;
        // long thirdM =Long.MIN_VALUE;
        int firstM = Integer.MIN_VALUE;
        int secondM = Integer.MIN_VALUE;
        int thirdM = Integer.MIN_VALUE; //用Integer最小值初始化

        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            firstM = Math.max(firstM, nums[i]);  //找出最大值max

        }
        for (int n : nums) { //此处要定义n 类型
            if (n == firstM) {
                continue;  //如果等于最大值，继续找
            }
            secondM = Math.max(secondM, n); //除去最大值中找最大值，就是第二大值

        }
        for (int n : nums) {
            if (n == firstM || n == secondM) {
                continue;
            }
            thirdM = Math.max(thirdM, n);//除去最大和第二大值 第三大值

        }
        return (int) (thirdM == Integer.MIN_VALUE ? firstM : thirdM); //第三大变量为初始值 输出第一大 否则 输出第三大
    }

        public static void main (String[]args){
            ThirdMaximumNumber_414 solution1 = new ThirdMaximumNumber_414();
//            int[] nums1 = new int[]{2, 7, 11, 5};
            int[] nums1 = new int[]{2, 2, 1, 3};
            int re = solution1.thirdMax(nums1);
            // String fire= Arrays.toString(re);
            System.out.println(re);

//     }
        }

}

