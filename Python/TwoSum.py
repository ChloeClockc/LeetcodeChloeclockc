from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0, len(nums)):
            for j in range(i + 1, len(nums)):
                result = nums[i] + nums[j]
                if result == target:
                    print(i, j)
                    return [i, j]


s=Solution()
s.twoSum([2, 7, 11, 15], 9)
