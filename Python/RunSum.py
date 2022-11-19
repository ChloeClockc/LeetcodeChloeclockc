from typing import List


class Solution:
    def runningSum(self, nums) :
        newnums = []
        sum = 0 # sum 变量存储nums[1]+[2] 然后赋予newnums数组
        for i in range(0, len(nums)):
            sum += nums[i]

            # newnums[i] = sum
            newnums.append(sum)
        print(newnums)
        return newnums


# class Solution(object):
#     def runningSum(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         lis = []
#         sum = 0
#         for i in nums:
#             sum+=i
#             lis.append(sum)
#         return lis

S1 = Solution()
nums1 = [1, 2, 3, 4]
S1.runningSum(nums1)
