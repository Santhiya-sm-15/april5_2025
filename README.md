# april5_2025
The problem that i solved today in leetcode

1.The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.

For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums. 

Note: Subsets with the same elements should be counted multiple times.

An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

Code:
class Solution {
    public void f(int ind,int[] nums,int xor,int[] sum)
    {
        if(ind==nums.length)
        {
            sum[0]+=xor;
            return;
        }
        f(ind+1,nums,xor^nums[ind],sum);
        f(ind+1,nums,xor,sum);
    }
    public int subsetXORSum(int[] nums) {
        int[] sum=new int[1];
        f(0,nums,0,sum);
        return sum[0];
    }
}
