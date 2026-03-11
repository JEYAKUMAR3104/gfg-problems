class Solution {
    public int[] replaceElements(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int max = -1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
//check this link:https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side/question
