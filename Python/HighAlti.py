from typing import List


class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        alti = []
        altimost = 0
        sum = 0
        for g in gain:
            sum += g
            altimost = max(sum, altimost)
        print(altimost)
        return altimost
        # 不需要把结果写入数组
        # 直接sum值和0比较大小即可

        #     alti.append(sum)
        # print(alti)
        # # return alti
        # alti.append(0)
        # altimost=0
        # #海拔高度数组里面第一个值为0 除了第一个值以外 其余位gain数组第1个值，1个加2个， 1个加2个加3个 以此类推
        # # 海拔高度数组还要添加上0 然后进行排序
        #
        # # 比较时候把相邻两个数组和最大值比较 取3个里面最大的作为新的最大值
        # for a in range(0,len(alti)-1):
        #     # if alti[a]>=alti[a+1]&alti[a]>=altimost:
        #     #     altimost=alti[a]
        #     # elif alti[a+1]>=alti[a]&alti[a+1]>=altimost:
        #     #     altimost = alti[a+1]
        #     altimost = max[alti[a], alti[a + 1], altimost]
        # print(alti,altimost)
        # return altimost


S1 = Solution()
S1.largestAltitude([-5, 1, 5, 0, -7])
