package com.Chloeclockc.solutions;

/**
 * 238. Product of Array Except Self
 *
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity?
 (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */



 class ProductOfArrayExceptSelf_238 {
        /**
         * Very straightforward idea: iterate through the array twice:
         * first time: get res[i] = res[i-1]*nums[i-1]
         * second time: have a variable called right, which means all the numbers product to its right, then do
         * res[i] *= right;
         * right *= nums[i];
         * that's it.
         *
         * This could be very well illustrated with this example: [1,2,3,4]
         */

        /*
        * 创造两个数组，一个记录i左边数的乘积，一个记录i右边数的乘积，然后把这两个相乘
        *
        * */
        public int[] productExceptSelf (int [] nums){
            int l = nums.length;
            int[]minx = new int[l]; minx[0]=1;
            int[]maxx = new int[l]; maxx[l-1]=1;
            int[] result = new int[l];
            int right=1;
            for(int i=1;i<l;i++){
                minx[i] = minx[i-1]*nums[i-1];
            }
/*//            j=l-2 因为最右边的数没有右侧
            for(int j=l-2;j>=0;j--){
                maxx[j] = maxx[j+1]*nums[j+1];
            }
//            i从 0开始
            for(int i=0;i<l;i++){
                result[i] = minx[i]*maxx[i];
            }*/
//或者直接右边数相乘再和左边数乘积的数组对应位置相乘
            for(int j= l-1;j>=0;j--){
                minx[j] *= right;
                right *= nums[j];
            }
            return result;
    }


    public static void main (String args[]){
            ProductOfArrayExceptSelf_238 pExce = new ProductOfArrayExceptSelf_238();
            int [] nums = {1,2,3,4};
            int[]re = pExce.productExceptSelf(nums);
        for (int r : re)
            System.out.print(r + " ");


    }

    }

