class Solution {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        for(int i =0 ; i< nums.length-1; i++){
            if(i>0 &&nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            twosum(nums, target , i+1, nums.length-1);
          
        }
         return list;
    }
     public void twosum(int [] nums, int target , int i , int j){
            while(i<j){
                int sum = nums[i] + nums[j];
                if(sum < target){
                    i++;
                }else if(sum > target){
                    j--;
                }else{
                    list.add(Arrays.asList(-target , nums[i] ,nums[j]));
                    i++;
                    j--;
                    while(i<j && nums[i] == nums[i-1]){
                        i++;
                    }
                    while(i<j && nums[j] == nums[j+1]){
                        j--;
                    }
                }
            }
        }
}
