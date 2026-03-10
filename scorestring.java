class Solution {
    public int scoreOfString(String s) {
        char arr[]=s.toCharArray();
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
             ans=Math.abs(arr[i+1]-arr[i])+ans;
        }
        return ans;
        
    }
}

//check this link for practice : https://neetcode.io/problems/score-of-a-string/history?list=allNC&submissionIndex=2
