class Solution {
      public void rotate(int[] nums, int k) {

        int n = nums.length;
        int [] temp = new int[n];

        k = k%n;
        for(int i = 0; i< k; i++){
            temp[i] = nums[n-k+i];

       }
        for(int i =0; i<n-k; i++){
            temp[k+i] = nums[i];
            

       }
        for(int i =0; i< n; i++){
            nums[i] = temp[i];

       }
       System.out.print(Arrays.toString(nums));
    
    }
}