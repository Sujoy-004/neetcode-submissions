class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pdt = 1;
        int zeroCount = 0;
        for(int num : nums){
            if(num != 0){
                pdt  *= num;
            }
            else{
                zeroCount++;
            }
        }

        int n = nums.length;
        int[] res = new int[n];

        if(zeroCount == 1){
            for(int i = 0; i < n; i++){
                if(nums[i] == 0){
                    res[i] = pdt;
                }
            }
        }else if(zeroCount == 0){
            for(int i = 0; i < n; i++){
                int num = nums[i];
                res[i] = pdt / num;
            }
        }

        return res;
    }
}  
