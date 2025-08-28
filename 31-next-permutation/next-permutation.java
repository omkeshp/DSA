class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }

        }
        if(index == -1){
            int start = 0;
            while(start<n){
                int temp = nums[start];
                nums[start] = nums[n-1];
                nums[n-1] = temp;
                start++;
                n--;
            }
            System.out.println(Arrays.toString(nums));
            return;
            

        }

        for(int i = n-1; i>index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        while(index+1 < n-1){
            int temp = nums[n-1];
            nums[n-1] = nums[index+1];
            nums[index+1] = temp;
            index++;
            n--;
        }
        System.out.println(Arrays.toString(nums));
        
    }
}