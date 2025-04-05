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