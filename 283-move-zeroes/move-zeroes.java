class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        int arr[]  = new int [n];
        int start = 0;
        if(n==1){
            System.out.println(Arrays.toString(nums));
        }

        for(int i = 0; i<n; i++){
            if(nums[i]!= 0){
                arr[start] = nums[i];
                start++;
            }
        }
        while(start<n){
            arr[start] = 0;
            start++;
        }

        for(int i = 0; i<n ; i++){
            nums[i] = arr[i];
        }

    }

}