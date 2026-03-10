class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num1=new int [nums.length*2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            num1[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            num1[k]=nums[i];
            k++;
        }
        return num1;
        
    }
}
//
//check this link: https://neetcode.io/problems/concatenation-of-array/history?list=allNC&submissionIndex=2
