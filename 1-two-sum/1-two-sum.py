class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visited = {}
        for i,val in enumerate(nums):
            remaining = target - nums[i]
            
            if remaining in visited:
                return [i,visited[remaining]]
            else:
                visited[val] = i
        