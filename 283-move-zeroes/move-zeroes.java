class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;
        int [] temp = new int [n];
        if(n == 1){
            System.out.println(nums[0]);
        }

        for(int i = 0; i< n; i++){
            if(nums[i]!=0){
                temp[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }

        }
        while(nonZeroIndex<n){
            temp[nonZeroIndex] =0;
            nonZeroIndex++;
        }
        for(int i = 0; i<n; i++){
            nums[i] = temp[i];
        }
        
    }
}